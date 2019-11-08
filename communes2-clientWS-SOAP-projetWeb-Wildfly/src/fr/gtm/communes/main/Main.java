package fr.gtm.communes.main;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import fr.gtm.communes.service.Commune;
import fr.gtm.communes.service.CommuneService;
import fr.gtm.communes.service.CommuneServiceServiceLocator;
import fr.gtm.communes.service.Region;

public class Main {

	public static void main(String[] args) throws ServiceException, RemoteException {
		CommuneService service = new CommuneServiceServiceLocator().getCommuneServicePort();
		Commune[] communes = service.getCommunesByCodePostalLike("28");
		
		Commune commune = communes[1];
		Double gpsLat = commune.getGpsLatitude();
		
		System.out.println(service.convertToSexagesimal(gpsLat));
		
	}

}
