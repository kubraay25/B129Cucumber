package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class DataTablePage {
    public DataTablePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@type='button'])[1]")
    public WebElement newButton;
    @FindBy(xpath = "//*[@id='DTE_Field_first_name']")
    public WebElement firstName;
    @FindBy(xpath = "//*[text()='Create']")
    public WebElement createButton;
    @FindBy(xpath = "//*[@type='search']")
    public WebElement search;
    @FindBy(xpath = "//tbody//td[2]")
    public WebElement verify;


}
