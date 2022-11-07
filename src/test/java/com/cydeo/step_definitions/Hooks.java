package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {



   // @Before// While choosing @Before we need to import it from cucumber. When you type its name you will see
    // options
  //  public void setupScenario(){
  //      System.out.println("Setting up browser using cucumber @Before each scenario");
  //      Driver.getDriver().get("Some url");
  ///  }

    // @Before(value = "@login",order=2)
  //   public void setupForLogin(){
        //if you want any code to run before any specific feature/scenario, you can use value= "@tagname" to
         // determine this
  //       System.out.println("Setting up browser using cucumber @Before each scenario step for login");
  //   }

    // @Before(value = "@db", order=3)
  //   public void setupDatabaseScenario(){

 //    }
 //   @After
 //   public void teardownScenario(Scenario scenario){
        //We will implement taking screenshot in this method

  //      if(scenario.isFailed()) {
   //         byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
    //        scenario.attach(screenshot, "image/png", scenario.getName());
   //     }

        //System.out.println("it will be closing browser using cucumber @After each scenario");
  //      Driver.closeDriver();

//    }

    //@BeforeStep
 //   public void setupScenarioStep(){
 //       System.out.println("Setting up browser using cucumber @Before each scenario step");
  //  }

    // @BeforeStep
 //   public void setupScenarioStepForLogin(){
  //      System.out.println("Setting up browser using cucumber @Before each scenario step for login");
 //   }
//}
    @After
    public void teardownScenario(Scenario scenario){
        // We will implement taking screenshot in this method
        //System.out.println("It will be closing browser using cucumber @After each scenario");

        if(scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());

        }

        Driver.closeDriver();
    }



    //@Before
    public void setupScenario(){
        System.out.println("Setting up browser using cucumber @Before each scenario");
        Driver.getDriver().get("URL of your app");
    }


    //@Before (value = "@login", order=2)
    public void setupForLogin(){
        // If you want any code to run before any specific feature/scenario,
        // you can use value= "@tagname" to determine this
        System.out.println("====this will only apply to scenarios with @login tag");
    }

    //@Before (value="@db" , order=3)
    public void setupDatabaseScenario(){
        System.out.println("====this will only apply to scenarios with @db tag");
    }

    //@BeforeStep
    public void setupScenarioStep(){
        System.out.println("--------> applying setup using @BeforeStep");
    }

    //@AfterStep
    public void afterStep(){
        System.out.println("--------> applying tearDown using @AfterStep");
    }



}