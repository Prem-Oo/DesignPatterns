package behavioural.observer.after;

public class NewsLetterService implements SignUpEventSubscriber {

	// method-1
//	NewsLetterService(Flipkart flipkart){
//		flipkart.registerSignUpEventSubscriber(this);
//	}
	
	
	// method-2
	NewsLetterService(){}
	
	
	public void subscribeToNewsLetter(String email) {
		System.out.println(" Subscribed to NewsLetter...");
	}

	@Override
	public void listenSignUpEvent(User user) {
		subscribeToNewsLetter(user.email);
		
	}
}
