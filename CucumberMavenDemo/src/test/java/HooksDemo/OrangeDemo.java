package HooksDemo;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class OrangeDemo {

	@Before ("@TaggedHooks")
	public static void Chromebrowserlaunch() {
		
		System.out.println("Launching the chrome browser");
		
	}
	
	@After("@TaggedHooks")
	public void closebrowser() {
		System.out.println("Closing the chrome browser");
	}
}
