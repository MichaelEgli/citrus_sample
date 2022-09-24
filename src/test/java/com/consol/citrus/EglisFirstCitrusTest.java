package com.consol.citrus;

import static com.consol.citrus.actions.EchoAction.Builder.echo;

import com.consol.citrus.annotations.CitrusResource;
import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.testng.TestNGCitrusSupport;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Eglis erster Citrus Test
 *
 * @author Michael Egl
 * @since 2022-09-16
 */
public class EglisFirstCitrusTest extends TestNGCitrusSupport {
    @CitrusTest
    @Test
    @Parameters("runner")
    public void eglisFirstCitrusTest(@CitrusResource @Optional TestCaseRunner runner) {
        runner.run(echo("TODO: Code the test EglisFirstCitrusTest"));
        System.out.println("Hello Egli");

    }
}
