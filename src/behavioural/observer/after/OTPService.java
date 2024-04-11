package behavioural.observer.after;

public class OTPService implements SignUpEventSubscriber {

	// method-1
//	OTPService(Flipkart flipkart){
//		flipkart.registerSignUpEventSubscriber(this);
//	}
	
	
	// method-2
	OTPService(){}
	public void sendOTP(String phoneNumber) {
		System.out.println("OTP send Succesfully...");
	}

	@Override
	public void listenSignUpEvent(User user) {
		sendOTP(user.phone);
		
	}
}
