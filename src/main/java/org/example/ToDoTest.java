package org.example;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import java.util.*;

public class ToDoTest {
    public static void main(String[] args) {

                try (Playwright playwright = Playwright.create()) {
                    Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                            .setHeadless(false));
                    BrowserContext context = browser.newContext();

                    // Open new page
                    Page page = context.newPage();

                    // Go to https://demo.playwright.dev/todomvc/
                    page.navigate("https://demo.playwright.dev/todomvc/");

                    // Go to https://demo.playwright.dev/todomvc/#/
                    page.navigate("https://demo.playwright.dev/todomvc/#/");

                    // Click [placeholder="What needs to be done?"]
                    page.click("[placeholder=\"What needs to be done?\"]");

                    // Click [placeholder="What needs to be done?"]
                    page.click("[placeholder=\"What needs to be done?\"]");

                    // Click [placeholder="What needs to be done?"]
                    page.click("[placeholder=\"What needs to be done?\"]");

                    // Fill [placeholder="What needs to be done?"]
                    page.fill("[placeholder=\"What needs to be done?\"]", "here is my list");

                    // Click text=Double-click to edit a todo
                    page.click("text=Double-click to edit a todo");
                }
            }
}
