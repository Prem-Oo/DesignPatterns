package behavioural.observer.after;

// SignUpEventListner or SignUpEventObserver

//  we create seperate individual interfaces for multiple events.
public interface SignUpEventSubscriber {

	void listenSignUpEvent(User user);
}
