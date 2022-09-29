package com.bbcSound.stepDefinitions;

import com.bbcSound.pages.BbcBasePage;
import com.bbcSound.pages.BbcMusicPage;
import com.bbcSound.pages.BbcPodcastPage;
import com.bbcSound.pages.BbcRockAndIndiePage;
import com.bbcSound.utilities.BrowserUtils;
import com.bbcSound.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class BbcSoundStepDefinitionTask2 {

    BbcBasePage basePage = new BbcBasePage();
    BbcPodcastPage podcastPage = new BbcPodcastPage();
    BbcMusicPage musicPage =new BbcMusicPage();
    BbcRockAndIndiePage rockAndIndiePage = new BbcRockAndIndiePage();

    //Scenario: To access Podcast content user is prompted to sign in

    @When("I select the ‘Podcast’ logo")
    public void i_select_the_podcast_logo() {
        basePage.BbcSoundPodcastNavigationLink.click();

        BrowserUtils.sleep(5);
    }
    @Then("I am on the ‘Podcast’ page")
    public void i_am_on_the_page() {

        String expectedPageTitle = "BBC Sounds - Podcasts";
        String actualPageTitle = Driver.getDriver().getTitle();
        System.out.println("Page title : " + expectedPageTitle);
        Assert.assertTrue("User on the WRONG Page!!!", actualPageTitle.equals(expectedPageTitle));


    }
    @Then("I click the first option under 'trending this week'")
    public void i_click_the_first_option_under() {

        podcastPage.BbcSoundFirstOptionUnderTrendingThisWeek.click();
    }
    @Then("I click on the play logo")
    public void i_click_on_the_play_logo() {

        podcastPage.BbcSoundPodcastButtonPlayPause.click();
    }
    @Then("I can see the sign in or register prompt")
    public void i_can_see_the_sign_in_or_register_prompt() {

        Assert.assertTrue(podcastPage.BbcSoundPodcastSignInButton.isDisplayed());

    }
    @When("I select the ‘Music’ logo")
    public void i_select_the_music_logo() {

        basePage.BbcSoundMusicNavigationLink.click();

    }
    @Then("I am on the Music page")
    public void iAmOnTheMusicPage() {

        String expectedPageTitle = "BBC Sounds - Music";
        String actualPageTitle = Driver.getDriver().getTitle();
        System.out.println("Page title : " + expectedPageTitle);
        Assert.assertTrue("User on the WRONG Page!!!", actualPageTitle.equals(expectedPageTitle));

    }

    @Then("I click the first option under 'back to back sound'")
    public void iClickTheFirstOptionUnderBackToBackSound() {
        musicPage.FirstOptionUnderBackToBackSound.click();
    }


    @Then("I click on the play all link")
    public void i_click_on_the_play_all_link() {
        musicPage.BbcSoundMusicPlayAllLink.click();
    }


    @Then("I select the Rock & Indie category")
    public void iSelectTheRockIndieCategory() {
        basePage.BbcSoundRockAndIndieCategoryLink.click();
        BrowserUtils.waitFor(3);
    }

    @Then("I am on the Rock & Indie page")
    public void iAmOnTheRockIndiePage() {


        String expectedPageTitle = "BBC Sounds - Categories - Rock & Indie";
        String actualPageTitle = Driver.getDriver().getTitle();
        System.out.println("Page title : " + expectedPageTitle);
        System.out.println(actualPageTitle);
        Assert.assertEquals(expectedPageTitle,actualPageTitle);
        Assert.assertTrue("User is on the WRONG Page!!!", actualPageTitle.equals(expectedPageTitle));

    }

    @Then("I scroll down to the page 3 link")
    public void iScrollDownToThePageLink() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,500)", "");

    }

    @Then("I click on page 3 link")
    public void iClickOnPageLink() {

        rockAndIndiePage.BbcSoundRockAndIndiePage3Link.click();
        BrowserUtils.waitFor(3);
    }


    @Then("I click the first option image")
    public void iClickTheFirstOptionImage() {


        rockAndIndiePage.BbcSoundFirstOptionImageLink.click();
    }
}
