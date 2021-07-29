package foxNews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FoxNewsPageObject {
    @FindBy(xpath = "//div[@class='primary-nav tablet-desktop']//a[@data-omtr-intcmp='hp1navus']")
    WebElement btnUS;

    public void setBtnUS(){
        btnUS.click();
    }
}
