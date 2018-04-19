package linear.circulerQueue;

class CirQueueArr 
{
	public static void main(String[] args) 
	{
		System.out.println("===============  Circuler QUEUE  ==================");
		CirculerQue q=new CirculerQue(8);
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
		q.retrive();
		
		System.out.println("\n\n\n OBJECT 2 OF CIRCULER QUEUE CLASS \n");
		
		CirculerQue q1=new CirculerQue();
		q1.insert(50);
		q1.insert(150);
		q1.insert(250);
		q1.insert(350);
		q1.insert(450);
		q1.retrive();
		q1.delete();
		q1.delete();
		q1.delete();
		q1.delete();
		q1.retrive();
	}
}
