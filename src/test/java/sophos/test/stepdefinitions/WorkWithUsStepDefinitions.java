package sophos.test.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import sophos.test.interactions.PrintWork;
import sophos.test.questions.ListWork;
import sophos.test.tasks.WorkWithUs;
import sophos.test.utils.MyDriver;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class WorkWithUsStepDefinitions {

     List<String> job = new ArrayList<>();

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("stephany");
    }


    @Given("^The user accesses the sophos solutions website$")
    public void theUserAccessesTheSophosSolutionsWebsite() {
        OnStage.theActorInTheSpotlight().whoCan(BrowseTheWeb.with(MyDriver.aChromeDriver().inTheWebPage("https://www.sophossolutions.com/")));

    }

    @When("^The user enters the tab Work with us \"([^\"]*)\" y \"([^\"]*)\"$")
    public void the_user_enters_the_tab_Work_with_us_y(String work1, String work2) {
        OnStage.theActorInTheSpotlight().attemptsTo(WorkWithUs.WorkWithUs(job,work1,work2));

    }

    @Then("^He will see the job names in console$")
    public void heWillSeeTheMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ListWork.print(job)));

    }

}
