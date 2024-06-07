package com.stv.bdd.steps;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Before;
import com.stv.framework.core.drivers.MyDriver;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static com.stv.framework.core.lib.ParaBankPageURLs.START_URL;

public class MainStep extends BasicFactoryTest {
    public static WebDriver getDriver() {
        return MyDriver.getDriver();
    }

    WebDriver driver = getDriver();

    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @Before
    public void beforeClass() {
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @Given("^The home page Parasoft Parabank$")
    public void homePage() {
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @When("^The user clicks Forgot Login info link$")
    public void clickForgotLogin() {
        mainFactoryPage.clickOnForgotLoginInfo();
    }
    @Then("The Customer Lookup Page is loaded")
    public void theCustomerLookupPageIsLoaded() {
        mainFactoryPage.CustomerLookUpPage();
    }

    @Given("^The Customer Lookup Page$")
    public void isCustomerLookUpPage() {
        driver.get("https://parabank.parasoft.com/parabank/lookup.htm");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @When("^The user clicks on 'Find my login info' button$")
    public void clickOnFindLogin() {
        mainFactoryPage.clickOnFindLoginInfoButton();
    }
    @And("^The validation errors appear next to all required fields$")
    public void errorRequiredfields() {
        mainFactoryPage.AllRequiredFieldsEmptyError();
    }
    @And("The user enters data in firstname {string}")
    public void fillFirstname(String firstname) {
        mainFactoryPage.EnterFirstName(firstname);
    }
    @And("The User enters data in lastname {string}")
    public void fillLastname(String lastname) {
        mainFactoryPage.EnterLastName(lastname);
    }

    @And("The user enters data in address {string}")
    public void FillStreet(String street) {
        mainFactoryPage.EnterStreet(street);
    }

    @And("The user enters data in city {string}")
    public void fillCity(String city) {
        mainFactoryPage.EnterCity(city);
    }

    @And("The user enters data in state {string}")
    public void fillState(String state) {
        mainFactoryPage.EnterState(state);
    }

    @And("The user enters data in zipcode {string}")
    public void fillZipCode(String zipcode) {
        mainFactoryPage.EnterZipcode(zipcode);
    }

    @And("The user enters data in SSN {string}")
    public void fillSSN(String ssn) {
        mainFactoryPage.EnterSSN(ssn);
    }

    @And("The user clicks Find my login info button$")
    public void clickOnFindLoginButton() {
        mainFactoryPage.clickOnFindLoginInfoButton();
    }

    @Then("The page error the user not found is loaded")
    public void thePageErrorTheUserNotFoundIsLoaded() {
        mainFactoryPage.isErrorMessage();
    }


//    @After
//    public void afterClass() throws Exception {
//        getDriver().quit();
//    }


}
