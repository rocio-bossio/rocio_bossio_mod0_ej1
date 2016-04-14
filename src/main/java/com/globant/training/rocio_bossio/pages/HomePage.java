/**
 * Class to interact with Home Page.
 */

package com.globant.training.rocio_bossio.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

  WebDriver driver;

  @FindBy(id = "site-title")
  private WebElement title;

  @FindBy(css = "aside input#s")
  private WebElement searchBox;

  @FindBy(css = "article#post-41 .entry-date")
  private WebElement lastPostTime;

  @FindBy(css = "article#post-41 .entry-title>a")
  private WebElement postTitle;

  @FindBy(css = ".page_item.page-item-2>a")
  private WebElement contactUs;

  public String getTime;

  public void ir(WebDriver driver) {
    driver.get("http://10.28.148.127/wordpress");
    driver.manage().window().maximize();
  }

  public void waiting(WebDriver driver) {
    WebDriverWait wait = new WebDriverWait(driver, 60000);
    wait.until(ExpectedConditions.visibilityOf(searchBox));
  }

  public void search(String query) {
    searchBox.sendKeys(query);
    searchBox.sendKeys(Keys.ENTER);
  }

  public String getTime() {
    return lastPostTime.getText();
  }

  public void goToSinglePostPage() {
    postTitle.click();
  }

  public void goToContactUsPage() {
    contactUs.click();
  }

}
