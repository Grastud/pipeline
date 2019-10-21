package fhnw.ch.swc;

	/**
	 * This is the magic HelloWorld class 
	 */
public class HelloWorld {

	/**
	 * This is the one and only main method 
	 * @param args what ever you want
	 */
	public static void main(String[] args) {
		
	    HelloWorld hw = new HelloWorld();
		System.out.println(hw.sayHello());

	}
	
	public String sayHello() {
	    return "Hello Automated World ;-)";
	}

}
