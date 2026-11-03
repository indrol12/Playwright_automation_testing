package pw.Playwright_project;



import org.testng.annotations.Test;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class cross_browser_testing extends setupof_pw {
@Test
	void edge_browsertest()
	{
	  pw=Playwright.create();
		br=pw.chromium().launch(
				new BrowserType.LaunchOptions()
				.setChannel("msedge")
				.setHeadless(false)
				.setSlowMo(2000)
				);
		System.out.println("2.Edge browser configuration done");	
		bct=br.newContext();
		System.out.println("3.Isolated Edge browser opened");	
		pg=bct.newPage();
		System.out.println("4.new tab of Edge browser opened");	
		pg.navigate("https://www.bigbasket.com/");
	}
@Test
	void chrome_browsertest(){	
	pw=Playwright.create();
	br=pw.chromium().launch(
				new BrowserType.LaunchOptions()
				.setChannel("chrome")
				.setHeadless(false)
				.setSlowMo(2000)
				);
		System.out.println("5.Chrome browser configuration done");	
		bct=br.newContext();
		System.out.println("6.Isolated Chrome browser opened!");	
		pg=bct.newPage();
		System.out.println("7.new tab of Chrome browser opened!");	
	    pg.navigate("https://www.zudio.com/");
	}
@Test
	void firefox_browsertest()
	{
	pw=Playwright.create();
	br=pw.firefox().launch(
				new BrowserType.LaunchOptions()
				.setChannel("firefox")
				.setHeadless(false)
				.setSlowMo(2000)
				);
		System.out.println("8.firefox browser configuration done");	
		bct=br.newContext();
		System.out.println("9.Isolated fireox browser opened!");	
		pg=bct.newPage();
		System.out.println("10.new tab of firefox browser opened!");
	    pg.navigate("https://blinkit.com/?srsltid=AYCX9vICjda-2KtO3Iti8J5CnNmTWiV0v3T_t01f1fCx4r-3PGaJQntP");
	}
}
