package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
//Cucumber'da hook class ne demektir

 //hooks Before ve After annotationlari sahiptir
 //hooks her bir Scenario'dan once(Before) veya sonra(After) calisir
  //@After'da nelrin var?
  //Cucumber'da @After hooks'ta report ve screenShot alirim
  //Hooks'u ben dizayn ederim ve test scenario  basarisiz oldugunda screenshot alirim

  @Before
  public void setUp(){
      System.out.println("Bu bir hooks @Before methodudur");
  }
  @After
    public void tearDown(Scenario scenario){
    System.out.println("Bu bir hooks @After methodudur");
      //screen almak icin:getScreenshotAs() screenShot alacaktir
//    final byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//
//      //screenShot'i scenario raporuna ekle
//
//    if (scenario.isFailed()){
//
//      scenario.attach(screenShot, "image/png", "screenShot");
//
//    }

  }
}
