package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainFactoryPage extends FactoryPage {

    @FindBy(css = "img.admin")
    private WebElement adminLogo;

    @FindBy(css = "img[alt='ParaBank']")
    private WebElement parabankLogo;

    @FindBy(xpath = "//h1[contains(text(),'Administration')]")
    private WebElement adminRightPanel;

    public WebElement getAdminLogo() {
        return adminLogo;
    }

    public void clickOnAdminLogo() {
        adminLogo.click();
    }

    public boolean isMainLogoDisplayed() {
        return parabankLogo.isDisplayed();
    }

    public boolean isAdminPanelDisplayed() {
        return adminRightPanel.isDisplayed();
    }


    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameLogin;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordLogin;

    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement loginButton;

    @FindBy(xpath = "//p[@class='error']")
    private WebElement errorMessage;

    @FindBy(xpath = "//a[contains(text(),'Forgot login info?')]")
    private WebElement forgotButton;


    @FindBy(xpath = "//table[@class='form2']")
    private WebElement CustomerLookUpForm;

    @FindBy(xpath = "//input[@value='Find My Login Info']")
    private WebElement FindLoginInfoButton;

    @FindBy(xpath = "//span[@id='firstName.errors']")
    private WebElement FirstNameEmptyError;
    @FindBy(xpath = "//span[@id='lastName.errors']")
    private WebElement LastNameEmptyError;
    @FindBy(xpath = "//span[@id='address.street.errors']")
    private WebElement StreetEmptyError;
    @FindBy(xpath = "//span[@id='address.city.errors']")
    private WebElement CityEmptyError;
    @FindBy(xpath = "//span[@id='address.state.errors']")
    private WebElement StateEmptyError;
    @FindBy(xpath = "//span[@id='address.zipCode.errors']")
    private WebElement ZipCodeEmptyError;
    @FindBy(xpath = "//span[@id='ssn.errors']")
    private WebElement SSNEmptyError;

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement FirstNameFormField;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement LastNameFormField;
    @FindBy(xpath = "//input[@id='address.street']")
    private WebElement StreetFormField;
    @FindBy(xpath = "//input[@id='address.city']")
    private WebElement CityFormField;
    @FindBy(xpath = "//input[@id='address.state']")
    private WebElement StateFormField;
    @FindBy(xpath = "//input[@id='address.zipCode']")
    private WebElement ZipCodeFormField;
    @FindBy(xpath = "//input[@id='ssn']")
    private WebElement SSNFormField;


    public void EnterUsername(String username) {
        usernameLogin.sendKeys(username);
    }

    public void EnterPassword(String password) {
        passwordLogin.sendKeys(password);
    }

    public void clickOnLogIn() {
        loginButton.click();
    }

    public boolean isErrorMessage() {
        return errorMessage.isDisplayed();
    }

    public void clickOnForgotLoginInfo() {forgotButton.click();
    }

    public boolean CustomerLookUpPage(){
        return CustomerLookUpForm.isDisplayed();
    }

    public void clickOnFindLoginInfoButton(){
        FindLoginInfoButton.click();
    }

    public void AllRequiredFieldsEmptyError(){
        FirstNameEmptyError.isDisplayed();
        LastNameEmptyError.isDisplayed();
        StreetEmptyError.isDisplayed();
        CityEmptyError.isDisplayed();
        StateEmptyError.isDisplayed();
        ZipCodeEmptyError.isDisplayed();
        SSNEmptyError.isDisplayed();
    }

    public void EnterFirstName(String firstname){
        FirstNameFormField.sendKeys(firstname);
    }
    public void EnterLastName(String lastname){
        LastNameFormField.sendKeys(lastname);
    }
    public void EnterStreet(String street){
        StreetFormField.sendKeys(street);
    }
    public void EnterCity(String city){
        CityFormField.sendKeys(city);
    }
    public void EnterState(String state){
        StateFormField.sendKeys(state);
    }
    public void EnterZipcode(String zipcode){
        ZipCodeFormField.sendKeys(zipcode);
    }
    public void EnterSSN(String ssn){
        SSNFormField.sendKeys(ssn);
    }

}
