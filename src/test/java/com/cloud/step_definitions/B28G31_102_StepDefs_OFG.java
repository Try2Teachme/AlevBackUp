package com.cloud.step_definitions;

import com.cloud.pages.BasePage;
import io.cucumber.java.en.When;

public class B28G31_102_StepDefs_OFG extends BasePage {

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        photosOption.click();
    }
}
