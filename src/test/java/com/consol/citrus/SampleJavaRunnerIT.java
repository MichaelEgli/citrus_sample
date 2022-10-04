package com.consol.citrus;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.testng.spring.TestNGCitrusSpringSupport;
import org.testng.annotations.Test;

import static com.consol.citrus.actions.EchoAction.Builder.echo;

/**
 * @author Christoph Deppisch
 * @since 2.4
 */
@Test
public class SampleJavaRunnerIT extends TestNGCitrusSpringSupport {


    @CitrusTest
    public void shouldSendMail() {
        $(echo("Add 1000+ order and receive mail"));

    }
}