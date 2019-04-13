import sapienza.iot.Interfaces.ReadFloatSensor;
import sapienza.iot.Interfaces.ReadIntSensor;

public class ReadSensorTest implements  ReadFloatSensor, ReadIntSensor {
    @Override
    public Integer getInt() {
        return 9;
    }

    @Override
    public Float getFloat() {
        return 10.5f;
    }

}
