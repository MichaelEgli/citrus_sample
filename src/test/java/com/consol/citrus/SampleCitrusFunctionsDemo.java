package com.consol.citrus;

import org.testng.annotations.Test;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.testng.spring.TestNGCitrusSpringSupport;

import static com.consol.citrus.actions.EchoAction.Builder.echo;

@Test
public class SampleCitrusFunctionsDemo extends TestNGCitrusSpringSupport {

    @CitrusTest
    public void testStringFunctions() {
        variable("uname", "Michael Egli");
        run(echo("My name is citrus:substring(${uname}, 0, 8)"));
        run(echo("citrus:concat('My name is ', ${uname})"));
        run(echo("${uname} has length => citrus:stringLength(${uname})"));
    }
}
