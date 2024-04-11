package flyweight.after;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		List<FlyingBullet> flyingBullets=new ArrayList<>();
		
		
		BulletRegistry registry=new BulletRegistry();
		
		Bullet fiveMMBullet=new Bullet();
		fiveMMBullet.type=BulletType.FIVE;
		fiveMMBullet.maxDamage=90;
		fiveMMBullet.weight=200;
		
		Bullet SevenMMBullet=new Bullet();
		SevenMMBullet.type=BulletType.SEVEN;
		SevenMMBullet.maxDamage=95;
		SevenMMBullet.weight=250;
		
		registry.register(BulletType.FIVE, fiveMMBullet);
		registry.register(BulletType.SEVEN, SevenMMBullet);
		

		for(int i=1;i<=1000;i++) {
			FlyingBullet fb=new FlyingBullet();
			String type="5"; // take input from commandline / user
//			fb.bullet=bullets.get(BulletType.FIVE);
			fb.bullet=registry.getBullet(BulletType.FIVE);
			flyingBullets.add(fb);
		}
		System.out.println("Done");

	}

	// Registery :: is like singleton + Factory.
	
	//Flyweight :: used to save the memory consumed in runtime of application. by dividing classe's(intrensic + extrensic)
}
