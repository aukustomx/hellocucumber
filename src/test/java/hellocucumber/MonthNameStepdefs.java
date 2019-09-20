package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class MonthNameStepdefs {

    private Optional<String> actualMonthname;
    private int monthnumber;

    @Given("the number of month is \"([^\"]*)\"$")
    public void theNumberOfMonthIs(Integer monthnumber) {
        this.monthnumber = monthnumber;
    }

    @When("I ask what is the name of month")
    public void iAskWhatIsTheNameOfMonth() {
        actualMonthname = MonthName.ofMonthNumber(monthnumber);
    }

    @Then("I should get {string}")
    public void iShouldGet(String expectedMonthname) {
        var name = actualMonthname.orElseThrow(() -> new RuntimeException("No existe un nombre de mes para el número " + monthnumber));
        assertEquals(expectedMonthname, name);
    }
}