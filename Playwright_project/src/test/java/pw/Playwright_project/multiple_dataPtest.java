package pw.Playwright_project;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class multiple_dataPtest {
	public Playwright pw;
	public Browser br;
	public BrowserContext bct;
	public Page pg;
	@BeforeMethod
void lauch_conf()
{
//		pw=Playwright.create();
//	  br=pw.chromium().launch(
//				new BrowserType.LaunchOptions()
//				.setChannel("msedge")
//				.setHeadless(false)
//				.setSlowMo(2000)
//				);
//		System.out.println("2.Edge browser configuration done");	
//		bct=br.newContext();
//		System.out.println("3.Isolated Edge browser opened");	
//		pg=bct.newPage();
}
	@AfterMethod
	void close_con()
	{
//		bct.close();
//		pw.close();
	}
  @Test(dataProvider = "dp")
  public void login_demowebshop(String email, String pass) {	
		pw=Playwright.create();
		System.out.println("1.playwright connection done");
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
		pg.navigate("https://demowebshop.tricentis.com/login");
		System.out.println("5.demowebshop website launched!!");	
		pg.locator("#Email").fill(email);
		System.out.println("6.email entered!!");	
		pg.locator("#Password").fill(pass);
		System.out.println("7.password  entered!!");	
		pg.locator("//input[@value='Log in']").click();
		System.out.println("8.login  clicked!!!");	
		bct.close();
		System.out.println("9.browser closed!!!");	
//		pw.close();
		System.out.println("10.playwright connection closed!!!");	
		System.out.println("-------------------------------------");
  }

  @DataProvider(parallel = true)
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"gargi@gmail.com", "gargi@123" },
      new Object[] {"harshal@gmail.com", "harshal@123" },
      new Object[] {"kaveri@gmail.com", "kaveri@123" },
      new Object[] {"ajay@gmail.com", "ajay@123" },
      new Object[] {"shruti@gmail.com", "shruti@123" },
    };
  }
}
