package sessionpractice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Examplespractice 
{

	public static void main(String[] args) 
	{
		FirefoxDriver xyz = new FirefoxDriver();
		xyz.manage().window().maximize();
			xyz.get("https://amazon.in");
		
		String Expectedtitle="Amazon";
		System.out.println("desiredvalue"+ Expectedtitle);
		
		String actualtitle =xyz.getTitle();
		System.out.println("truevalue"+ actualtitle);
		
		if (actualtitle.contains(Expectedtitle))
				{
			System.out.println("success");
				}
		else 
			{
			xyz.navigate().to("https://flipkart.com");
			}
		xyz.close();
	
		
		
	}

}
