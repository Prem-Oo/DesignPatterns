package creational.prototype;

public class Task {

	TaskType type;
	private String title;
	private String discription;
	private int points;
	
	public Task clone() {
		
		Task copy=new Task();
		copy.type=this.type;
		copy.points=this.points;
		return copy;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public String getDiscription() {
		return discription;
	}
	
	@Override
	public String toString() {
		return "Task [type=" + type + ", title=" + title + ", discription=" + discription + ", points=" + points + "]";
	}


	public int getPoints() {
		return points;
	}
}
