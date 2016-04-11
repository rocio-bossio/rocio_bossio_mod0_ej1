/**
 * Class to interact with Search Page.
 */

package com.globant.training.rocio_bossio.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

  @FindBy(name = "cntctfrm_contact_action")
  private WebElement contactSubmit;

  public void completeForm(String Name, String Mail, String Subject, String Message) {
    contactName.sendKeys(Name);
    contactMail.sendKeys(Mail);
    contactSubject.sendKeys(Subject);
    contactMessage.sendKeys(Message);
  }

  public void waiting(WebDriver driver) {
    WebDriverWait wait = new WebDriverWait(driver, 60000);
    wait.until(ExpectedConditions.visibilityOf(contactSubmit));
  }

  public void sendForm() {
    contactSubmit.click();
  }

}
