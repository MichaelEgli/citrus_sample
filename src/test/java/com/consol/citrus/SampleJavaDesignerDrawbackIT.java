package com.consol.citrus;

import com.consol.citrus.actions.AbstractTestAction;
import com.consol.citrus.annotations.CitrusTest;
import org.testng.annotations.Test;
import com.consol.citrus.testng.TestNGCitrusSupport;
import utils.LoggingService;

import static com.consol.citrus.DefaultTestActionBuilder.action;

@Test
public class SampleJavaDesignerDrawbackIT extends TestNGCitrusSupport {

    LoggingService obj = new LoggingService();
    @CitrusTest
    public void testLogService()
    {
        System.out.println("Before log called");
        action(new AbstractTestAction() {
            @Override
            public void doExecute(com.consol.citrus.context.TestContext testContext) {
                obj.logs("Logs will be printed....");
            }
        });
        System.out.println("After log called");
    }
}