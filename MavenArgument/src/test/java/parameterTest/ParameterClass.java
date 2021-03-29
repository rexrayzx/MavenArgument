package parameterTest;

import org.testng.annotations.Test;

public class ParameterClass {
	
	@Test
	public void demo() {
		String url=System.getProperty("url");
		String browser=System.getProperty("browser");
		
		System.out.println(url);
		System.out.println(browser);
	}
}
