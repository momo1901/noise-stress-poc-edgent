import org.junit.Test;
import sapienza.iot.DataBuilder;
import sapienza.iot.EdgentApp;
import java.util.Properties;

public class DataSenderTest {

    @Test //Fill properties fields with specific device info
    public void InitEdgentApp() {
        ReadSensorTest sensor = new ReadSensorTest();
        DataBuilder builder = new DataBuilder();
        builder.setMinSensor(sensor);
        builder.setMaxSensor(sensor);
        builder.setAvgSensor(sensor);
        builder.setDbSensor(sensor);
        builder.setRealtimeSensor(sensor);

        Properties prop = new Properties();

        prop.setProperty("org", "adp38s");
        prop.setProperty("type", "noisemonitordevice");
        prop.setProperty("id", "noisemonitordevice");
        prop.setProperty("auth-method", "token");
        prop.setProperty("auth-token", "");

        EdgentApp.init(prop, builder);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
