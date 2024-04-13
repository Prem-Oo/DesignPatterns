package creational.prototype;

public class Runner {

	public static void main(String[] args) {
		TaskRegistry registry=new TaskRegistry();
		
		Task epicTemplate=new Task();
		epicTemplate.type=TaskType.EPIC;
		registry.register(TaskType.EPIC, epicTemplate);
		
		Task bugTemplate=new Task();
		bugTemplate.type=TaskType.BUG;
		registry.register(TaskType.BUG, bugTemplate);

		for(int i=0;i<10;i++) {
			TaskType input=TaskType.BUG;// input
			
			Task bugTask=registry.get(input).clone();
			
			System.out.println(bugTask);
		}
	}

}
