package com.bbcSound.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcMusicPage extends BbcBasePage{


    @FindBy(xpath = "(//div[@class='sc-c-portrait-card gs-u-display-flex'][1])")
    public WebElement FirstOptionUnderBackToBackSound;

    @FindBy(xpath = "//span[text()='Play all']")
    public WebElement BbcSoundMusicPlayAllLink;

}
