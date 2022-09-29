package com.bbcSound.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcRockAndIndiePage extends BbcBasePage{

    @FindBy(xpath = "//a[@aria-label='View page 3 of 3']")
    public WebElement BbcSoundRockAndIndiePage3Link;

    @FindBy(xpath = "(//div[@class='sc-c-rsimage sc-o-responsive-image sc-o-responsive-image--1by1 '])[1]")
    public WebElement BbcSoundFirstOptionImageLink;
}
