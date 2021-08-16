import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PhantomJS implements DriverStrategy{

    public WebDriver setStrategy() {
        System.setProperty("phantomjs.binary.path", "src/main/resources/pàhntom.exe");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        PhantomJS driver = 
        return new PhantomJS();
    }
}
