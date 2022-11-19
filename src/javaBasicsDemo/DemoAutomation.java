package javaBasicsDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ab\\Downloads\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ab\\Downloads\\BrowserDriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
System.setProperty("webdriver.edge.driver", "C:\\Users\\Ab\\Downloads\\BrowserDriver\\edgedriver_arm64\\msedgedriver.exe");
ChromeDriver driver = new ChromeDriver();
//FirefoxDriver driver =new FirefoxDriver();
//EdgeDriver driver = new EdgeDriver();
driver.get("http://www.google.com");
	}

}
