package org.step;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step {
	public static final String AUTOMATE_USERNAME = "yugeshyugi_EzdkA2";
	  public static final String AUTOMATE_ACCESS_KEY = "ujUSLusm3BVoU6ZAWizZ";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  
	static WebDriver d;
	@Given("To enter into login page")
	public void to_enter_into_login_page() throws MalformedURLException {
		 DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("os_version", "11");
		    caps.setCapability("resolution", "1920x1080");
		    caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "96.0");
		    caps.setCapability("os", "Windows");
		    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
		    caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
		      d = new RemoteWebDriver(new URL(URL), caps);
		      d.get("https://www.facebook.com/");
//	   d.get("https://www.facebook.com/");
	}
	@When("to enter user {string} and pass {string}")
	public void to_enter_user_and_pass(String string, String string2) {
	   WebElement em = d.findElement(By.id("email"));
	   em.sendKeys(string);
	   WebElement g = d.findElement(By.id("pass"));
	   g.sendKeys(string2);
	   Assert.assertTrue(false);
	   WebElement lo = d.findElement(By.name("login"));
	   lo.click();
	   String yuu = d.getCurrentUrl();
//		  Assert.assertTrue(false);
	}

	@Then("To validate the currecent url page")
	public void to_validate_the_currecent_url_page() {
	  System.out.println("Done");
	  
	}
	@After
	public static void After2(Scenario se) throws IOException {
//		String name = se.getName();
//		File fr = new File("/Users/yugesh/eclipse-workspace/CUCUMBER/screenshot/"+name+".png");
		TakesScreenshot tk =(TakesScreenshot) d;
//		File sc = tk.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(sc, fr);
//	d.quit();
	
	byte[] hy = tk.getScreenshotAs(OutputType.BYTES);
	se.embed(hy, "image/png");
	
	}

}
