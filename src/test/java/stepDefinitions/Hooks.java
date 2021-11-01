package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
	
	//
	// @Before & @After annotations
	//

	@Before(order = 1)
	public void doSomethingBefore() {
		System.out.println("Before hook instruction");
	}

	@After
	public void doSomethingAfter() {
		System.out.println("After hook instruction");
	}

	@Before("@SanityTest")
	public void conditionalBefore() {
		System.out.println("Conditional before hook for @SanityTest tag");
	}

	@After(order = 2, value = "@SanityTest")
	public void conditionalAfter() {
		System.out.println("Conditional after hook for @SanityTest tag");
	}
	
	//
	// @BeforeStep & @AfterStep annotations
	//

	@BeforeStep(order = 1, value = "@SanityTest")
	public void doBeforeStep() {
		System.out.println("Before step instruction for @SanityTest tag");
	}

	@AfterStep(order = 1, value = "@SanityTest")
	public void doAfterStep() {
		System.out.println("After step instruction for @SanityTest tag");
	}

}