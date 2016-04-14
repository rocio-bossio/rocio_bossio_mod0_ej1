/**
 * Class to interact with Search Page.
 */

package com.globant.training.rocio_bossio.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage {

  WebDriver driver;

  @FindBy(id = "cntctfrm_contact_name")
  private WebElement contactName;

  @FindBy(id = "cntctfrm_contact_email")
  private WebElement contactMail;

  @FindBy(id = "cntctfrm_contact_subject")
  private WebElement contactSubject;

  @FindBy(id = "cntctfrm_contact_message")
  private WebElement contactMessage;

  @FindBy(xpath = ".//*[@id='cntctfrm_contact_form']/div[9]/input[4]")
  private WebElement contactSubmit;

  @FindBy(xpath = "//*[@id='cntctfrm_contact_form']/"
      + "div[@style='text-align: left; color: red;'][1]")
  private WebElement errorMessage;

  public void completeForm(String Name, String Mail, String Subject, String Message) {
    contactName.sendKeys(Name);
    contactMail.sendKeys(Mail);
    contactSubject.sendKeys(Subject);
    contactMessage.sendKeys(Message);
    contactSubmit.click();
  }
  
// identificar el Mensaje de error.
}
