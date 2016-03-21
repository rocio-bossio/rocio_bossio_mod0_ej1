/**
 * Class to interact with Search Page.
 */

package com.globant.training.rocio_bossio.pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

  WebDriver driver;

  @FindBy(className = "page-title")
  private WebElement title;

  public void esperando(WebDriver driver) {
    WebDriverWait wait = new WebDriverWait(driver, 60000);
    wait.until(ExpectedConditions.visibilityOf(title));
  }
  
//  public void results(WebDriver driver){
//    WebElement resultText = driver.findElement(By.className("page-title"));
//    String resulting = resultText.getText();
//  }
}
