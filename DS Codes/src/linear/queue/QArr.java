package linear.queue;

class QArr
{
	int[] arr;
	int front,rear,maxSize;
	//----------------------------------------------------------------------
	QArr(int n)
	{
		maxSize=n;
		arr=new int[maxSize];
		front=-1;
		rear=-1;
	}
	QArr()
	{
		maxSize=10;
		arr=new int[maxSize];
		front=rear=-1;
	}
	//----------------------------------------------------------------------
	public void insert(int d)
	{
		if(maxSize-1 == rear)
			System.out.println("Queue Full NO SPACE ");
		else
		{
			if(front == -1 && rear == -1)
			{
				rear++;
				front++;
			}
			else
				rear++;
			arr[rear]=d;
		}
	}
	//----------------------------------------------------------------------
	public void delete()
	{
		if(front == -1 || front > rear)
			System.out.println("No any Element in QUEUE for DELETION ");
		else
		{
			int d=arr[front++];
			System.out.println("Delete element is  "+d);
		}
	}
	//----------------------------------------------------------------------
	public void retrive()
	{
		if(front == -1 || front == rear)
			System.out.println("No any Element in QUEUE ");
		else
		{
			for(int i=front;i<=rear;i++)
				System.out.print(arr[i]+"  ");
		}
	}
	//----------------------------------------------------------------------
}