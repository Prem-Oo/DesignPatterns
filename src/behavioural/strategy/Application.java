package behavioural.strategy;

public class Application {

	public static void main(String[] args) {
		UserService us=new UserService(new SimpleEncodePassword());

	}
	
	/*
	 * Definition of Strategy Pattern: The Strategy pattern defines a family of algorithms, 
	 * encapsulates each algorithm, and makes the algorithms interchangeable within that family. 
	 * In your code, EncodePassword interface represents the family of algorithms, and SimpleEncodePassword class 
	 * encapsulates one of the algorithms.

Usage of Strategy Pattern: In the UserService class, the encodePassword field is of type EncodePassword,
 which is an interface. This allows the UserService to work with any class that implements the EncodePassword interface,
  making the algorithm (strategy) interchangeable.
	 * 
	 * 
	 * 
	 * */

}
