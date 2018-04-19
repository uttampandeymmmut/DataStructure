package linear.circulerQueue;

class CirculerQue 
{
	int[] cque;
	int front,rear,maxSize;
//------------------------------------------------------------------
	CirculerQue(int n)
	{
		maxSize=n;
		cque=new int[maxSize];
		front=rear=-1;
	}
//------------------------------------------------------------------
	CirculerQue()
	{
		maxSize=10;
		cque=new int[maxSize];
		front=rear=-1;
	}
//------------------------------------------------------------------
	public boolean isFull()
	{
		if((front == 0 && rear== maxSize-1) || front == rear+1 )
			return true;
		else
			return false;
	}
//------------------------------------------------------------------
	public void insert(int d)
	{
		if(this.isFull())
			System.out.println("NO Space in Circuler Queue it's FULL");
		else
		{
			if(front == -1)
				front=0;
			if(rear == maxSize-1 )
				rear=0;
			else
				rear++;
			cque[rear]=d;
		}
	}
//------------------------------------------------------------------
	public void delete()
	{
		if(front == -1)
			System.out.println("No Element in Circuler Queue");
		else
		{
			int d=cque[front];
			if(front == rear )
			{
				front=-1;
				rear=-1;
			}
			else if(front == maxSize-1)
				front=0;
			else
				front++;
			System.out.println("Delete element is "+d);
		}
	}
//------------------------------------------------------------------
	public void retrive()
	{
			if(front == -1)
				System.out.println("No Element in Circuler Queue");
			else if(front == rear)
				System.out.println("only one element that is "+cque[front]);
			else if(rear > front)
			{
				for(int i=front;i<=rear;i++)
					System.out.print(cque[i]+"  ");
			}
			else
			{
				for(int i=front;i<=(maxSize-1);i++)
					System.out.print(cque[i]+"  ");
				for(int i=0;i<=rear;i++)
					System.out.print(cque[i]+"  ");
			}
			System.out.println();
	}
//------------------------------------------------------------------
}
