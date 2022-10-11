package com.consol.citrus;

import static com.consol.citrus.actions.CreateVariablesAction.Builder.createVariable;
import static com.consol.citrus.actions.EchoAction.Builder.echo;

public class AfterLogBehavior implements TestBehavior {
    public void apply(TestActionRunner runner) {
        runner.run(createVariable("AfterLog", "test after log"));

        runner.run(echo("afterBehavior"));
    }
}
