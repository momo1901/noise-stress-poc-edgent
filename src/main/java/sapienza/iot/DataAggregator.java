package sapienza.iot;

import com.google.gson.JsonObject;
import org.apache.edgent.function.Supplier;
import sapienza.iot.Interfaces.ReadDoubleSensor;
import sapienza.iot.Interfaces.ReadFloatSensor;
import sapienza.iot.Interfaces.ReadIntSensor;
import sapienza.iot.Interfaces.ReadLocationSensor;

import java.time.LocalDateTime;


public class DataAggregator implements Supplier<JsonObject> {

    private ReadFloatDecibels decibelValue; 



    // Constructor
    public DataAggregator(DataBuilder builder) {
        this.decibelValue = builder.getDecibelValue();
        
    }


    @Override
    public JsonObject get() {
        Double dbvalue = this.decibelValue.getDecibelValue();
        String date = LocalDateTime.now().toString();


        JsonObject obj = new JsonObject();
        obj.addProperty("date", date);
        if (dbvalue == null || dbvalue == null) {
            obj.add("decibel", null);
        } else {
            obj.add("decibel", dbvalue);
        }

        return obj;
    }
}
