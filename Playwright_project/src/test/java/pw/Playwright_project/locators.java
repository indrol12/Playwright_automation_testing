package pw.Playwright_project;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class locators {
public static void main(String[] args) {
	Playwright pwt=Playwright.create();
	
	Browser br=pwt.chromium().launch(
			new BrowserType.LaunchOptions()
			.setChannel("chrome")
			.setHeadless(false)
			);
	
	BrowserContext bct=br.newContext();	
	Page p=bct.newPage();	
	p.navigate("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
 
	//name locator
	p.locator("[name='name']").fill("Isha");//practice form name field
 
	//ID locator
	p.locator("#email").fill("isha12@gmail.com");//practice form email field
 
	//xpath locator
	p.locator("(//input[@type='radio'])[2]").click();//practice form gender field
 
	//getyplaceholder locator
	p.getByPlaceholder("Enter Mobile Number").fill("8790784321");//enters mobile number
 
	//getbylabel locator
	p.getByLabel("Date of Birth:").fill("2002-11-30");//enters dob
	
	//css locator
	p.locator("input#subjects").fill("Maths");
	
	// getByRole locator // Select checkbox
	p.getByRole(AriaRole.CHECKBOX).nth(0).check();
	
	p.getByRole(AriaRole.CHECKBOX).nth(2).check();
	// getBytext
	p.getByText("Selenium Tutorial").click();
 
	p.close();
	pwt.close();
	
}
}
