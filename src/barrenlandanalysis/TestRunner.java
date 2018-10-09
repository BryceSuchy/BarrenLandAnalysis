/*
* Written by: Bryce Suchy
* 10/9/2018
*/
package barrenlandanalysis;

import test.TestJUnit;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(TestJUnit.class);
        for (Failure failure : result.getFailures()) {
            System.out.println("Tests failed. " + failure.toString());
        }

        System.out.println("Tests were successfull! " + result.wasSuccessful());
    }

}
