package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

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

}