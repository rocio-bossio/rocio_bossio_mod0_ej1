/**
 * Class to interact with Search Page.
 */

package com.globant.training.rocio_bossio.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SucessContactFormSent {

  WebDriver driver;

  @FindBy(id = "cntctfrm_thanks")
  private WebElement contactAnswer;

  public String getMessage() {
    return contactAnswer.getText();
  } 

}
