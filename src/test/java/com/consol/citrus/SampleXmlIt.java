package com.consol.citrus;

import com.consol.citrus.annotations.CitrusResource;
import com.consol.citrus.annotations.CitrusXmlTest;
import com.consol.citrus.testng.TestNGCitrusSupport;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Eglis Sample Xml IT
 *
 * @author Michael
 * @since 2022-09-23
 *
 * Fails with error "please add spring support".
 * Spring support relies on the Spring and related plugins, which are bundled and enabled by default in IntelliJ IDEA Ultimate. This functionality is not available in IntelliJ IDEA Community Edition and IntelliJ IDEA Edu.
 * https://www.jetbrains.com/help/idea/spring-support.html
 * 
 */
public class SampleXmlIt extends TestNGCitrusSupport {
    @CitrusXmlTest(
            name = "SampleXmlIt"
    )
    @Test
    @Parameters("runner")
    public void sampleXmlIt(@CitrusResource @Optional TestCaseRunner runner) {
    }
}
