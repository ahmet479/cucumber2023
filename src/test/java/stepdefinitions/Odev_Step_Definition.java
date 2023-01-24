package stepdefinitions;

import io.cucumber.java.en.*;
import pages.DefaultPage;
import pages.LoginPage;
import pages.OdevDatatabesPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Odev_Step_Definition {
    LoginPage loginPage = new LoginPage();
    DefaultPage defaultPage = new DefaultPage();
    OdevDatatabesPage odevDatatabesPage =new OdevDatatabesPage();

    @Given("kullanici new button’a Click eder")
    public void kullanici_new_button_a_click_eder() {
        Driver.getDriver().get(ConfigReader.getProperty("odev_url_new"));
        odevDatatabesPage.addDataTablesNev.click();

    }
    @When("kullanıcı tüm fields girer")
    public void kullanıcı_tüm_fields_girer() {


    }
    @When("kullanıcı create buttona click eder")
    public void kullanıcı_create_buttona_click_eder() {

    }
    @When("kullanıcı first name arar")
    public void kullanıcı_first_name_arar() {

    }
    @Then("name fields’in first name içerdiğini verify eder")
    public void name_fields_in_first_name_içerdiğini_verify_eder() {

    }
}
