package linear.stak;

class node
{
	int data;
	node link;
	node(int data)
	{
		this.data=data;
		link=null;
	}
}
class stack
{
	node start;
	int maxSize;
	int size;
//------------ constructor ----------------------------------------
	stack(int n)
	{
		maxSize=n;
		size=0;
		start=null;
	}
	stack()
	{
		size=0;
		maxSize=10;
		start=null;
	}
	//------------------ push Method ----------------------------------
	void push(int d)
	{
		if(maxSize==size)
			System.out.println("Stack Over Flow");
		else
		{
			node nn=new node(d);
			if(start==null)
				start=nn;
			else
			{
				nn.link=start;
				start=nn;
			}
			size++;
		}
	}
	//-------------------------- pop method --------------------------
	void pop()
	{
		if(size == 0 && start == null)
			System.out.println("Stack is UNDERFLOW");
		else
		{
			int d=start.data;
			start=start.link;
			System.out.println("Pop element is "+d);
			size--;
		}
	}
	//--------------------- Retrive Statck -------------------------------
	void retrive()
	{
		if(size == 0 && start == null)
			System.out.println("Stack is Empty");
		else if(size == 1)
			System.out.println("only one element in statck "+start.data);
		else
		{
			node tmp=start;
			while(tmp != null)
			{
				System.out.print(tmp.data+"  ");
				tmp=tmp.link;
			}
			System.out.println();
		}
	}
}
class StackBySLL 
{
	public static void main(String[] args) 
	{
			System.out.println("OBJECT 1");
			stack s=new stack();
			s.push(5);
			s.retrive();
			s.retrive();
			s.push(15);
			s.push(25);
			s.push(35);
			s.push(45);
			s.push(55);
			s.push(65);
			s.retrive();
			s.pop();
			s.pop();
			s.pop();
			s.pop();
			s.retrive();

			System.out.println("OBJECT 2");
			stack s1=new stack(6);
			s1.push(50);
			s1.push(150);
			s1.push(250);
			s1.push(350);
			s1.push(450);
			s1.push(550);
			s1.push(650);
			s1.retrive();
			s1.pop();
			s1.pop();
			s1.pop();
			s1.pop();
			s1.retrive();
	}
}
