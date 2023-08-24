package com.epam.builder;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class BicycleReservationApp{
	
	static Logger logger = LogManager.getLogger(BicycleReservationApp.class);
public static void main(String[] args) {
	
	
	
	Bicycle atlasDualGearedBicycle = Bicycle.builder()
			.bicycleCompanyName("Atlas")
			.bicycleModelName("H123k")
			.bicycleModelNumber(12234L)
			.price(5000.0)
			.optInForGears(true)
			.optInForDoubleStands(false)
			.optInForDoubleSeats(true)
			.optInForCarrier(false)
			.build();
	System.out.println(atlasDualGearedBicycle);
	logger.info(atlasDualGearedBicycle);
	
	Bicycle heroDualGearedDualSeatedBicycle = Bicycle.builder()
			.bicycleCompanyName("Hero")
			.bicycleModelName("A123k")
			.bicycleModelNumber(2342234L)
			.price(76839.0)
			.optInForGears(true)
			.optInForDoubleStands(false)
			.optInForDoubleSeats(true)
			.optInForCarrier(false)
			.build();
	
	System.out.println(heroDualGearedDualSeatedBicycle);
	logger.info(heroDualGearedDualSeatedBicycle);
	
}
}
