package day03_webDriverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D3_driverManageMetodlari3 {
    public static void main(String[] args) {
//        1.Yeni bir class olusturalim (Homework)
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        2.ChromeDriver kullanarak, facebook sayfasina gidin ve
//        sayfa basliginin(title) “facebook” oldugunu test edin, degilse dogru basligi yazdirin.
            driver.get("https://www.facebook.com/");
            String expectedFacebookTitle = "Facebook";
            String actualFacebookTitle = driver.getTitle();
            if (!expectedFacebookTitle.equals(actualFacebookTitle)){
                System.out.println(actualFacebookTitle);
            }

//        3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
              String expectedUrlText = "facebook";
              String actualUrlText = driver.getCurrentUrl();
              if (actualUrlText.contains(expectedUrlText)){
                  System.out.println("Sayfa URL - i "+ expectedUrlText + " kelimesini iceriyor");
              }else{
                  System.out.println("Actual URL Text :" + actualUrlText);
              }

//        4.https://www.walmart.com/ sayfasina gidin.
             driver.navigate().to("https://www.walmart.com/");

//        5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
              String expectedTitleWalmart = "Walmart.com";
              String actualTitleWalmart = driver.getTitle();
              if (expectedTitleWalmart.contains(actualTitleWalmart)){
                  System.out.println("Test PASSED");
              }else{
                  System.out.println("Test FAILED");
              }

//        6. Tekrar “facebook” sayfasina donun
            driver.navigate().back();

//        7. Sayfayi yenileyin
            driver.navigate().refresh();

//        8. Sayfayi tam sayfa (maximize) yapin
            driver.manage().window().maximize();

//        9.Browser’i kapatin
            driver.quit();
    }
}
