import org.junit.Test;
import sapienza.iot.DataBuilder;
import sapienza.iot.EdgentApp;
import java.util.Properties;

import static org.junit.Assert.*;

public class DataSenderTest {

    public void InitEdgentApp() {
        ReadSensorImpl sensor = new ReadSensorImpl();
        DataBuilder builder = new DataBuilder();
        builder.getDecibels(sensor)
       
        Properties prop = new Properties();

        prop.setProperty("org", "adp38s");
        prop.setProperty("type", "myfitbit");
        prop.setProperty("id", "CDDF5606C2D2");
        prop.setProperty("auth-method", "token");
        prop.setProperty("auth-token", "Xt2mzHfoYKLQAd)vUN");

        EdgentApp.init(prop, builder);

        while(true){}

    }
}