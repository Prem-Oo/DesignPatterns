package behavioural.observer.after;

public class Runner {
// client code
	public static void main(String[] args) {
		
		
		// method-1 :here below services are dependent on flipkart object directly.
		//Flipkart f=new Flipkart();
//		NewsLetterService nls = new NewsLetterService(f);
//		OTPService otpService = new OTPService(f);
//		ValidatorService validatorService = new ValidatorService(f);
		
		//method-2
		Flipkart f=new Flipkart();
		NewsLetterService nls = new NewsLetterService();
		OTPService otpService = new OTPService();
		
		// here services are registering (we can control what services to be registered)
		f.registerSignUpEventSubscriber(otpService);
		f.registerSignUpEventSubscriber(nls);
		
		f.signUp(new User());
	}

}
