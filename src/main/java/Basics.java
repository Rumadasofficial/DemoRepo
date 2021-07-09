import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ruma.das\\Downloads\\learn\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		takeScreenshot("google_LandingPage");
		System.out.println(driver.getTitle());
		driver.close();

	}
	
	public static void takeScreenshot(String fileName) throws IOException {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("C:\\Users\\ruma.das\\eclipse-workspace\\seleniumPractice\\SeleniumPractise\\Screenshot/"+fileName+".png"));
	}

}
