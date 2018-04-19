package linear.queue;

class QueueArray 
{
	public static void main(String[] args) 
	{
		System.out.println("===============  QUEUE  ==================");
		QArr q=new QArr(8);
		q.insert(5);
		q.insert(15);
		q.insert(25);
		q.insert(35);
		q.insert(45);
		q.insert(55);
		q.insert(65);
		q.insert(75);
		q.insert(85);
		q.retrive();
		q.delete();
		q.delete();
		q.delete();
		q.delete();
		q.delete();
		
		System.out.println("OBJECT 2 OF QUEUE CLASS \n\n\n\n");
		
		QArr q1=new QArr();
		q1.insert(50);
		q1.insert(150);
		q1.insert(250);
		q.retrive();
		q.delete();
		q.delete();
		q.delete();
		q.delete();
		q.retrive();
	}
}
