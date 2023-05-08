import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private static final TimeUnit GeneratedUtils = null;
    private static final String ExpectedConditions = null;
    public String baseUrl = "https://qnem103zatcwi.vodacom.corp:8443/";
    String driverPath = "C:\\chromedriver.exe";
    public static WebDriver driver;
    public String expected = null;
    public String actual;

    {
        actual = null;
    }

    @Before
    public void SiteTitle() {
        String expectedTitle = "Vodacom - Nemo";
        String actualTitle = driver.getTitle();
        AssertJUnit.assertEquals(actualTitle, expectedTitle);
    }

    @BeforeTest
    public void launchBrowser() throws InterruptedException {
        System.out.println("Launching Google chrome");
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    public void LoginTest() throws InterruptedException {

        //Logging_On
        driver.findElement(By.id("username")).sendKeys("Nkanyiso111");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".p-password-input")).sendKeys("Altron_2028");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".p-button:nth-child(2)")).click();
        Thread.sleep(7000);
        //driver.findElement(By.cssSelector(".my-1 > .p-inputswitch-slider")).click();

        driver.findElement(By.cssSelector("#pr_id_16_content_0 .p-inputswitch-slider")).click();
        //Thread.sleep(5000);

        driver.findElement(By.cssSelector("#pr_id_16_content_11 .p-inputswitch-slider")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".p-1")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(7) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-confirm-dialog-accept")).click();
        //Login
        Thread.sleep(2000);

        //driver.findElement(By.id("username")).click();
        //driver.findElement(By.id("username")).sendKeys("Nkanyiso111");

        //Thread.sleep(2000);

        //driver.findElement(By.xpath("//span/div/input")).click();

        //Thread.sleep(2000);

        //driver.findElement(By.xpath("//span/div/input")).sendKeys("Altron_2027");

        // . Click 'Login'
       // Thread.sleep(3000);
        //driver.findElement(By.xpath("//button[. = 'Login']")).click();
       // Thread.sleep(3000);

       // driver.findElement(By.cssSelector(".p-1")).click();
        //Thread.sleep(1000);
       //driver.findElement(By.cssSelector(".p-menuitem:nth-child(7) .p-menuitem-text:nth-child(2)")).click();
       // driver.findElement(By.cssSelector(".p-confirm-dialog-accept")).click();
    }

    @Test(priority = 1)
    public void Closingtab() throws InterruptedException {
        //Login
        Thread.sleep(2000);

        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("Nkanyiso111");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span/div/input")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span/div/input")).sendKeys("Altron_2028");

        // . Click 'Login'
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[. = 'Login']")).click();
        Thread.sleep(2000);

        // 9. ClickAdministration1'
        By by;
        by = By.xpath("//a[. = 'Administration']");
        Thread.sleep(1000);
        driver.findElement(by).click();
        // 10. Click 'System'
        by = By.xpath("//li[2]/ul//a[. = 'System']");
        Thread.sleep(1000);
        driver.findElement(by).click();
        // FailureBehaviorType is continue test in case of failure
        // 11. Click 'System
        Thread.sleep(1000);
        by = By.xpath("//li[2]/ul//a[. = 'System']");
        driver.findElement(by).click();
        // 12. Click 'Customer Invoices'
        Thread.sleep(1000);
        by = By.xpath("//a[. = 'Customer Invoices']");
        Thread.sleep(1000);
        driver.findElement(by).click();
        // 13. Click 'I1'
        by = By.xpath("//li[1]//i");
        Thread.sleep(1000);
        driver.findElement(by).click();
        // 14. Click 'I1'
        by = By.xpath("//li[1]//i");
        Thread.sleep(1000);
        driver.findElement(by).click();
        // 15. Move mouse to 'I2'
        by = By.xpath("//li//i");
        Thread.sleep(1000);
        (new Actions(driver)).moveToElement(driver.findElement(by)).perform();
        /* 16. Click 'IMG' */
        by = By.xpath("//img");
        Thread.sleep(1000);
        driver.findElement(by).click();
        // 17. Click 'LOGOFF'
        by = By.xpath("//span[. = 'LOGOFF']");
        Thread.sleep(1000);
        driver.findElement(by).click();
        // 18. Click 'Yes'
        by = By.xpath("//button[. = 'Yes']");
        Thread.sleep(1000);
        driver.findElement(by).click();

    }

    @Test(priority = 2)
    public void Dashboard() throws InterruptedException {

        //Login
        Thread.sleep(2000);

        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("Nkanyiso111");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span/div/input")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span/div/input")).sendKeys("Altron_2028");

        // . Click 'Login'
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[. = 'Login']")).click();
        Thread.sleep(2000);

        //Dashboard Auto Refresh
        driver.findElement(By.xpath("//*[@id=\"pr_id_19_content_0\"]/div[1]/div[1]")).click();
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@id=\"pr_id_16_content_0\"]/div/div/div[1]/div/div[1]/div/div/div")).click();

        // 9. Click 'Search'

        Thread.sleep(2000);
        By by = By.xpath("//span[. = 'Search']");
        driver.findElement(by).click();

        // 10. Click 'Summaries'

        Thread.sleep(2000);
        by = By.xpath("//span[. = 'Summaries']");
        driver.findElement(by).click();


        // 7. Click 'IMG'
        By by1 = By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div/div[1]/div[1]/img");
        Thread.sleep(2000);
        driver.findElement(by1).click();


        // 8. Click 'LOGOFF'
        Thread.sleep(2000);
        by1 = By.xpath("//span[. = 'LOGOFF']");
        driver.findElement(by1).click();

        // 9. Click 'Yes2'
        Thread.sleep(2000);
        by1 = By.xpath("//button[. = 'Yes']");
        driver.findElement(by1).click();
    }

    @Test(priority = 3)
    public void Notices() throws InterruptedException {

        driver.findElement(By.id("username")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("username")).sendKeys("Nkanyiso111");
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".p-password-input")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".p-password-input")).sendKeys("Altron_2028");
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".p-button:nth-child(2)")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Administration")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("System")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("System")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Notices")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-button:nth-child(4)")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(2) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("subject")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("subject")).sendKeys("Testing");
        Thread.sleep(1500);
        driver.findElement(By.name("message")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("message")).sendKeys("Adding New Notice , Nemo deployment inplace");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".cardPanel .p-button:nth-child(1)")).click();
        Thread.sleep(20000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-button:nth-child(4)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(6) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-button:nth-child(4)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(7) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-confirm-dialog-accept")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-button:nth-child(4)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(4) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-selectable-row:nth-child(1) > td:nth-child(1) > .vw20")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".pi-user")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(3) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".p-component-overlay")).click();
        driver.findElement(By.cssSelector(".p-1")).click();
        Thread.sleep(1500);
        driver.findElement(By.linkText("LOGOFF")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".p-confirm-dialog-accept")).click();
    }

    @Test(priority = 4)
    public void SystemParameters() throws InterruptedException {


        //Login
        Thread.sleep(2000);

        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("Nkanyiso111");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span/div/input")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span/div/input")).sendKeys("Altron_2028");

        // . Click 'Login'
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[. = 'Login']")).click();
        Thread.sleep(2000);

        // 9. ClickAdministration1'
        By by;
        by = By.xpath("//a[. = 'Administration']");
        Thread.sleep(1000);
        driver.findElement(by).click();

        // 10. Click 'System'
        by = By.xpath("//li[2]/ul//a[. = 'System']");
        Thread.sleep(1000);
        driver.findElement(by).click();


        // 11. Click 'System
        Thread.sleep(1000);
        by = By.xpath("//li[2]/ul//a[. = 'System']");
        driver.findElement(by).click();

        Thread.sleep(5000);
        driver.findElement(By.linkText("System Parameters")).click();
        // 12 | click | css=#pr_id_20_content_1 .p-button:nth-child(4) |
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-button:nth-child(4)")).click();
        // 13 | click | css=.p-menuitem:nth-child(2) .p-menuitem-text:nth-child(2) |
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(2) .p-menuitem-text:nth-child(2)")).click();
        // 14 | click | css=#pr_id_20_content_1 .p-filter-column:nth-child(3) > .p-inputtext |
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-filter-column:nth-child(3) > .p-inputtext")).click();
        // 15 | type | css=.p-filled | number
        Thread.sleep(3000);
        //driver.findElement(By.cssSelector(".p-filled")).sendKeys("number");
        // 16 | click | css=#pr_id_20_content_1 .p-button:nth-child(4) |
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-button:nth-child(4)")).click();
        // 17 | click | css=.p-menuitem:nth-child(2) .p-menuitem-text:nth-child(2) |
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(2) .p-menuitem-text:nth-child(2)")).click();
        // 18 | click | css=#pr_id_20_content_1 .p-button:nth-child(4) |
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-button:nth-child(4)")).click();
        // 19 | click | css=.p-menuitem:nth-child(3) .p-menuitem-text:nth-child(2) |
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(3) .p-menuitem-text:nth-child(2)")).click();
        // 20 | click | css=#pr_id_20_content_1 .p-button:nth-child(4) |
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-button:nth-child(4)")).click();
        // 21 | click | css=.p-menuitem:nth-child(5) .p-menuitem-text:nth-child(2) |
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(5) .p-menuitem-text:nth-child(2)")).click();
        // 22 | click | css=#pr_id_20_content_1 .p-button:nth-child(4) |
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-button:nth-child(4)")).click();
        // 23 | click | css=.p-menuitem:nth-child(6) .p-menuitem-text:nth-child(2) |
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(6) .p-menuitem-text:nth-child(2)")).click();
        // 24 | click | css=.p-confirm-dialog-accept |
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".p-confirm-dialog-accept")).click();
        // 25 | click | css=.p-1 |
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".p-1")).click();
        // 26 | click | linkText=LOGOFF |
        Thread.sleep(3000);

        driver.findElement(By.linkText("LOGOFF")).click();
        // 27 | click | css=.p-confirm-dialog-accept |
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".p-confirm-dialog-accept")).click();
    }
    @Test(priority = 5)
    public void OfficeRankManagement() throws InterruptedException {
        //Login
        Thread.sleep(2000);

        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("Nkanyiso111");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span/div/input")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span/div/input")).sendKeys("Altron_2028");

        // . Click 'Login'
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[. = 'Login']")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".p-menubar-root-list > .p-menuitem:nth-child(2) > .p-menuitem-link > .p-menuitem-text")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("System")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-menuitem-active > .p-submenu-list > .p-menuitem:nth-child(2) > .p-menuitem-link > .p-menuitem-text")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'__next\']/div/div/div/div[2]/span/div/ul/li[2]/ul/li[2]/ul/li[8]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id=\'pr_id_20_content_1\']/div/div/div[3]/button[2]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[3]/ul/li[2]/a/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("officeRank")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("officeRank")).sendKeys("111");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".invalidField > .p-inputtext")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\'description\']")).sendKeys("Nkanyiso");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".cardPanel .p-button:nth-child(1)")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-button:nth-child(4)")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(4) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-filter-column:nth-child(3) > .p-inputtext")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-selectable-row:nth-child(2) > td:nth-child(3) > .vw20")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-button:nth-child(4)")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(3) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-button:nth-child(4)")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(6) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-button:nth-child(4)")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(7) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-confirm-dialog-accept")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-1")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(7) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-confirm-dialog-accept")).click();
    }

    @Test(priority = 6)
    public void SendSMS() throws InterruptedException {


        //Login
        Thread.sleep(2000);

        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("Nkanyiso111");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span/div/input")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span/div/input")).sendKeys("Altron_2028");

        // . Click 'Login'
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[. = 'Login']")).click();
        Thread.sleep(2000);

        // 9. ClickAdministration1'
        By by;
        by = By.xpath("//a[. = 'Administration']");
        Thread.sleep(1000);
        driver.findElement(by).click();

        // 10. Click 'System'
        by = By.xpath("//li[2]/ul//a[. = 'System']");
        Thread.sleep(1000);
        driver.findElement(by).click();


        // 11. Click 'System
        Thread.sleep(1000);
        by = By.xpath("//li[2]/ul//a[. = 'System']");
        driver.findElement(by).click();

        Thread.sleep(2000);
        driver.findElement(By.linkText("Send SMS")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("msisdns")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("msisdns")).sendKeys("27607309122");
        Thread.sleep(2000);
        driver.findElement(By.name("msisdns")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.name("contents")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("contents")).sendKeys("Nkanyiso Testing in QA environment");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".cardPanel .p-button:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\'msisdns\']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("msisdns")).sendKeys("27761416788");
        Thread.sleep(2000);
        driver.findElement(By.name("msisdns")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.name("contents")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("contents")).sendKeys("User 111 sending SMS in QA environment");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".cardPanel .p-button:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("pr_id_37_header_1")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\'msisdn\']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("msisdn")).sendKeys("27761416788");
        Thread.sleep(2000);
        driver.findElement(By.name("msisdn")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#pr_id_37_content_1 .p-button:nth-child(3)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#pr_id_37_content_1 .p-button:nth-child(4)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(4) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#pr_id_37_content_1 .p-button:nth-child(4)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(5) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-confirm-dialog-accept")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#pr_id_37_content_1 .p-panel-header .p-button:nth-child(2) > .p-button-icon")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("msisdn")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("msisdn")).sendKeys("27607309122");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#pr_id_37_content_1 .p-button:nth-child(3)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#pr_id_37_content_1 .p-button:nth-child(4)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(4) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#pr_id_37_content_1 .p-button:nth-child(4) > .p-button-icon")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(5) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-confirm-dialog-accept")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-tabview-selected .pi")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-1")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(7) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-confirm-dialog-accept")).click();
    }

    @Test(priority = 7)
    public void CourtAttandance() throws InterruptedException {


        //Login
        Thread.sleep(2000);

        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("Nkanyiso111");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span/div/input")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span/div/input")).sendKeys("Altron_2028");

        // . Click 'Login'
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[. = 'Login']")).click();
        Thread.sleep(2000);

        // 9. ClickAdministration1'
        By by;
        by = By.xpath("//a[. = 'Administration']");
        Thread.sleep(1000);
        driver.findElement(by).click();

        // 10. Click 'System'
        by = By.xpath("//li[2]/ul//a[. = 'System']");
        Thread.sleep(1000);
        driver.findElement(by).click();


        // 11. Click 'System
        Thread.sleep(1000);
        by = By.xpath("//li[2]/ul//a[. = 'System']");
        driver.findElement(by).click();

        Thread.sleep(2000);
        driver.findElement(By.linkText("Court Attendance")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".items-center > .p-float-label > .p-inputtext")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@name=\'caseNumber\'])[2]")).sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-dropdown-clearable")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-dropdown-filter")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-dropdown-filter")).sendKeys("Sar");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-dropdown-item")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-datepicker-trigger")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-datepicker-year")).click();
        Thread.sleep(2000);
        {
            WebElement dropdown = driver.findElement(By.cssSelector(".p-datepicker-year"));
            dropdown.findElement(By.xpath("//option[. = '2019']")).click();
        }
        driver.findElement(By.cssSelector(".p-monthpicker-month:nth-child(6)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .flex-auto .p-button:nth-child(4)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(5) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .flex-auto .p-button:nth-child(4)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(6) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-confirm-dialog-accept")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .flex-auto .p-button:nth-child(4)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(2) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".invalidField:nth-child(1) .p-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-datepicker-today > span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".invalidField .p-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(4) > span")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("courtName")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("courtName")).sendKeys("Johannesburg Court");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-float-label:nth-child(4) .p-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > span")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("prosecutorName")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("prosecutorName")).sendKeys("Mr NS Ngobese");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".justify-between:nth-child(1) > .p-inputswitch > .p-inputswitch-slider")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".flex:nth-child(2) .p-inputswitch-slider")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("caseNumbers")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\'caseNumbers\']")).sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.name("caseNumbers")).sendKeys(Keys.ENTER);
        Thread.sleep(7000);
        driver.findElement(By.cssSelector(".cardPanel > .p-panel-header .p-button:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-panel-header .p-button:nth-child(2) > .p-button-icon")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".h-8 .p-dropdown-trigger-icon")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-dropdown-filter")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-dropdown-item")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-datepicker-trigger")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-monthpicker-month:nth-child(6)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-1")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(7) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".p-confirm-dialog-accept")).click();
    }

    @Test(priority = 8)
    public void CloneHandset() throws InterruptedException {
        //Login
        Thread.sleep(2000);

        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("Nkanyiso111");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span/div/input")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span/div/input")).sendKeys("Altron_2028");

        // . Click 'Login'
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[. = 'Login']")).click();
        Thread.sleep(2000);

        // 9. ClickAdministration1'
        By by;
        by = By.xpath("//a[. = 'Administration']");
        Thread.sleep(1000);
        driver.findElement(by).click();

        // 10. Click 'System'
        by = By.xpath("//li[2]/ul//a[. = 'System']");
        Thread.sleep(1000);
        driver.findElement(by).click();


        // 11. Click 'System
        Thread.sleep(1000);
        by = By.xpath("//li[2]/ul//a[. = 'System']");
        driver.findElement(by).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Cloned Handset")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-button:nth-child(4)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(6) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-button:nth-child(4)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(7) .p-menuitem-text:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".p-confirm-dialog-accept")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-button:nth-child(4)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(2) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("IMEI")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("IMEI")).sendKeys("35134500224209");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".cardPanel .p-button:nth-child(1)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#pr_id_20_content_1 .p-button:nth-child(4)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(4) .p-menuitem-text:nth-child(2)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".p-tabview-selected .pi")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".p-1")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(7) .p-menuitem-text:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".p-confirm-dialog-accept")).click();
    }



    @AfterClass
    static void tearDown() {
        if (driver != null) {
            driver.quit();
        }

    }
}