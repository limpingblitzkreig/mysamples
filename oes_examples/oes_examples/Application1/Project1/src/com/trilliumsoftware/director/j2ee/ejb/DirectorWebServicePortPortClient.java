package com.trilliumsoftware.director.j2ee.ejb;

import com.trilliumsoftware.director.j2ee.transfer.CleanseResults;
import com.trilliumsoftware.director.j2ee.transfer.CleanserInput;
import com.trilliumsoftware.director.j2ee.transfer.CleanserXMLInput;
import com.trilliumsoftware.director.j2ee.transfer.DirectorServiceException;
import com.trilliumsoftware.director.j2ee.transfer.MatchCandidateInput;
import com.trilliumsoftware.director.j2ee.transfer.MatchCandidateWithSuspectsInput;
import com.trilliumsoftware.director.j2ee.transfer.MatchResults;
import com.trilliumsoftware.director.j2ee.transfer.MatcherCandidateSuspectsXMLInput;
import com.trilliumsoftware.director.j2ee.transfer.MatcherXMLInput;

import java.net.InetSocketAddress;
import java.net.Proxy;

import java.rmi.RemoteException;

import java.security.cert.X509Certificate;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import javax.xml.rpc.Stub;

import weblogic.wsee.async.AsyncPreCallContext;
import weblogic.wsee.connection.transport.http.HttpTransportInfo;
import weblogic.wsee.security.bst.ClientBSTCredentialProvider;
import weblogic.wsee.security.unt.ClientUNTCredentialProvider;

import weblogic.xml.crypto.wss.WSSecurityContext;
import weblogic.xml.crypto.wss.provider.CredentialProvider;

@Generated("Oracle JDeveloper")
public class DirectorWebServicePortPortClient {
    private DirectorWebServicePort _port;
    private List<CredentialProvider> _credProviders;

    @Generated("Oracle JDeveloper")
    public DirectorWebServicePortPortClient() throws Exception {
        DirectorWebService service = new DirectorWebService_Impl();
        _port = service.getDirectorWebServicePort();
    }

    public static void main(String[] args) {
        try {
            DirectorWebServicePortPortClient client = new DirectorWebServicePortPortClient();
            client.setPortCredentialProviderList();
          CleanserInput input = new CleanserInput();
                      CleanseResults results;
                      String[] trillName = { "Line1", "Line3", "Line9", "FirstName",
                                      "HouseNo", "StreetAddress", "City", "State", "PostalCode",
                                      "Country" };

                      String[] updtRule = { "", "", "", "pr_first_01", "dr_house_number",
                                      "dr_street_name", "dr_city_name", "dr_st_prov_cty_name",
                                      "dr_postal_code", "window_key_01", "window_key_02","window_key_03","CandidateCode1" };
                      
                      String[] inputData = {"fred smith","25 linnell","billerica, ma"};
                      
                      //   String[] inputData = {"xxx","yyy","zzz"};

                      input.setInputData(inputData);
                      input.setTrilName(trillName);
                      input.setUpdateRule(updtRule);          
                      
                      results = client.cleanse(input);
                      
                      System.out.println("results is "+results);            
                      
                      String[] outputLength = results.getResult();
                      System.out.println("output is "+outputLength);
                      
                           int failOut = results.getFailLevel();
                        System.out.println("failOut is "+failOut);


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Generated("Oracle JDeveloper")
    public DirectorWebServicePort getPort() {
        return _port;
    }

    @Generated("Oracle JDeveloper")
    public String getEndpoint() {
        return (String) ((Stub) getPort())._getProperty(Stub.ENDPOINT_ADDRESS_PROPERTY);
    }

    @Generated("Oracle JDeveloper")
    public void setEndpoint(String endpoint) {
        ((Stub) getPort())._setProperty(Stub.ENDPOINT_ADDRESS_PROPERTY, endpoint);
    }

    @Generated("Oracle JDeveloper")
    public List<CredentialProvider> getCredentialProviderList() {
        if (_credProviders == null)
            _credProviders = new ArrayList<CredentialProvider>();

        return _credProviders;
    }

    @Generated("Oracle JDeveloper")
    public void addCredentialProvider(CredentialProvider cp) {
        getCredentialProviderList().add(cp);
    }

    @Generated("Oracle JDeveloper")
    public void setPortCredentialProviderList() {
        ((Stub) getPort())._setProperty(WSSecurityContext.CREDENTIAL_PROVIDER_LIST, getCredentialProviderList());
    }

    @Generated("Oracle JDeveloper")
    public void addUNTCredentialProvider(String username, String password) {
        CredentialProvider cp =
            new ClientUNTCredentialProvider(username.getBytes(), password.getBytes());
        addCredentialProvider(cp);
    }

    @Generated("Oracle JDeveloper")
    public void addBSTCredentialProvider(String clientKeyStore,
                                         String clientKeyStorePass,
                                         String clientKeyAlias,
                                         String clientKeyPass,
                                         X509Certificate serverCert) throws Exception {
        CredentialProvider cp =
            new ClientBSTCredentialProvider(clientKeyStore, clientKeyStorePass, clientKeyAlias, clientKeyPass, "JKS", serverCert);
        addCredentialProvider(cp);
    }

    @Generated("Oracle JDeveloper")
    public void setProxyServerInfo(String proxyHost, int proxyPort,
                                   String username, String password) {
        Proxy p = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
        HttpTransportInfo info = new HttpTransportInfo();
        info.setProxy(p);

        ((Stub) getPort())._setProperty("weblogic.wsee.connection.transportinfo", info);

        if (username != null)
            ((Stub) getPort())._setProperty("weblogic.webservice.client.proxyusername", username);

        if (password != null)
            ((Stub) getPort())._setProperty("weblogic.webservice.client.proxypassword", password);
    }

    @Generated("Oracle JDeveloper")
    public boolean getMaintainSession() {
        return ((Boolean) ((Stub) getPort())._getProperty(Stub.SESSION_MAINTAIN_PROPERTY)).booleanValue();
    }

    @Generated("Oracle JDeveloper")
    public void setMaintainSession(boolean maintainSession) {
        ((Stub) getPort())._setProperty(Stub.SESSION_MAINTAIN_PROPERTY, Boolean.valueOf(maintainSession));
    }

    @Generated("Oracle JDeveloper")
    public void setTraceFile(String string) throws RemoteException,
                                                   DirectorServiceException {
        getPort().setTraceFile(string);
    }

    @Generated("Oracle JDeveloper")
    public void setTraceFileAsync(AsyncPreCallContext apc,
                                  String string) throws RemoteException {
        getPort().setTraceFileAsync(apc, string);
    }

    @Generated("Oracle JDeveloper")
    public void setTraceOff() throws RemoteException,
                                     DirectorServiceException {
        getPort().setTraceOff();
    }

    @Generated("Oracle JDeveloper")
    public void setTraceOffAsync(AsyncPreCallContext apc) throws RemoteException {
        getPort().setTraceOffAsync(apc);
    }

    @Generated("Oracle JDeveloper")
    public void setTraceOn() throws RemoteException, DirectorServiceException {
        getPort().setTraceOn();
    }

    @Generated("Oracle JDeveloper")
    public void setTraceOnAsync(AsyncPreCallContext apc) throws RemoteException {
        getPort().setTraceOnAsync(apc);
    }

    @Generated("Oracle JDeveloper")
    public CleanseResults cleanse(CleanserInput cleanserInput) throws RemoteException,
                                                                      DirectorServiceException {
        return getPort().cleanse(cleanserInput);
    }

    @Generated("Oracle JDeveloper")
    public void cleanseAsync(AsyncPreCallContext apc,
                             CleanserInput cleanserInput) throws RemoteException {
        getPort().cleanseAsync(apc, cleanserInput);
    }

    @Generated("Oracle JDeveloper")
    public MatchResults matchCandidate(MatchCandidateInput matchCandidateInput) throws RemoteException,
                                                                                       DirectorServiceException {
        return getPort().matchCandidate(matchCandidateInput);
    }

    @Generated("Oracle JDeveloper")
    public void matchCandidateAsync(AsyncPreCallContext apc,
                                    MatchCandidateInput matchCandidateInput) throws RemoteException {
        getPort().matchCandidateAsync(apc, matchCandidateInput);
    }

    @Generated("Oracle JDeveloper")
    public MatchResults matchCandidateWithSuspects(MatchCandidateWithSuspectsInput matchCandidateWithSuspectsInput) throws RemoteException,
                                                                                                                           DirectorServiceException {
        return getPort().matchCandidateWithSuspects(matchCandidateWithSuspectsInput);
    }

    @Generated("Oracle JDeveloper")
    public void matchCandidateWithSuspectsAsync(AsyncPreCallContext apc,
                                                MatchCandidateWithSuspectsInput matchCandidateWithSuspectsInput) throws RemoteException {
        getPort().matchCandidateWithSuspectsAsync(apc, matchCandidateWithSuspectsInput);
    }

    @Generated("Oracle JDeveloper")
    public String cleanseXML(CleanserXMLInput cleanserXMLInput) throws RemoteException,
                                                                       DirectorServiceException {
        return getPort().cleanseXML(cleanserXMLInput);
    }

    @Generated("Oracle JDeveloper")
    public void cleanseXMLAsync(AsyncPreCallContext apc,
                                CleanserXMLInput cleanserXMLInput) throws RemoteException {
        getPort().cleanseXMLAsync(apc, cleanserXMLInput);
    }

    @Generated("Oracle JDeveloper")
    public String matchCandidateWithSuspectsXML(MatcherCandidateSuspectsXMLInput matcherCandidateSuspectsXMLInput) throws RemoteException,
                                                                                                                          DirectorServiceException {
        return getPort().matchCandidateWithSuspectsXML(matcherCandidateSuspectsXMLInput);
    }

    @Generated("Oracle JDeveloper")
    public void matchCandidateWithSuspectsXMLAsync(AsyncPreCallContext apc,
                                                   MatcherCandidateSuspectsXMLInput matcherCandidateSuspectsXMLInput) throws RemoteException {
        getPort().matchCandidateWithSuspectsXMLAsync(apc, matcherCandidateSuspectsXMLInput);
    }

    @Generated("Oracle JDeveloper")
    public String matchCandidateXML(MatcherXMLInput matcherXMLInput) throws RemoteException,
                                                                            DirectorServiceException {
        return getPort().matchCandidateXML(matcherXMLInput);
    }

    @Generated("Oracle JDeveloper")
    public void matchCandidateXMLAsync(AsyncPreCallContext apc,
                                       MatcherXMLInput matcherXMLInput) throws RemoteException {
        getPort().matchCandidateXMLAsync(apc, matcherXMLInput);
    }

    @Generated("Oracle JDeveloper")
    public void setTraceFile0(String string) throws RemoteException,
                                                    DirectorServiceException {
        getPort().setTraceFile0(string);
    }

    @Generated("Oracle JDeveloper")
    public void setTraceFile0Async(AsyncPreCallContext apc,
                                   String string) throws RemoteException {
        getPort().setTraceFile0Async(apc, string);
    }

    @Generated("Oracle JDeveloper")
    public void setTraceOff0() throws RemoteException,
                                      DirectorServiceException {
        getPort().setTraceOff0();
    }

    @Generated("Oracle JDeveloper")
    public void setTraceOff0Async(AsyncPreCallContext apc) throws RemoteException {
        getPort().setTraceOff0Async(apc);
    }

    @Generated("Oracle JDeveloper")
    public void setTraceOn0() throws RemoteException,
                                     DirectorServiceException {
        getPort().setTraceOn0();
    }

    @Generated("Oracle JDeveloper")
    public void setTraceOn0Async(AsyncPreCallContext apc) throws RemoteException {
        getPort().setTraceOn0Async(apc);
    }
}
