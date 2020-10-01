package uk.gov.ons.fsdr.common.util;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class JsonCompareUtil {
  private static ObjectMapper objectMapper = new ObjectMapper();

  public static boolean isEquals(String expectedJson, String actualJson, String... ignoredKeys) {
    try {
      DocumentContext expectedDocument = JsonPath.parse(expectedJson);
      DocumentContext actualDocument = JsonPath.parse(actualJson);
      
      if (ignoredKeys!=null) {
        for (int i = 0; i < ignoredKeys.length; i++) {
          String actualValue = actualDocument.read(ignoredKeys[i]);
//          expectedDocument.delete(ignoredKeys[i]);
          expectedDocument.set(ignoredKeys[i], actualValue);
        }
      }      
      
      JsonNode expectedJsonNode = objectMapper.readTree(expectedDocument.jsonString());
      JsonNode actualJsonNode = objectMapper.readTree(actualDocument.jsonString());
      
      
      String expectedPretty = expectedJsonNode.toPrettyString();
      String actualPretty = actualJsonNode.toPrettyString();

      List<String> expectedAsList = Arrays.asList(expectedPretty.split("\n"));
      List<String> actualAsList = Arrays.asList(actualPretty.split("\n"));
 
      boolean isEqual = expectedJsonNode.equals(actualJsonNode);
      if (isEqual) {
        return true;
      }else{
        System.out.println("expected and actual caseEvents are not the same:");

        int maxExpected = 0;
        for (String line : expectedAsList) {
          if (line.length() > maxExpected)
            maxExpected = line.length();
        }
        int maxActual = 0;
        for (String line : actualAsList) {
          if (line.length() > maxActual)
            maxActual = line.length();
        }

        int maxSize = (expectedAsList.size() >= actualAsList.size()) ? expectedAsList.size() : actualAsList.size();

        StringBuilder sb = new StringBuilder();

        FixedPointFormatText fp = new FixedPointFormatText(maxActual+maxExpected+5);
        fp.clearLine();
        fp.addStringToLine("EXPECTED", 0, maxExpected);
        fp.addStringToLine("ACTUAL", maxExpected + 2, maxActual);
        sb.append(fp.getLine()).append("\n");

        for (int i = 0; i < maxSize; i++) {
          fp.clearLine();
          if (i < expectedAsList.size()) {
            fp.addStringToLine(expectedAsList.get(i), 0, maxExpected);
          } else {
            fp.addStringToLine("", 0, maxExpected);
          }
          if (i < actualAsList.size()) {
            fp.addStringToLine(actualAsList.get(i), maxExpected + 2, maxActual);
          } else {
            fp.addStringToLine("", 0, maxExpected);
          }

          sb.append(fp.getLine()).append("\n");
        }
        System.out.println(sb.toString());
        return false;
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
  
  public static boolean matches(String actualJson, String path, String regEx) {
    DocumentContext actualDocument = JsonPath.parse(actualJson);
    String value = actualDocument.read(path);
    return value.matches(regEx);
  }
}
