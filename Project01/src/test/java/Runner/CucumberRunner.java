package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/Feature/TC_01_XYZ.feature","src/test/resources/Feature/TC_02_XYZ.feature"},
        glue = {"StepDefination"},   monochrome = true,
        dryRun = false,
        plugin ={ "pretty","html:build/reports/xYZbank.html"
        })
@Test
class CucumberRunner extends AbstractTestNGCucumberTests{
}