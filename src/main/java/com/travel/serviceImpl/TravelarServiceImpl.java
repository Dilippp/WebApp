package com.travel.serviceImpl;

import org.apache.log4j.Logger;

import com.travel.service.TravelarService;

public class TravelarServiceImpl implements TravelarService {

	Logger logger = Logger.getLogger(TravelarServiceImpl.class);

	public String getTravelarRecord() {
		logger.debug("Retrieving record");
		System.out.println("getting all record!!!");
		return null;
	}

}
