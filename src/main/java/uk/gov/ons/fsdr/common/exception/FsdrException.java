package uk.gov.ons.fsdr.common.exception;

public class FsdrException extends RuntimeException {

  public FsdrException(String errorMessage) {
    super(errorMessage);
  }

  public FsdrException(String errorMessage, Throwable cause) {
      super(errorMessage, cause);
  }
}
