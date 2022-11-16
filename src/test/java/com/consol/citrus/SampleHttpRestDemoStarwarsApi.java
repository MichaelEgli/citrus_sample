package com.consol.citrus;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.http.client.HttpClient;
import com.consol.citrus.http.config.annotation.HttpClientConfig;
import com.consol.citrus.testng.spring.TestNGCitrusSpringSupport;
import org.springframework.http.HttpStatus;
import org.testng.annotations.Test;

import static com.consol.citrus.actions.EchoAction.Builder.echo;
import static com.consol.citrus.http.actions.HttpActionBuilder.http;

public class SampleHttpRestDemoStarwarsApi extends TestNGCitrusSpringSupport {

    @HttpClientConfig(requestUrl = "https://swapi.dev/api/people")
    HttpClient starwarsClient;

    @Test
    @CitrusTest
    public void tetsGetAllPeople() {

        http().client(starwarsClient).send().get("/");
        http().client(starwarsClient).receive().response(HttpStatus.OK);

/*                .validate("$", hasSize(2)).extractFromPayload("$", "response");
        run(echo("${response}"));*/

    }
}
