package com.consol.citrus;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.testng.spring.TestNGCitrusSpringSupport;
import org.testng.annotations.Test;

import static com.consol.citrus.actions.EchoAction.Builder.echo;

@Test
public class SampleVariableDemo extends TestNGCitrusSpringSupport
{
    @CitrusTest
    public void testVariable1() {
        variable("email", "egli@test.ch");
        run(echo("Email Variable declared loacally ${email}"));
        run(echo("Global variable ${//project.name//} : -> ${project.name}"));
        // run(echo("Global variable ${//default.test.author//} : -> ${default.test.author}"));
    }

    @CitrusTest
    public void testVariable2() {
        // run(echo("Email Variable declared loacally ${email}"));
    }
}
