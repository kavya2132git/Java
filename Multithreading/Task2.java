class Task2 implements Runnable{
	
	@Override
	public void run(){
		System.out.println("task2");
		for(int i=1; i<=10; i++){
			System.out.println(Thread.currentThread().getName()+" is executing");
			try{
				Thread.sleep(100);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
