package uk.gov.ons.fsdr.common.util;

import org.springframework.util.DigestUtils;
import uk.gov.ons.fsdr.common.exception.FsdrException;

import javax.xml.bind.DatatypeConverter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class HashUtil {

  private HashUtil() {}

  public static String getHash(Serializable object) throws FsdrException {
    try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos)) {
      oos.writeObject(object);
      byte[] thedigest = DigestUtils.md5Digest(baos.toByteArray());
      return DatatypeConverter.printHexBinary(thedigest);
    } catch(IOException e) {
      throw new FsdrException("Failed to create hash", e);
    }
  }
}
