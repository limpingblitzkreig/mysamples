package nl.whitehorses.clientosb.jms;

/**
 * Generated class, do not edit.
 *
 * This service interface was generated by weblogic
 * webservice stub gen on Mon Sep 06 20:15:02 CEST 2010  
 */

public interface HelloWorldServiceSoapHttpPortBindingQSService extends javax.xml.rpc.Service {

  weblogic.wsee.context.WebServiceContext context();

  weblogic.wsee.context.WebServiceContext joinContext()
       throws weblogic.wsee.context.ContextNotFoundException;
 
     

     //***********************************
     // Port Name: HelloWorldServiceSoapHttpPortBindingQSPort  
     // Port Type: HelloWorldService   
     //***********************************
     
  /**
   * returns HelloWorldServiceSoapHttpPortBindingQSPort port in this service 
   */
  nl.whitehorses.clientosb.jms.HelloWorldService getHelloWorldServiceSoapHttpPortBindingQSPort() throws javax.xml.rpc.ServiceException;

  /**
   * @deprecated Use getHelloWorldServiceSoapHttpPortBindingQSPort(byte[] username, byte[] password);
   */
  nl.whitehorses.clientosb.jms.HelloWorldService getHelloWorldServiceSoapHttpPortBindingQSPort(String username, String password) throws javax.xml.rpc.ServiceException;

  nl.whitehorses.clientosb.jms.HelloWorldService getHelloWorldServiceSoapHttpPortBindingQSPort(byte[] username, byte[] password) throws javax.xml.rpc.ServiceException;
  
    
  }