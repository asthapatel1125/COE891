package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculationTest.class, GreetingTest.class,EmailIdValidatorTest.class})
public class AllTests {

}
