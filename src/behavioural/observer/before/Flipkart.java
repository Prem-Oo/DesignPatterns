package behavioural.observer.before;

public class Flipkart {

	NewsLetterService nls= new NewsLetterService();
	OTPService os=new OTPService();
	ValidatorService vs= new ValidatorService();
	
	public void signUp() {
		nls.subscribeToNewsLetter("email");
		os.sendOTP("12345");
		vs.validateUser("email", "address");
	}
}
