class Test{
	public static void main(String[] args){
		Task1 ts1=new Task1();
		Task2 ts2=new Task2();

		Thread t=new Thread(ts1);
		Thread t1=new Thread(ts1);

		Thread t2=new Thread(ts2);

		t.setName("Task1 Thread1");
		t1.setName("Task1 Thread2");
		
		t2.setName("Task2 Thread");
		t.start();
		t1.start();

		t2.start();
		System.out.println(t.getName());
		System.out.println(t1.getName());

		System.out.println(t2.getName());
	}
}