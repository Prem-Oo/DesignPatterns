package behavioural.observer.after;

public class ValidatorService  implements SignUpEventSubscriber{

	// method-1
//	ValidatorService(Flipkart flipkart){
//		flipkart.registerSignUpEventSubscriber(this);
//	}
	
	
	// method-2
	ValidatorService(){}
	
	public void validateUser(String email,String address) {
		System.out.println("User validated...");
	}

	@Override
	public void listenSignUpEvent(User user) {
		validateUser(user.email, user.address);
		
	}
}
