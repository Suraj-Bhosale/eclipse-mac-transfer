package com.playwright;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightBasics {

	public static void main(String[] args) {
	    try (Playwright playwright = Playwright.create()) {
	       // Browser browser = playwright.webkit().launch();
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	        Page page = browser.newPage();
	        page.navigate("https://www.infosys.com/");
	        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
	      }
	   }

}
