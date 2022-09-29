package com.bbcSound.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BbcStationsPage extends BbcBasePage{

    @FindBy(xpath = "//h2[text()='Stations']")
    public WebElement BbcStationsVerification;

    @FindBy(xpath = "//*[local-name()='svg' and contains(@class, 'sc-o-responsive-image__svg')] ")
    public List<WebElement> BbcNetworkStationsLogos;
}
