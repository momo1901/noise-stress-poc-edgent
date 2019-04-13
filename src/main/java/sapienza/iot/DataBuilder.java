package sapienza.iot;

import sapienza.iot.Interfaces.ReadFloatSensor;
import sapienza.iot.Interfaces.ReadIntSensor;

public class DataBuilder {
    private ReadFloatSensor dbSensor;
    private ReadIntSensor avgSensor;
    private ReadIntSensor minSensor;
    private ReadIntSensor maxSensor;
    private ReadIntSensor realtimeSensor;

    public DataBuilder() {

    }

    public ReadFloatSensor getDbSensor() {
        return dbSensor;
    }

    public void setDbSensor(ReadFloatSensor dbSensor) {
        this.dbSensor = dbSensor;
    }

    public ReadIntSensor getAvgSensor() {
        return avgSensor;
    }

    public void setAvgSensor(ReadIntSensor avgSensor) {
        this.avgSensor = avgSensor;
    }

    public ReadIntSensor getMinSensor() {
        return minSensor;
    }

    public void setMinSensor(ReadIntSensor minSensor) {
        this.minSensor = minSensor;
    }

    public ReadIntSensor getMaxSensor() {
        return maxSensor;
    }

    public void setMaxSensor(ReadIntSensor maxSensor) {
        this.maxSensor = maxSensor;
    }

    public ReadIntSensor getRealtimeSensor() {
        return realtimeSensor;
    }

    public void setRealtimeSensor(ReadIntSensor realtimeSensor) {
        this.realtimeSensor = realtimeSensor;
    }

    public DataAggregator build() {
        return new DataAggregator(this);
    }
}