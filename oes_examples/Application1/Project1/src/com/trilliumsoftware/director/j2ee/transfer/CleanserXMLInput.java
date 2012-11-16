/**
 * Generated from schema type t=CleanserXMLInput@java:com.trilliumsoftware.director.j2ee.transfer
 */
package com.trilliumsoftware.director.j2ee.transfer;

public class CleanserXMLInput implements java.io.Serializable {

  private java.lang.String rootTag;

  public java.lang.String getRootTag() {
    return this.rootTag;
  }

  public void setRootTag(java.lang.String rootTag) {
    this.rootTag = rootTag;
  }

  private com.trilliumsoftware.director.j2ee.transfer.DirectorServer server;

  public com.trilliumsoftware.director.j2ee.transfer.DirectorServer getServer() {
    return this.server;
  }

  public void setServer(com.trilliumsoftware.director.j2ee.transfer.DirectorServer server) {
    this.server = server;
  }

  private java.lang.String xml;

  public java.lang.String getXml() {
    return this.xml;
  }

  public void setXml(java.lang.String xml) {
    this.xml = xml;
  }

}
