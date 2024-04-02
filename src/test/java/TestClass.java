import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestClass {


    WebDriver _globalDriver;

    @BeforeTest
    public void SetupWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        _globalDriver = new ChromeDriver(options);
        _globalDriver.get("https://vynoteka.lt/");
        _globalDriver.manage().window().maximize();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a[1]")).click();


    }

    @Test
    public void test1() { // Atidarymo / pop up testas
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a[1]")).click();

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.id("omnisend-form-63ff1f31b40d6530aba59a6d-close-action")).click();
        _globalDriver.close();


    }

    @Test
    public void testVyno2() { // reklamos, subscribtion testas

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.id("omnisend-form-63ff1f31b40d6530aba59a6d-close-action")).click();
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/button")).click();


    }

    @Test
    public void testvyno3() { // Paieskos testas
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/div/input")).sendKeys("Energetinis");
        try {
            TimeUnit.SECONDS.sleep(3);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/button")).click();
        ((JavascriptExecutor) _globalDriver).executeScript("window.scrollTo(0, document.body.scrollHeight/2)");
        try {
            TimeUnit.SECONDS.sleep(2);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement textas = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div[2]/div/div[1]/div[4]/div[9]/div/div/div[2]/a/span"));

        assertEquals(textas.getText(), "Red Bull 0,25 L");
        _globalDriver.close();


    }

    @Test
    public void vynoAccountReg() {
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[4]/nav/div[1]/button")).click();
        try {
            TimeUnit.SECONDS.sleep(2);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div[1]/div/button")).click();
        try {
            TimeUnit.SECONDS.sleep(2);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        _globalDriver.findElement(By.id("firstname")).sendKeys(generateUsername());
        _globalDriver.findElement(By.id("lastname")).sendKeys(generateUsername());
        _globalDriver.findElement(By.id("email")).sendKeys(generateRandomEmail());
        _globalDriver.findElement(By.id("password")).sendKeys("Passwordas1!");
        _globalDriver.findElement(By.id("password_repeat")).sendKeys("Passwordas1!");
        _globalDriver.findElement(By.id("phone")).sendKeys("61234567");
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[1]/div/div/span[1]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[1]/div/div/span[2]/div/div/button[14]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[2]/div/div/span[1]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[2]/div/div/span[2]/div/div/button[5]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[3]/div/div/span[1]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[3]/div/div/span[2]/div/div/button[4]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[8]/div[1]/div/label/span")).click(); // ToS agree
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[2]/div/div[2]/button")).click(); // ToS checkbox
        try {
            Thread.sleep(18000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.id("omnisend-form-63ff1f31b40d6530aba59a6d-close-action")).click(); // add
        try {
            Thread.sleep(18000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/button")).click(); // add2
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/form/div[3]/div[2]/button")).click(); // praleisti
        _globalDriver.close();


    }

    @Test
    public void vynotekaCartOrderTest() {
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[4]/nav/div[1]/button")).click();
        try {
            TimeUnit.SECONDS.sleep(2);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div[1]/div/button")).click();
        try {
            TimeUnit.SECONDS.sleep(2);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        _globalDriver.findElement(By.id("firstname")).sendKeys(generateUsername());
        _globalDriver.findElement(By.id("lastname")).sendKeys(generateUsername());
        _globalDriver.findElement(By.id("email")).sendKeys(generateRandomEmail());
        _globalDriver.findElement(By.id("password")).sendKeys("Passwordas1!");
        _globalDriver.findElement(By.id("password_repeat")).sendKeys("Passwordas1!");
        _globalDriver.findElement(By.id("phone")).sendKeys("61234567");
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[1]/div/div/span[1]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[1]/div/div/span[2]/div/div/button[14]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[2]/div/div/span[1]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[2]/div/div/span[2]/div/div/button[5]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[3]/div/div/span[1]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[3]/div/div/span[2]/div/div/button[4]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[8]/div[1]/div/label/span")).click(); // ToS agree
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[2]/div/div[2]/button")).click(); // ToS checkbox
        try {
            Thread.sleep(18100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.id("omnisend-form-63ff1f31b40d6530aba59a6d-close-action")).click(); // add
        try {
            Thread.sleep(18100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/button")).click(); // add2
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/form/div[3]/div[2]/button")).click(); // praleisti (sukure acc)
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/div/input")).sendKeys("Energetinis");
        try {
            TimeUnit.SECONDS.sleep(3);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/button")).click(); // Paieska
        ((JavascriptExecutor) _globalDriver).executeScript("window.scrollTo(0, document.body.scrollHeight/2)"); // scrollas
        try {
            TimeUnit.SECONDS.sleep(2);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String prekPavadinimas = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div[2]/div/div[1]/div[4]/div[6]/div/div/div[2]/a/span")).getText();

        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div[2]/div/div[1]/div[4]/div[9]/div/div/div[3]/div[2]/div[2]/button")).click();

        try {
            TimeUnit.SECONDS.sleep(2);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String kaina = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[3]/div[1]/div[2]/strong")).getText();


        try {
            TimeUnit.SECONDS.sleep(2);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div")).click();
        try {
            TimeUnit.SECONDS.sleep(2);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[1]/div[1]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[1]/div/div/input")).sendKeys("Vilnius, Laisves pr 85");
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/button")).click();
        try {
            TimeUnit.SECONDS.sleep(2);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/button")).click();
        try {
            TimeUnit.SECONDS.sleep(1);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div[1]/button")).click();
        try {
            TimeUnit.SECONDS.sleep(1);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/form/div[1]/div/button")).click();
        try {
            TimeUnit.SECONDS.sleep(1);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/form/div/button")).click();
        try {
            TimeUnit.SECONDS.sleep(2);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/div/div[2]/div[4]/div[2]/label")).click();
        try {
            TimeUnit.SECONDS.sleep(2);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/button")).click();
        try {
            TimeUnit.SECONDS.sleep(1);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[3]/div[1]/button")).click();
        try {
            TimeUnit.SECONDS.sleep(6);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement endKaina = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div[5]/span"));
        try {
            TimeUnit.SECONDS.sleep(3);// palaukiam 1 sec kol puslapis uzsikraus

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String endprekPavadinimas = _globalDriver.findElement(By.xpath("//html/body/div[1]/div[1]/main/section/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/a")).getText();
        Assert.assertEquals(kaina,endKaina.getText());
        assertEquals(prekPavadinimas,endprekPavadinimas);
        _globalDriver.close();




    }


    public static boolean assertEquals(String actual, String expected) {
        return actual.equals(expected);
    }

    public static String generateRandomEmail() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "example.com"};
        String[] characters = {"abcdefghijklmnopqrstuvwxyz", "0123456789"};

        Random random = new Random();

        StringBuilder email = new StringBuilder();

        // Generate username part
        int usernameLength = random.nextInt(10) + 5; // Random length between 5 to 14 characters
        for (int i = 0; i < usernameLength; i++) {
            String characterSet = characters[random.nextInt(2)]; // Selecting either alphabets or numbers
            char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
            email.append(randomChar);
        }

        // Adding '@' symbol
        email.append("@");

        // Selecting random domain
        String randomDomain = domains[random.nextInt(domains.length)];
        email.append(randomDomain);

        return email.toString();
    }

    public String generateUsername() {
        String[] characters = {"abcdefghijklmnopqrstuvwxyz", "0123456789"};

        Random random = new Random();

        StringBuilder username = new StringBuilder();

        // Generate username part
        int usernameLength = random.nextInt(10) + 5; // Random length between 5 to 14 characters
        for (int i = 0; i < usernameLength; i++) {
            String characterSet = characters[random.nextInt(2)]; // Selecting either alphabets or numbers
            char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
            username.append(randomChar);

        }
        return username.toString();
    }


}
