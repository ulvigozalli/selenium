package day03_webDriverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3_driverManageMetodlari4 {
    public static void main(String[] args) {
//          Yeni bir class olusturun (TekrarTesti)
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

//          2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
//          doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
            driver.get("https://www.youtube.com/");
            String expectedYouTubeTitle = "youtube";
            String actualYoutubeTitle = driver.getTitle();
            if (expectedYouTubeTitle.equals(actualYoutubeTitle)){
                System.out.println("Youtube basligi " + expectedYouTubeTitle + " ile ayni");
            }else{
                System.out.println("YouTube web sayfa basligi : "+ actualYoutubeTitle);
            }

//          3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
            String expectedUrlText = "youtube";
            String actualUrlText = driver.getCurrentUrl();
            if (actualUrlText.contains(expectedUrlText)) {
                System.out.println("Baslik icermektedir ");
            }else{
                System.out.println("Icermiyor : " + actualUrlText);
            }
//        4. Daha sonra testotomasyonu sayfasina gidin https://www.testotomasyonu.com/
            driver.navigate().to("https://www.testotomasyonu.com/");

//        5. Youtube sayfasina geri donun
            driver.navigate().back();

//        6. Sayfayi yenileyin
            driver.navigate().refresh();

//        7. Testotomasyonu sayfasina donun
            driver.navigate().forward();

//        8. Sayfayi tamsayfa yapin
            driver.manage().window().fullscreen();

//        9. Ardından sayfa başlığının "Test" içerip içermediğini (contains) test edin, Yoksa doğru başlığı(Actual Title) yazdırın.
            String expectedSayfaBasligi = "Test";
            String actualSayfaBasligi   = driver.getTitle();
            if (actualSayfaBasligi.contains(expectedSayfaBasligi)){
                System.out.println("TEST PASSED");
            }else{
                System.out.println("TEST FAILED : " + actualSayfaBasligi);
            }
//        10.Sayfa URL'sinin https://www.testotomasyonu.com/ olup olmadığını test edin, degilse doğru URL'yi yazdırın
          String expectedSayfaUrl = "https://www.testotomasyonu.com/";
          String actualSayfaUrl = driver.getCurrentUrl();
          if (actualSayfaUrl.equals(expectedSayfaUrl)){
              System.out.println("TEST PASSED");
          }else{
              System.out.println("TEST FAILED : " + actualSayfaUrl);
          }
//        11.Sayfayi kapatin
          driver.quit();
    }

}
