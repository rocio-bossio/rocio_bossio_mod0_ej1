/**
 * Class to interact with Single Post Page.
 */
package com.globant.training.rocio_bossio.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SinglePostPage {

  WebDriver driver;
  
  public String getTimeSinglePost;

  @FindBy(tagName = "time")
  private WebElement lastPostTime;

  public String getTimeSinglePost(){
    return lastPostTime.getText();
  }
  
}
