package hu.nbdev.home.cucumber.stepdefs;

import hu.nbdev.home.MicroserviceJhipsterApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MicroserviceJhipsterApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
