package filesdownload;

import junit.framework.Assert;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;

public class FileDownloaderTest {
    WebDriver driver;

    @Test
    public void downloadAFile() throws Exception {
        driver = new FirefoxDriver();
        FileDownloader downloadTestFile = new FileDownloader(driver);
        driver.get("http://www.bibleleague.org/resources/bible-download/english-bible");
//        driver.get("http://test-sampling.nexus.bazaarvoice.com/");
        WebElement downloadLink = driver.findElement(By.xpath(".//*[@id='main-container']/div[1]/div/div[2]/div[1]/div[2]/ul/li[2]/a"));
//        driver.findElement(By.xpath("html/body/div[1]/div[2]/section[1]/aside[1]/section/p/a")).click();
//        driver.findElement(By.xpath(".//*[@id='login_email']")).sendKeys("ldap");
//        driver.findElement(By.xpath(".//*[@id='login_password']")).sendKeys("pass");
//        driver.findElement(By.xpath(".//*[@id='login_form']/p/button")).click();
//        driver.get("http://test-sampling.nexus.bazaarvoice.com/admin/members");
//        WebElement downloadLink = driver.findElement(By.xpath("//a[@id='exportCSV']"));

        String downloadedFileAbsoluteLocation = downloadTestFile.downloadFile(downloadLink);

        Assert.assertEquals(new File(downloadedFileAbsoluteLocation).exists(), true);
        Assert.assertEquals(downloadTestFile.getHTTPStatusOfLastDownloadAttempt() == 200, true);
    }

    @AfterMethod
    public void after(){
        driver.close();
    }
}
