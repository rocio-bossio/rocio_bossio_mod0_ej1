/**
 * Class to interact with Home Page.
 */

package com.globant.training.rocio_bossio.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

  @FindBy(css = "entry-date")
  private List<WebElement> entriesDates;

  public String getTime;

  public void ir(WebDriver driver) {
    driver.get("http://10.28.148.127/wordpress");
    driver.manage().window().maximize();
  }

  public void search(String query) {
    searchBox.sendKeys(query);
    searchBox.sendKeys(Keys.ENTER);
  }

  public String getTime() {
    WebElement entryDate = entriesDates.get(1);
    return entryDate.getText();
  }

  public void goToSinglePostPage() {
    postTitle.click();
  }

  public void goToContactUsPage() {
    contactUs.click();
  }

}
