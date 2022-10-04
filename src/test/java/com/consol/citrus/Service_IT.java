package com.consol.citrus;

import com.consol.citrus.annotations.CitrusTest;
import org.testng.annotations.Test;
import com.consol.citrus.testng.TestNGCitrusSupport;
import utils.LoggingService;

import static com.consol.citrus.actions.EchoAction.Builder.echo;

@Test
public class Service_IT extends TestNGCitrusSupport {

    @CitrusTest(name = "Service_IT")
    public void serviceTest() {
        given(
                echo("Setup the context")
        );

        when(
                echo("Trigger the event")
        );

        then(
                echo("Verify the outcome")
        );
    }
}
