import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AjaxForm {
    WebDriver driver;

    public AjaxForm(WebDriver driver) {
        this.driver = driver;
    }

    @Given("user is on a Ajax form site")
    public void navigateTo(){
        driver.get("http://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
    }

    @When("I fill the form and submit")
    public void AjaxFormSubmit() {
        driver.findElement(By.id("btn-submit")).click();

        driver.findElement(By.id("title")).sendKeys("Name");
        driver.findElement(By.id("description")).sendKeys("Comment");

        driver.findElement(By.id("btn-submit")).click();


        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I assert whether the form was submitted successfuly")
    public void assertion(){
        Assert.assertTrue(driver.getPageSource().contains("Form submited Successfully!"));
    }
}