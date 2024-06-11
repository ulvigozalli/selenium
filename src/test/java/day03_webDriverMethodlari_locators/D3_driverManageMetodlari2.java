package day03_webDriverMethodlari_locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D3_driverManageMetodlari2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        1. https://www.testotomasyonu.com/ sayfasina gidiz
        driver.get("https://www.testotomasyonu.com/");
//        2. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu :"+ driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari : " + driver.manage().window().getSize());
//        3. Sayfanin konumunu pixel olarak (50,50)’ye getirin
        driver.manage().window().setPosition(new Point(50,50));
//        4. Sayfa boyutunu pixel olarak (1000,500)’ye ayarlayin
        driver.manage().window().setSize(new Dimension(1000,500));
//        4. Sayfanin istenen konum ve boyuta geldigini test edin
//        5. Sayfayi kapatin
        driver.quit();

    }
}
