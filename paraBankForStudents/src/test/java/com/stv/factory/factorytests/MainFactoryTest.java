package com.stv.factory.factorytests;


import com.stv.factory.factorypages.*;
import org.junit.runner.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.management.Descriptor;
import java.time.Duration;

import static com.stv.framework.core.utils.Waiters.waitForElementVisible;


public class MainFactoryTest extends BasicFactoryTest {

    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @Test(description = "Assert the main page is loaded and main logo is visible")
    public void assertAccountIconIsDisplayed() {
        boolean actualResult = mainFactoryPage.isMainLogoDisplayed();
        Assert.assertEquals(actualResult, true, "Main Logo isn't visible");
    }

    /**
     * AUTOMATION TESTING TASK 3
     */

    @Test(description = "Error Message is displayed", dependsOnMethods = "assertAccountIconIsDisplayed")
    public void testErrorEmptyUsername() {
        String username = "";
        String password = "123456";
        mainFactoryPage.EnterUsername(username);
        mainFactoryPage.EnterPassword(password);
        mainFactoryPage.clickOnLogIn();
        Assert.assertEquals(mainFactoryPage.isErrorMessage(), true, "There is no Error Message");
    }

    @Test(description = "Unregistered user can't login as admin")
    public void UnregisteredUserEnterError() {
        String username = "Greg";
        String password = "qweerty";
        mainFactoryPage.clickOnAdminLogo();
        mainFactoryPage.EnterUsername(username);
        mainFactoryPage.EnterPassword(password);
        mainFactoryPage.clickOnLogIn();
        Assert.assertEquals(mainFactoryPage.isErrorMessage(), true, "");
    }

/**
 * AUTOMATION TASK FINAL
 * forgot login info page
 */

    @Test(description = "Check Customer LookUp Page with empty requiered fields then filled with unregistered user")
    public void testFinalProject() {

        String firstname = "anna";
        String lastname = "qweerty";
        String street = "ul.star";
        String city = "Minsk";
        String state = "Minsk";
        String zipcode = "220000";
        String ssn = "123456";

        mainFactoryPage.clickOnForgotLoginInfo();
        mainFactoryPage.CustomerLookUpPage();

        mainFactoryPage.clickOnFindLoginInfoButton();
        mainFactoryPage.AllRequiredFieldsEmptyError();

        mainFactoryPage.EnterFirstName(firstname);
        mainFactoryPage.EnterLastName(lastname);
        mainFactoryPage.EnterStreet(street);
        mainFactoryPage.EnterCity(city);
        mainFactoryPage.EnterState(state);
        mainFactoryPage.EnterZipcode(zipcode);
        mainFactoryPage.EnterSSN(ssn);

        mainFactoryPage.clickOnFindLoginInfoButton();

        Assert.assertEquals(mainFactoryPage.isErrorMessage(), true, "There is not a such user");


    }


}
