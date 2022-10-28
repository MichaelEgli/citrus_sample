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

    @CitrusTest
    public void testNumberFunctions() {
        run(echo("My name is citrus:maximum(12,0,8)"));
        run(echo("citrus:sum(1,2,3,4,5,6,7)"));
        run(echo("citrus:randomNumber(3)"));
    }
}
