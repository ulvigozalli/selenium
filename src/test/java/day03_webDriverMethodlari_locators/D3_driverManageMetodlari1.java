package day03_webDriverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3_driverManageMetodlari1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //        1. https://www.testotomasyonu.com/ sayfasina gidin
        driver.get("https://www.testotomasyonu.com/ ");
        //        2. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumunu : "+ driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari :"+ driver.manage().window().getSize());
        //        3. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        //        4. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //        5. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanin konumunu  maximize durumunda :"+ driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlari maximize durumunda :"+ driver.manage().window().getSize());
        //        6. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        //        7. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanin konumunu    fullscreen durumunda :" + driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutlarini fullscreen durumunda :" + driver.manage().window().getSize());
        //        8. Sayfayi kapatin
        driver.quit();

    }
}
