package com.consol.citrus;

import com.consol.citrus.actions.AbstractTestAction;
import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.testng.spring.TestNGCitrusSpringSupport;
import org.testng.annotations.Test;

import utils.LoggingService;

import static com.consol.citrus.DefaultTestActionBuilder.action;
import static com.consol.citrus.actions.EchoAction.Builder.echo;

@Test
public class SampleJavaDesignerDrawbackIT extends TestNGCitrusSpringSupport {

    LoggingService obj = new LoggingService();
    @CitrusTest
    public void testLogService()
    {
        $(echo("Before log called"));
        obj.logs("Logs will be printed");
/*        action(new AbstractTestAction() {
            @Override
            public void doExecute(com.consol.citrus.context.TestContext testContext) {
                obj.logs("Logs will be printed....");
            }
        });*/
        $(echo("After log called"));
    }
}