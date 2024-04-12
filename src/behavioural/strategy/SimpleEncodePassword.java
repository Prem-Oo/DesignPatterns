package behavioural.strategy;

public class SimpleEncodePassword implements EncodePassword {

	@Override
	public String encodePassword(String password) {
		String encodedPassword=password+"encoded";
		return encodedPassword;
	}

}
