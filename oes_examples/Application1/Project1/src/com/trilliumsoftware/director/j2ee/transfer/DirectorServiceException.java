/**
 * Generated from schema type t=DirectorServiceException@java:com.trilliumsoftware.director.j2ee.transfer
 */
package com.trilliumsoftware.director.j2ee.transfer;

public class DirectorServiceException extends java.lang.Exception {

  private java.lang.Integer directorStatusCode;

  public java.lang.Integer getDirectorStatusCode() {
    return this.directorStatusCode;
  }

  private java.lang.String message;

  public java.lang.String getMessage() {
    return this.message;
  }

  public DirectorServiceException() {
  }

  public DirectorServiceException(java.lang.Integer directorStatusCode, java.lang.String message) {
    this.directorStatusCode = directorStatusCode;
    this.message = message;
  }

}
