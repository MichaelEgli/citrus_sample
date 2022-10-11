package com.consol.citrus;

import static com.consol.citrus.actions.CreateVariablesAction.Builder.createVariable;
import static com.consol.citrus.actions.EchoAction.Builder.echo;

public class BeforeLogBehavior implements TestBehavior {
    public void apply(TestActionRunner runner) {
        runner.run(createVariable("BeforeLog", "test before log"));

        runner.run(echo("beforeBehavior"));
    }
}
