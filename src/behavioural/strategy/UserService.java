package behavioural.strategy;

public class UserService {

//	EncodePassword encodePassword=new EncodePassword(); // 1. violates D.Inversion
	
	// 2. use Dependancy injection for more loosecoupling
	//EncodePassword encodePassword=new SimpleEncodePassword(); 
	
	
	EncodePassword encodePassword;
	// 3. Constructor injection 
	UserService(EncodePassword encodePassword){
		this.encodePassword=encodePassword;
	}
	
	void registerUser( String email,String password,String username) {
		
		// method-1
		// encoding password here violates "SRP"(monster method )
//		String encodedPassword=password+"encoded"; // encoded password
		
		// method-2
		String encodedPassword = encodePassword.encodePassword(password);
		
	}
}
