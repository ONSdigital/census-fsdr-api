package uk.gov.ons.fsdr.common.exception;

public class RestClientError extends RuntimeException {
  public RestClientError(String errorMessage) {
    super(errorMessage);
  }
}
