package sapienza.iot;

import com.google.gson.JsonObject;
import org.apache.edgent.function.Supplier;
import sapienza.iot.Interfaces.ReadFloatSensor;
import sapienza.iot.Interfaces.ReadIntSensor;


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
        Integer min = null;
        if (minSensor != null) this.minSensor.getInt();
        Integer max = null;
        if (maxSensor != null) this.maxSensor.getInt();
        Integer avg = null;
        if (avgSensor != null) this.avgSensor.getInt();
        Integer realtime = null;
        if (realtimeSensor != null) this.realtimeSensor.getInt();
        Float db = null;
        if (dbSensor != null) this.dbSensor.getFloat();
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
