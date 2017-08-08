import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * Created by davida on 07/08/2017
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber"},
        features = "/Users/davida/IdeaProjects/CasinoWeb/src/test/java/Feature"
        )
public class runTest {
        @BeforeClass
        public static void before() {
                initBrowser.start();
        }

        @AfterClass
        public static void stop () {
                initBrowser.stop();
        }
}
