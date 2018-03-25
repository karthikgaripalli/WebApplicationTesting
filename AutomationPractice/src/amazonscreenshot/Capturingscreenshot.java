package amazonscreenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturingscreenshot 
{

	public static void main(String[] args) 
	{
		FirefoxDriver shop = new FirefoxDriver();
		shop.get("http://amazon.com");
		
		shop.getScreenshotAs(OutputType.FILE);
		shop.close();
	}

}
