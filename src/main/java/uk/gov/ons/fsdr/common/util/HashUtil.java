package uk.gov.ons.fsdr.common.util;

import uk.gov.ons.fsdr.common.exception.FsdrException;

import javax.xml.bind.DatatypeConverter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashUtil {

  private HashUtil() {}

  public static String getHash(Serializable object) throws FsdrException {
    try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos)) {
      oos.writeObject(object);
      byte[] thedigest = MessageDigest.getInstance("MD5").digest(baos.toByteArray());
      return DatatypeConverter.printHexBinary(thedigest);
    } catch(NoSuchAlgorithmException | IOException e) {
      throw new FsdrException("Failed to create hash", e);
    }
  }
}
