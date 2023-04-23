package org.example;


import com.microsoft.playwright.*;
import org.testng.annotations.Test;

import java.nio.file.Paths;

public class AppTest
{
        @Test
        public void myTest() {




        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();

            context.tracing().start(new Tracing.StartOptions()
                    .setScreenshots(true)
                    .setSnapshots(true));

            // Open new page
            Page page = context.newPage();

            // Go to https://www.youtube.com/
            page.navigate("https://www.youtube.com/");

            // Click [placeholder="Search"]
            page.click("[placeholder=\"Search\"]");

            // Fill [placeholder="Search"]
            page.fill("[placeholder=\"Search\"]", "ashin vijayan");

            // Click button:has-text("Search")
            page.click("button:has-text(\"Search\")");
            // assert page.url().equals("https://www.youtube.com/results?search_query=ashin+vijayan");

            // Click [aria-label="Search filters"]
            page.click("[aria-label=\"Search filters\"]");

            // Click yt-formatted-string:has-text("Channel")
            page.click("yt-formatted-string:has-text(\"Channel\")");
            // assert page.url().equals("https://www.youtube.com/results?search_query=ashin+vijayan&sp=EgIQAg%253D%253D");

            // Click text=Showing results for aswin vijayan Search instead for ashin vijayan Aswin Vijayan >> #img
            page.click("text=Showing results for aswin vijayan Search instead for ashin vijayan Aswin Vijayan >> #img");
            // assert page.url().equals("https://www.youtube.com/@AswinVijayanOfficial");

            // Click text=About
            page.click("text=About");
            // assert page.url().equals("https://www.youtube.com/@AswinVijayanOfficial/about");


            // Click #icon
            page.click("#icon");
            // assert page.url().equals("https://www.youtube.com/");

            context.tracing().stop(new Tracing.StopOptions()
                    .setPath(Paths.get("trace.zip")));
        }
    }
}
