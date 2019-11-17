import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.serialization.ClassNameMatcher;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.AbstractStringAssert;
import org.assertj.core.api.Assertions;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radzikowski {

        public WebDriver driver;


        @BeforeClass
        public static void setDriver() {
            WebDriverManager.chromedriver().setup();

        }

        @Test

                public void homeWorkRadzikowski(){

            ChromeDriver driver = new ChromeDriver();
            driver.get("http://demo.testarena.pl/zaloguj");
            WebElement email = driver.findElement(By.id("email"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement login = driver.findElement(By.id("login"));

            email.sendKeys("administrator@testarena.pl");
            password.sendKeys("sumXQQ72$L");
            login.click();

            WebElement panel = driver.findElement(By.className("header_admin"));
            panel.click();

            WebElement addProject = driver.findElement(By.xpath("//*[@id=\"content\"]/article/nav/ul/li[1]/a"));
            addProject.click();

            WebElement name = driver.findElementById("name");
            WebElement save = driver.findElementById("save");
            WebElement prefix = driver.findElementById("prefix");

            name.sendKeys("LRadzikowski");
            prefix.click();
            prefix.sendKeys("90210");
            save.click();

            WebElement project = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/ul/li[1]/a"));
            project.click();

            Assertions.assertThat(driver.findElementByLinkText("LRadzikowski"));

            driver.quit();
















        }

}
