package smarttech.ny.hooks;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import smarttech.ny.basepage.ParentClass;

public class Hooks extends ParentClass {

	@Before
	public void setup() {
		initilization();
		
	}
	@After
	public void tearDown() {
		
	driver.quit();
	}
}
