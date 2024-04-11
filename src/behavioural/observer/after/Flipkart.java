package behavioural.observer.after;

import java.util.HashSet;
import java.util.Set;

public class Flipkart {

	// stores set of subscribers interested in sign-up event
	Set<SignUpEventSubscriber> signUpEventSubscriber=new HashSet<>();
	
	
	 void registerSignUpEventSubscriber(SignUpEventSubscriber s) {
		 signUpEventSubscriber.add(s);
	 }
	 void unregisterSignUpEventSubscriber(SignUpEventSubscriber s) {
		 signUpEventSubscriber.remove(s);
	 }
	 
	 // signup() is not hard-coded here
	public void signUp(User user) {
		for(SignUpEventSubscriber subscriber:signUpEventSubscriber) {
			 subscriber.listenSignUpEvent(user);
		 }
	}
}
