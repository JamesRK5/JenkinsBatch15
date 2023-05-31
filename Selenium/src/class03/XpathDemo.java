package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");

        WebElement userName=driver.findElement(By.xpath("//input[contains(@name,\"username\")]"));
        userName.sendKeys("Tester");

        WebElement password= driver.findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("Bigtest111");

        Thread.sleep(2000);

        //clear the username textbox
        userName.clear();
        Thread.sleep(2000);

        //clear the password
        password.clear();
        Thread.sleep(2000);

        WebElement usernameText= driver.findElement(By.xpath("//label[text()=\"Username:\"]"));
        System.out.println(usernameText.getText());

        // /html/body/form/div <- in order to navigate directly to a place manually


    }
}
