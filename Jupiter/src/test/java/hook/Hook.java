package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

	@Before(value="@Search",order=2)
	public void beforeSearch() {
		System.out.println("********************");
		System.out.println("before method execution");
	}
	
	@Before(value="@Search",order=1)
	public void before() {
		System.out.println("************");
		System.out.println("Login code");
	}

	@After
	public void after() {
		System.out.println("after method executed");
		System.out.println("********************");
	}
}
