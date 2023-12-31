package po.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage {
    private WebDriver driver;

    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
    }
    private static final By doubleClickButton = By.xpath("//button[@id='doubleClickBtn']");
    public void performDoubleClick() {
        new Actions(driver).doubleClick((WebElement) doubleClickButton).build().perform();
    }

    public String getDoubleClickText() {
        return driver.findElement(By.id("doubleClickMessage")).getText();
    }
}

