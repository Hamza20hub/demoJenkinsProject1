package foxNewsTest;

import base.BaseClass;
import foxNews.FoxNewsPageObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FoxNewsHomePageTest extends BaseClass {
    public static FoxNewsPageObject foxNewsPageObject = null;
    @BeforeClass
    public void init(){
        foxNewsPageObject = PageFactory.initElements(driver,FoxNewsPageObject.class);
        driver.get("https://www.foxnews.com");
    }
    @Test
    public void verifyTitleTest(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Fox News - Breaking News Updates | Latest News Headlines | Photos & News Videos");
    }
    @Test
    public void btnUSTest(){
        foxNewsPageObject.setBtnUS();
        String currentUrl= driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://www.foxnews.com/us");
    }
}
