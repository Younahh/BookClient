/**
 * GestionServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class GestionServiceLocator extends org.apache.axis.client.Service implements ws.GestionService {

    public GestionServiceLocator() {
    }


    public GestionServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GestionServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Gestion
    private java.lang.String Gestion_address = "http://localhost:8989/E-CommerceWS/services/Gestion";

    public java.lang.String getGestionAddress() {
        return Gestion_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GestionWSDDServiceName = "Gestion";

    public java.lang.String getGestionWSDDServiceName() {
        return GestionWSDDServiceName;
    }

    public void setGestionWSDDServiceName(java.lang.String name) {
        GestionWSDDServiceName = name;
    }

    public ws.Gestion getGestion() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Gestion_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGestion(endpoint);
    }

    public ws.Gestion getGestion(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.GestionSoapBindingStub _stub = new ws.GestionSoapBindingStub(portAddress, this);
            _stub.setPortName(getGestionWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGestionEndpointAddress(java.lang.String address) {
        Gestion_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.Gestion.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.GestionSoapBindingStub _stub = new ws.GestionSoapBindingStub(new java.net.URL(Gestion_address), this);
                _stub.setPortName(getGestionWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Gestion".equals(inputPortName)) {
            return getGestion();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws", "GestionService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws", "Gestion"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Gestion".equals(portName)) {
            setGestionEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
