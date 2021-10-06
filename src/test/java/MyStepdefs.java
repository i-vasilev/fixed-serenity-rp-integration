import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.steps.StepEventBus;

public class MyStepdefs {
    @When("Step 5")
    public void step5() {
        System.out.println(StepEventBus.getEventBus()
                                       .getCurrentStep()
                                       .toString());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("Step 2")
    public void step2() {
        System.out.println(StepEventBus.getEventBus()
                                       .getCurrentStep()
                                       .toString());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Given("Step 1")
    public void step1() {
        System.out.println(StepEventBus.getEventBus()
                                       .getCurrentStep()
                                       .toString());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("Step 3")
    public void step3() {
        System.out.println(StepEventBus.getEventBus()
                                       .getCurrentStep()
                                       .toString());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("Step 4")
    public void step4() {
        System.out.println(StepEventBus.getEventBus()
                                       .getCurrentStep()
                                       .toString());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("Step 6")
    public void step6() {
        System.out.println(StepEventBus.getEventBus()
                                       .getCurrentStep()
                                       .toString());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("Step 7")
    public void step7() {
        System.out.println(StepEventBus.getEventBus()
                                       .getCurrentStep()
                                       .toString());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("Step 8")
    public void step8() {
        System.out.println(StepEventBus.getEventBus()
                                       .getCurrentStep()
                                       .toString());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("Step 9")
    public void step9() {
        System.out.println(StepEventBus.getEventBus()
                                       .getCurrentStep()
                                       .toString());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("Step 10")
    public void step10() {
        System.out.println(StepEventBus.getEventBus()
                                       .getCurrentStep()
                                       .toString());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
