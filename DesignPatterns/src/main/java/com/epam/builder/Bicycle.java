package com.epam.builder;


import java.util.Objects;


public class Bicycle{
    // Required Parameters
    private  String bicycleCompanyName;
    private  String bicycleModelName;
    private Long bicycleModelNumber;
    private Double price;
    // optional - by default it will be False - account not required
    private Boolean optInForGears;
    private Boolean optInForDoubleStands;
    private Boolean optInForDoubleSeats;
    private Boolean optInForCarrier ;


    public static BicycleBuilder builder() {
        return new BicycleBuilder();
    }

    
    
    @Override
	public String toString() {
		return "Bicycle [bicycleCompanyName=" + bicycleCompanyName + ", bicycleModelName=" + bicycleModelName
				+ ", bicycleModelNumber=" + bicycleModelNumber + ", price=" + price + ", optInForGears=" + optInForGears
				+ ", optInForDoubleStands=" + optInForDoubleStands + ", optInForDoubleSeats=" + optInForDoubleSeats
				+ ", optInForCarrier=" + optInForCarrier + "]";
	}



	public static class BicycleBuilder {
    	  // Required Parameters
        private  String bicycleCompanyName;
        private  String bicycleModelName;
        private Long bicycleModelNumber;
        private Double price;
        // optional - by default it will be False
        private Boolean optInForGears;
        private Boolean optInForDoubleStands;
        private Boolean optInForDoubleSeats;
        private Boolean optInForCarrier ;
        
        public BicycleBuilder bicycleCompanyName(final String bicycleCompanyName)
        {
        	this.bicycleCompanyName=bicycleCompanyName;
        	return this;
        }
        
        public BicycleBuilder bicycleModelName(final String bicycleModelName)
        {
        	this.bicycleModelName=bicycleModelName;
        	return this;
        }
        public BicycleBuilder bicycleModelNumber(final Long bicycleModelNumber)
        {
        	this.bicycleModelNumber=bicycleModelNumber;
        	return this;
        }
        public BicycleBuilder price(final Double price)
        {
        	this.price = price;
        	return this;
        }
        
        
        public BicycleBuilder optInForGears(final Boolean optInForGears)
        {
        	this.optInForGears = optInForGears;
        	return this;
        }
        public BicycleBuilder optInForDoubleStands(final Boolean optInForDoubleStands)
        {
        	this.optInForDoubleStands = optInForDoubleStands;
        	return this;
        }
        public BicycleBuilder optInForDoubleSeats(final Boolean optInForDoubleSeats)
        {
        	this.optInForDoubleSeats = optInForDoubleSeats;
        	return this;
        }
        public BicycleBuilder optInForCarrier(final Boolean optInForCarrier)
        {
        	this.optInForCarrier = optInForCarrier;
        	return this;
        }
        
        public Bicycle build() {
            if (!Objects.nonNull(this.bicycleCompanyName) || !Objects.nonNull(this.bicycleModelName)
                    || !Objects.nonNull(this.bicycleModelNumber) || !Objects.nonNull(this.price)) {
                throw new RuntimeException("Required parameters are missing");
            }
            Bicycle bicycle = new Bicycle();
            
           bicycle.bicycleCompanyName = bicycleCompanyName;
           bicycle.bicycleModelName = bicycleModelName;
           bicycle.bicycleModelNumber = bicycleModelNumber;
           bicycle.price = price;
           bicycle.optInForGears = optInForGears;
           bicycle.optInForDoubleStands = optInForDoubleStands;
           bicycle.optInForDoubleSeats = optInForDoubleSeats;
           bicycle.optInForCarrier = optInForCarrier;
           return bicycle;
        }
    }
}
