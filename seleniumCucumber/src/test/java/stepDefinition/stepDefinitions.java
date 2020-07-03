package stepDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions {
    @Given("^sample feature file is ready$")
    public void givenStatment() throws InterruptedException{
           System.out.println("Given statement executed successfully");
           System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/driver/chromedriver.exe");
           WebDriver driver = new ChromeDriver();
       	
           String baseUrl = "https://www.google.co.in/";
           // launch Fire fox and direct it to the Base URL
           driver.get(baseUrl);
           //Wait for 5 Sec
           Thread.sleep(5000);
           
           driver.quit();

    }
    @When("^I run the feature file$")
    public void whenStatement(){
           System.out.println("When statement execueted successfully");
    }
    @Then("^run should be successful$")
    public void thenStatment(){
           System.out.println("Then statement executed successfully");
    }
}