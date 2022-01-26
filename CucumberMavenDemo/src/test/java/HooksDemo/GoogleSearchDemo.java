package HooksDemo;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GoogleSearchDemo {

	@Before ("@TaggedHook")
	public static void browserlaunch() {
		
		System.out.println("Launch chrome browser");
		
	}
	
	@After("@TaggedHook")
	public void closebrowser() {
		System.out.println("Closing the browser");
	}
}

