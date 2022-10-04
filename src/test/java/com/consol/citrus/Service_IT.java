package com.consol.citrus;

import com.consol.citrus.annotations.CitrusTest;
import org.testng.annotations.Test;
import com.consol.citrus.testng.TestNGCitrusSupport;
import utils.LoggingService;

import static com.consol.citrus.actions.EchoAction.Builder.echo;

@Test
public class Service_IT extends TestNGCitrusSupport {

    LoggingService obj = new LoggingService();
    @CitrusTest(name = "Service_IT")
    public void serviceTest() {
        run(echo("Before service call"));
        obj.logs("Logs will be printed...");
        run(echo("After  service call"));
    }
}
