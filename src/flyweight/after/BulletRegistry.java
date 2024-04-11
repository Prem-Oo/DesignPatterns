package flyweight.after;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {
///  this is prototype registry design pattern
	
	Map<BulletType,Bullet> bullets=new HashMap<>();
	void register(BulletType type,Bullet bullet) {
		
		bullets.put(type, bullet);
	}
	
	public Bullet getBullet(BulletType type) {
		if(bullets.containsKey(type)) {
			return bullets.get(type);
		}
		return null;
	}
}
