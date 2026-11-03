package pw.Playwright_project;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class firsttest_ofpw {

	public static void main(String[] args) {
		
		//1.create playwright instance
		Playwright pwr=Playwright.create();
		System.out.println("plawright connections is created!!");
		
		//2.Launch browser
		Browser brw=pwr.chromium().
				launch(new BrowserType.LaunchOptions()
						.setChannel("chrome").
						setHeadless(false));
		
		System.out.println("configuration of browser done!!");
			    	
		//3.isolated browser
		BrowserContext bct=brw.newContext();
		System.out.println("isolated browser launch!!");
		
		//4.create new object /new tab
		Page pg=bct.newPage();
		System.out.println("new tab opens!");
		
		pg.navigate("https://www.cravitaindia.com/");
		System.out.println("cravita website launch!!");
		
		System.out.println("title of cravita is:"+pg.title());
		System.out.println("url of cravita is:"+pg.url());
		
		bct.close();
		System.out.println("browser closed!!");
		
		//close playwright connection
		pwr.close();
		System.out.println("playwright connection closed!!");
	}
}
