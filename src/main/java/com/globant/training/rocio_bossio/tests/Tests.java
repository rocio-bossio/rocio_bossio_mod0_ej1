package com.globant.training.rocio_bossio.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.globant.training.rocio_bossio.HomePage;

public class Tests {

  WebDriver driver = new FirefoxDriver();

  /**
   * Open driver, initialize elements and go to specific URL.
   */

  @BeforeMethod
  public void before() {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    homePage.ir(driver);
    homePage.waiting(driver);
  }

  /**
   * Close driver.
   */

  @AfterMethod
  public void after() {
    driver.quit();
  }

  /**
   * Case 1: Verify if the title is the expected one.
   */

  @Test(description = "Verifing if title displayed is the expected one")
  public void case1() {
    String expectedTitle = "Automation Training | Aprender a automatizar en un solo sitio";
    String otherTitle = "Title is not displayed as expected";
    Assert.assertEquals(expectedTitle, driver.getTitle(), otherTitle);
  }

  // @Test(description = "Verifing if the query has results displayed")
  // public void case2() {
  // homePage.search("test");
  // Assert.assertTrue("Verification failed: No results.",Element1.equals
  // (driver.findElement(By.id(Element2 )).getText()));
  // }

}