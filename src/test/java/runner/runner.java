 package runner;
import pages.BasePage;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
      features = "src/test/resources/features",
     plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/cucumber-reports.json"},
      monochrome = true,
      glue = "steps",
      tags = "@lista"
)
// se corre asi: gradle test -D cucumber.filter.tags="@lista"
public class runner {
      
        @AfterClass
      public static void cleanBrowser(){
            
          BasePage.CloseNavegate();
      }  
}
