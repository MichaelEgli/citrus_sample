package com.consol.citrus;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.testng.spring.TestNGCitrusSpringSupport;
import org.testng.annotations.Test;
import utils.LoggingService;

import static com.consol.citrus.actions.EchoAction.Builder.echo;

/**
 * @author Christoph Deppisch
 * @since 2.4
 */
@Test
public class SampleJavaRunnerIT extends TestNGCitrusSpringSupport {

    LoggingService obj = new LoggingService();
    @CitrusTest
    public void testLogService() {
        $(echo("Before log called"));
        obj.logs("Logs will be printed...");
        $(echo("After log called"));
    }
}