package com.consol.citrus;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.testng.CitrusParameters;
import com.consol.citrus.testng.spring.TestNGCitrusSpringSupport;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.consol.citrus.actions.EchoAction.Builder.echo;

public class SampleTestNGDataProviderDemo extends TestNGCitrusSpringSupport {

    @CitrusTest
    @CitrusParameters("message")
    @Test(dataProvider = "message")
    public void testDataProviders(String message) {
        run(echo("${message}"));
    }
    @DataProvider
    public Object [][] message() {
        return  new Object[][] {
                {"hello"},
                {"welcome"},
                {"bye"},
        };
    }
}
