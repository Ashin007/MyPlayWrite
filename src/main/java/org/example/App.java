package org.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Playwright playwright = Playwright.create();


        Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setChannel("firefox").setHeadless(false));
        Page page = browser.newPage();
        page.navigate("http://www.googl.com");
        System.out.println(page.title());
        //playwright.close();
    }
}
