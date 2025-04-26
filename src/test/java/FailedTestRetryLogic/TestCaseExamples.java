package FailedTestRetryLogic;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseExamples {
	@Test(retryAnalyzer = IRetryAnalyzerInterInterfaces.class)
	public void testCase1() {
		System.out.println("Executing test case 1");

	}

	@Test(retryAnalyzer = IRetryAnalyzerInterInterfaces.class)
	public void testCase2() {
		System.out.println("Executing test case 2");

	}

	@Test(retryAnalyzer = IRetryAnalyzerInterInterfaces.class)
	public void testCase3() {
		System.out.println("Executing test case 3");
		AssertJUnit.assertTrue(false);

	}

	@Test(retryAnalyzer = IRetryAnalyzerInterInterfaces.class)
	public void testCase4() {
		System.out.println("Executing test case 4");
		AssertJUnit.assertTrue(false);

	}

}
