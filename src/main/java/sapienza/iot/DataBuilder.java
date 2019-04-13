package sapienza.iot;

import sapienza.iot.Interfaces.ReadFloatDecibels;



public class DataBuilder {
	private ReadFloatDecibels decibels;
     public DataBuilder() {

    }

    public void getDecibelValue(Double decibelValue) {
        this.decibels = decibelValue;
    }


    public DataAggregator build() {
        return new DataAggregator(this);
    }
}