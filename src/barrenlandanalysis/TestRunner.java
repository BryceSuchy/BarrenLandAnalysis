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
        
        System.out.println("Enter coordinates in the form of rectangles below." + "\n" + 
                "These rectangles are defined in a string, which consists of four integers" + "\n" + 
                "separated by single spaces, with no additional spaces in the string. " + "\n" +
                "The first two integers are the coordinates of the bottom left corner in the given rectangle," + "\n" +
                "and the last two integers are the coordinates of the top right corner. ");

        Result result = JUnitCore.runClasses(TestJUnit.class);
        for (Failure failure : result.getFailures()) {
            System.out.println("Tests failed. " + failure.toString());
        }

        System.out.println("Tests were successfull! " + result.wasSuccessful());
    }

}
