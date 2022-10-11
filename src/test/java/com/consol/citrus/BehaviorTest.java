package com.consol.citrus;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.testng.spring.TestNGCitrusSpringSupport;
import org.testng.annotations.Test;

import static com.consol.citrus.actions.ApplyTestBehaviorAction.Builder.apply;
import static com.consol.citrus.actions.EchoAction.Builder.echo;

@Test
public class BehaviorTest extends TestNGCitrusSpringSupport {

    @CitrusTest
    public void behaviorTest() {
        run(apply(new BeforeLogBehavior()));
        run(echo("Successfully applied before log behavior"));

        run(echo("Test 1 starts...."));

        run(apply(new AfterLogBehavior()));
        run(echo("Successfully applied after log behavior"));
    }
}
