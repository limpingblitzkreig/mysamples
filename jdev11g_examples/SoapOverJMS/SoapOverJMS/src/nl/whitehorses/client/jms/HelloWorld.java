package nl.whitehorses.client.jms;

/**
 * Generated interface, do not edit.
 *
 * This stub interface was generated by weblogic
 * webservice stub gen on Sun Aug 01 00:33:34 CEST 2010  
 */

public interface HelloWorld extends java.rmi.Remote {
     
  /**
   * Operation Name : {http://nl/whitehorses/ws/jms}sayHello   */

  public java.lang.String sayHello(java.lang.String message) throws java.rmi.RemoteException;
    public void sayHelloAsync(weblogic.wsee.async.AsyncPreCallContext apc, java.lang.String message) throws java.rmi.RemoteException ;
  
}