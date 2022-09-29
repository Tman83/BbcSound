package com.bbcSound.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcPodcastPage extends BbcBasePage{

    @FindBy(xpath = "//h2[text()='Podcasts']")
    public WebElement BbcSoundPodcastPageVerification;

    @FindBy(xpath = "(//a[@class='sc-c-basic__link gs-u-display-block sc-u-flex-grow sc-o-link play-c-exit-modal-bypass'])[1]" )
    public WebElement BbcSoundFirstOptionUnderTrendingThisWeek;

    @FindBy(xpath = "//button[@id='p_audioui_playpause']")
    public WebElement BbcSoundPodcastButtonPlayPause;

    @FindBy(xpath = "//a[@class='id-cta-button']")
    public WebElement BbcSoundPodcastSignInButton;

}
