package com.globant.training.rocio_bossio.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.globant.training.rocio_bossio.pages.ContactUsPage;
import com.globant.training.rocio_bossio.pages.SucessContactFormSent;
import com.globant.training.rocio_bossio.pages.HomePage;
import com.globant.training.rocio_bossio.pages.SearchPage;
import com.globant.training.rocio_bossio.pages.SinglePostPage;

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

  // @AfterMethod
  // public void after() {
  // driver.quit();
  // }

  /**
   * Case 1: Verify if the title is the expected one.
   */

  @Test(description = "Verifing if title displayed is the expected one")
  public void case1() {
    String expectedTitle = "Automation Training | Aprender a automatizar en un solo sitio";
    String otherTitle = "Title is not displayed as expected";
    Assert.assertEquals(expectedTitle, driver.getTitle(), otherTitle);
  }

  /**
   * Case 2: Verify if the query has results displayed.
   */

  @Test(description = "Verifying if the query has results displayed")
  public void case2() {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    homePage.ir(driver);
    homePage.waiting(driver);
    homePage.search("test"); // como hacer para utilizar esta palabra
    SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
    searchPage.esperando(driver);
    WebElement resultText = driver.findElement(By.className("page-title"));
    String resulting = resultText.getText();
    String expectedTitle = "SEARCH RESULTS FOR: TEST"; // aca
    String otherTitle = "Not Found";
    Assert.assertEquals(expectedTitle, resulting, otherTitle);
  }

  /**
   * Case 3: Verify if a post date is the expected one.
   */

  @Test(description = "Verifying if a post date is the expected one")
  public void case3() {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    homePage.ir(driver);
    homePage.waiting(driver);
    String gettingTime = homePage.getTime;
    System.out.println("Obteniendo primer date" + gettingTime); // lo toma mal
    String otherTime = "Title is not displayed as expected";
    homePage.goToSinglePostPage();
    SinglePostPage singlePost = PageFactory.initElements(driver, SinglePostPage.class);
    String getOtherTime = singlePost.getTimeSinglePost();
    System.out.println("Obteniendo segundo date" + getOtherTime);
    Assert.assertEquals(gettingTime, getOtherTime, otherTime);
    System.out.println("Comparacion");
  }

  /**
   * Case 4: Send form and verify if it was properly sent.
   */

  @Test(description = "Send form and verify if it was properly sent")
  public void case4() {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    homePage.ir(driver);
    homePage.waiting(driver);
    homePage.goToContactUsPage();
    ContactUsPage contactUs = PageFactory.initElements(driver, ContactUsPage.class);
    contactUs.completeForm("Tester", "test@test.com", "Testing", "Testing");
    contactUs.waiting(driver);
    contactUs.sendForm();
    SucessContactFormSent Thanks = PageFactory.initElements(driver, SucessContactFormSent.class);
    String answer = Thanks.getMessage();
    Assert.assertTrue(answer.contains("Thank you for contacting us."));
    driver.quit();
  }
}
  
