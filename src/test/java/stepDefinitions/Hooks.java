package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void doSomethingBefore() {
		System.out.println("Before hook instruction");
	}

	@After
	public void doSomethingAfter() {
		System.out.println("After hook instruction");
	}
}