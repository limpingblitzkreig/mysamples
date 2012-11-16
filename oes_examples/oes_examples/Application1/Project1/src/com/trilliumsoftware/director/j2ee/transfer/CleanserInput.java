/**
 * Generated from schema type t=CleanserInput@java:com.trilliumsoftware.director.j2ee.transfer
 */
package com.trilliumsoftware.director.j2ee.transfer;

public class CleanserInput implements java.io.Serializable {

  private java.lang.String[] inputData;

  public java.lang.String[] getInputData() {
    return this.inputData;
  }

  public void setInputData(java.lang.String[] inputData) {
    this.inputData = inputData;
  }

  private com.trilliumsoftware.director.j2ee.transfer.DirectorServer server;

  public com.trilliumsoftware.director.j2ee.transfer.DirectorServer getServer() {
    return this.server;
  }

  public void setServer(com.trilliumsoftware.director.j2ee.transfer.DirectorServer server) {
    this.server = server;
  }

  private java.lang.String[] trilName;

  public java.lang.String[] getTrilName() {
    return this.trilName;
  }

  public void setTrilName(java.lang.String[] trilName) {
    this.trilName = trilName;
  }

  private java.lang.String[] updateRule;

  public java.lang.String[] getUpdateRule() {
    return this.updateRule;
  }

  public void setUpdateRule(java.lang.String[] updateRule) {
    this.updateRule = updateRule;
  }

}
