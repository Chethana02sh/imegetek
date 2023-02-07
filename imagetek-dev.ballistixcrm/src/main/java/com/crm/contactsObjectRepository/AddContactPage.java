package com.crm.contactsObjectRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddContactPage {

@FindBy(id = "Contacts_editView_fieldName_firstname") private WebElement firstNameEdtTxt;

@FindBy(id = "Contacts_editView_fieldName_lastname") private WebElement lastNameEdtTxt;

//select org
@FindBy(xpath = "//span[@title='Create']")private WebElement SelectOrgLkpImg;
@FindBy(id = "Accounts_editView_fieldName_accountname")private WebElement orgNameEdtTxt;
@FindBy(xpath = "//button[@name='saveButton']")private WebElement saveOrgBtnClk;
	
@FindBy(xpath = "//td[contains(.,'Field of Operation')]/..//div[@id='s2id_autogen7']") private WebElement selecFieldOfOperationDropdown;

@FindBy(xpath = "//div[.='Administration']") private WebElement adminstrationOption;
	
@FindBy(xpath = "//button[.='Save']") private WebElement saveBtn;


public AddContactPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}


public WebElement getContactNameEdtTxt() {
	return firstNameEdtTxt;
}


public WebElement getLastNameEdtTxt() {
	return lastNameEdtTxt;
}


public WebElement getSelecFieldOfOperationDropdown() {
	return selecFieldOfOperationDropdown;
}


public WebElement getAdminstrationOption() {
	return adminstrationOption;
}


public WebElement getSaveBtn() {
	return saveBtn;
}


public void addFirstNameAndOrg(String firstName,String orgname)
{
	firstNameEdtTxt.sendKeys(firstName);
	SelectOrgLkpImg.click();
	orgNameEdtTxt.sendKeys(orgname);
	saveOrgBtnClk.click();
}
public void addLastName(String lastName)
{
	lastNameEdtTxt.clear();
	lastNameEdtTxt.sendKeys(lastName);
}
}