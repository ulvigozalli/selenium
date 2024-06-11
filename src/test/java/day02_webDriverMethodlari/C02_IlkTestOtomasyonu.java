package day02_webDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_IlkTestOtomasyonu {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
        driver.get("https://www.testotomasyonu.com/");
        // 2. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
//            3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin
                String ExpectedTitle = "Test Otomasyonu";
                System.out.println("======================================");
                String ActualTitle = driver.getTitle();
                if (ExpectedTitle.equals(ActualTitle)){
                    
                    System.out.println("Test PASSED");
                }else{
                    System.out.println("Test FAILED");
                    System.out.println("Expected Title : "+ ExpectedTitle);
                    System.out.println("Actual Title : "+ ActualTitle);

                }
//            4. Sayfa adresini(url) yazdirin
                    System.out.println(driver.getCurrentUrl());
                    System.out.println("======================================");
//            5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.

                    String ExpectedUrl = "https://testotomasyonu.com/";
                    String ActualUrl = driver.getCurrentUrl();

                    if (ExpectedUrl.equals(ActualUrl)){
                        System.out.println("TEST PASSED");
                    }else{
                        System.out.println("TEST FAILED");
                        System.out.println("Expected Url" + ExpectedUrl);
                        System.out.println("Current Url" + ActualUrl);
                    }

                      //===Ternary ile cozumu===
//                    String res = (ExpectedURL.equals(ActualURL)) ? "TEST PASSED" : "TEST FAILED";
//                    System.out.println(res);
//            6. Sayfa handle degerini yazdirin
                        System.out.println(driver.getWindowHandle());
                        System.out.println(driver.getWindowHandles());

                        System.out.println("============================");
//            7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin 8. Sayfayi kapatin.

                        String expectedWord = "otomasyon";
                        String actualWord = driver.getPageSource();
                        if (actualWord.contains(expectedWord)){
                            System.out.println("Test PASSED");
                        }else{
                            System.out.println("TEST FAILED");
                        }
        driver.quit();
    }


}
