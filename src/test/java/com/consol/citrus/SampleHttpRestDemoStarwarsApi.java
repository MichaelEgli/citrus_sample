package com.consol.citrus;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.http.client.HttpClient;
import com.consol.citrus.testng.spring.TestNGCitrusSpringSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.testng.annotations.Test;

import static com.consol.citrus.actions.EchoAction.Builder.echo;
import static com.consol.citrus.http.actions.HttpActionBuilder.http;
import static org.hamcrest.Matchers.hasSize;

public class SampleHttpRestDemoStarwarsApi extends TestNGCitrusSpringSupport {

    @Autowired
    HttpClient starwarsClient;

    @Test
    @CitrusTest
    public void tetsGetAllPeople() {

        http().client(starwarsClient).send().get("people");
        http().client(starwarsClient).receive().response(HttpStatus.OK)
                .message()
                .body("Some response body");
                // .validate("$", hasSize(2)).extractFromPayload("$", "response");
        // run(echo("${response}"));

    }
}
