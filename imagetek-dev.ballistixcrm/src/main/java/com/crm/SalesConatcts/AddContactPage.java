package com.crm.SalesConatcts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddContactPage {

	@FindBy(id = "Contacts_editView_fieldName_firstname")private WebElement firstNameEdtTxt;
	
	//select org
	@FindBy(xpath = "//span[@title='Create']")private WebElement SelectOrgLkpImg;
	@FindBy(id = "Accounts_editView_fieldName_accountname")private WebElement orgNameEdtTxt;
	@FindBy(xpath = "//button[@name='saveButton']")private WebElement saveOrgBtnClk;
	
	@FindBy(id = "Contacts_editView_fieldName_lastname")private WebElement lastNameEdtTxt;
	
	@FindBy(xpath = "//button[.='Save']")private WebElement saveBtnClk;
	
	public AddContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void addFirstNameAndOrg(String firstName,String orgname)
	{
		firstNameEdtTxt.sendKeys(firstName);
		SelectOrgLkpImg.click();
		orgNameEdtTxt.sendKeys(orgname);
		saveOrgBtnClk.click();
	}
	public void LastName(String lastName)
	{
		lastNameEdtTxt.clear();
		lastNameEdtTxt.sendKeys(lastName);
		saveBtnClk.click();
	}
}
