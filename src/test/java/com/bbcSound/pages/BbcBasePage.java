package com.bbcSound.pages;

import com.bbcSound.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BbcBasePage {

    public BbcBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[text()='Listen Live']")
    public WebElement BbcHomepageVerification;

    @FindBy(xpath = "//span[@class='sc-c-sounds-nav__link-text gel-pica']")
    public WebElement BbcSoundHomeNavigationLink;

    @FindBy(xpath = "(//a[@class='sc-c-network-item__link sc-o-link'])[1]")
    public WebElement BbcSoundRadio1Logo;

    @FindBy(xpath = "//li[@data-id='bbc_radio_two']")
    public WebElement BbcSoundRadio2Logo;

    @FindBy(xpath = "//div[text()='Hip Hop, RnB & Dancehall']")
    public WebElement BbcSoundHipHopCategoryLink;

    @FindBy(xpath = "//span[text()='Podcasts']")
    public WebElement BbcSoundPodcastNavigationLink;

    @FindBy(xpath = "//span[text()='Music']")
    public WebElement BbcSoundMusicNavigationLink;

    @FindBy(xpath = "//div[text()='Rock & Indie']")
    public WebElement BbcSoundRockAndIndieCategoryLink;


    public void selectPage(String attribute){
        Driver.getDriver().findElement(By.xpath("(//span[text()='" + attribute + "'])[1]")).click();

    }

}
