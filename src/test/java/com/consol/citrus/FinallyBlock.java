package com.consol.citrus;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.testng.spring.TestNGCitrusSpringSupport;
import org.testng.annotations.Test;

import static com.consol.citrus.actions.EchoAction.Builder.echo;
import static com.consol.citrus.container.FinallySequence.Builder.doFinally;

@Test
public class FinallyBlock extends TestNGCitrusSpringSupport {

    @CitrusTest
    public void finallyBlockSample() {
        given(
                doFinally()
                        .actions(echo("Do finally - regardless of any error before"))
        );

        $(echo("Hello Test Framework"));
    }
}
