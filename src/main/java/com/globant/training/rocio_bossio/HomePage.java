package com.globant.training.rocio_bossio;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

  WebDriver driver;

   @FindBy(id = "site-title")
   private WebElement title;

  @FindBy(id = "s")
  private WebElement searchBox;

  public void ir(WebDriver driver) {
    driver.get("http://10.28.148.127/wordpress");
    driver.manage().window().maximize();
  }

   public void waiting(WebDriver driver) {
   WebDriverWait wait = new WebDriverWait(driver, 60000);
   wait.until(ExpectedConditions.visibilityOf(title));
   }

  public void search(String query) {
    searchBox.sendKeys(query);
    searchBox.sendKeys(Keys.ENTER);
  }

}
