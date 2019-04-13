import sapienza.iot.Interfaces.ReadDoubleSensor;
import sapienza.iot.Interfaces.ReadFloatSensor;
import sapienza.iot.Interfaces.ReadIntSensor;
import sapienza.iot.Interfaces.ReadLocationSensor;

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
