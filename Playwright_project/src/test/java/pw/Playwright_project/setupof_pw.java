package pw.Playwright_project;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class setupof_pw {

	public Playwright pw;
	public Browser br;
	public BrowserContext bct;
	public Page pg;
	@BeforeTest
	void launch_conf()
	{
		pw=Playwright.create();//created the instance of playwright
		System.out.println("1.playwright connection established!!");						
	}
	@AfterTest
	void close_pw()
	{
	//	bct.close();
		System.out.println("11.all browser closed");
	//	pw.close();
		System.out.println("11.Playwright connection closed");
	}
}
