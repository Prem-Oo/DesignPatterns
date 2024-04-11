package flyweight.before;

public class Bullet {

	BulletType type;
	
	// intrensic
	int maxDamage;
	byte[] image;
	double weight;
	
	// extrensic 
	double curPosXYZ;
	double curDir;
	double curSpeed;
	boolean isFired;
	
}
