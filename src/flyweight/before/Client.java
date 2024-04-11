package flyweight.before;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		List<Bullet> bullets=new ArrayList<>();

		for(int i=1;i<=1000;i++) {
			Bullet b=new Bullet();
			b.image=new byte[] {0,0,0};
			bullets.add(b);
		}

	}

}
