/**
 * CommuneService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.gtm.communes.service;

public interface CommuneService extends java.rmi.Remote {
    public fr.gtm.communes.service.Region[] getRegions() throws java.rmi.RemoteException;
    public fr.gtm.communes.service.Commune[] getCommunesByCodePostalLike(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String convertToSexagesimal(double arg0) throws java.rmi.RemoteException;
}
