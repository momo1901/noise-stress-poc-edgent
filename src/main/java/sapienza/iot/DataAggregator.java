package sapienza.iot;

import com.google.gson.JsonObject;
import org.apache.edgent.function.Supplier;
import sapienza.iot.Interfaces.ReadDoubleSensor;
import sapienza.iot.Interfaces.ReadFloatSensor;
import sapienza.iot.Interfaces.ReadIntSensor;
import sapienza.iot.Interfaces.ReadLocationSensor;

import java.time.LocalDateTime;


public class DataAggregator implements Supplier<JsonObject> {

    private ReadFloatSensor dbSensor;
    private ReadIntSensor avgSensor;
    private ReadIntSensor minSensor;
    private ReadIntSensor maxSensor;
    private ReadIntSensor realtimeSensor;

    // Constructor
    public DataAggregator(DataBuilder builder) {
        this.dbSensor = builder.getDbSensor();
        this.avgSensor = builder.getAvgSensor();
        this.minSensor = builder.getMinSensor();
        this.maxSensor = builder.getMaxSensor();
        this.realtimeSensor = builder.getRealtimeSensor();
    }


    @Override
    public JsonObject get() {
        Integer min = this.minSensor.getInt();
        Integer max = this.maxSensor.getInt();
        Integer avg = this.avgSensor.getInt();
        Integer realtime = this.realtimeSensor.getInt();
        Float db = this.dbSensor.getFloat();
        JsonObject obj = new JsonObject();
        if (db == null)
            obj.add("db", null);
        else
            obj.addProperty("throttle", db);
        if (max == null)
            obj.add("max", null);
        else
            obj.addProperty("max", max);
        if (min == null)
            obj.add("min", null);
        else
            obj.addProperty("min", min);
        if (avg == null)
            obj.add("avg", null);
        else
            obj.addProperty("avg", avg);
        if (realtime == null)
            obj.add("realtime", null);
        else
            obj.addProperty("realtime", realtime);

        return obj;
    }
}
