package com.bbcSound.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcHipHopRnbAndDanceHallCategoryPage extends BbcBasePage{

    @FindBy(xpath = "//h2[text()='Hip Hop, RnB & Dancehall']")
    public WebElement BbcSoundHipHopRnbAndDancehallPageVerification;

    @FindBy(xpath = "//span[text()='View all']")
    public WebElement BbcSoundHipHopRnbAndDancehallViewAllLink;

    @FindBy(id = "sort")
    public WebElement BbcSoundHipHopRnbAndDancehallsortByDropdown;
}
