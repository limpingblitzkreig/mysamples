/**
 * Generated from schema type t=MatcherInput@java:com.trilliumsoftware.director.j2ee.transfer
 */
package com.trilliumsoftware.director.j2ee.transfer;

public class MatcherInput implements java.io.Serializable {

  private com.trilliumsoftware.director.j2ee.transfer.MatchFields matchCandidate;

  public com.trilliumsoftware.director.j2ee.transfer.MatchFields getMatchCandidate() {
    return this.matchCandidate;
  }

  public void setMatchCandidate(com.trilliumsoftware.director.j2ee.transfer.MatchFields matchCandidate) {
    this.matchCandidate = matchCandidate;
  }

  private com.trilliumsoftware.director.j2ee.transfer.MatchRecords matchWindow;

  public com.trilliumsoftware.director.j2ee.transfer.MatchRecords getMatchWindow() {
    return this.matchWindow;
  }

  public void setMatchWindow(com.trilliumsoftware.director.j2ee.transfer.MatchRecords matchWindow) {
    this.matchWindow = matchWindow;
  }

  private com.trilliumsoftware.director.j2ee.transfer.DirectorServer server;

  public com.trilliumsoftware.director.j2ee.transfer.DirectorServer getServer() {
    return this.server;
  }

  public void setServer(com.trilliumsoftware.director.j2ee.transfer.DirectorServer server) {
    this.server = server;
  }

}
