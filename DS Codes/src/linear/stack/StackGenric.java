package linear.stack;

class StackGenric
{
	private int stackSize;
	private int[] stackArr;
	int top;
	StackGenric(int size)
	{
		this.stackSize=size;
		stackArr=new int[stackSize];
		top=-1;
	}//constructor
	public void push(int value)
	{
		if(top==stackSize-1)
		{
			System.out.println("Stack OverFlow \nPUSH Next Time now resizing Stack  ");
		}
		else
		{
			stackArr[++top]=value;
			System.out.println("Inserted Element is "+value);
		}
	}//push
	public void pop()
	{
		if(top==-1)
			System.out.println("Stcak Empty \nCan't delete any element ");
		else
		{
			int ele=stackArr[top--];
			System.out.println("Deleted Element is "+ele);
		}
	}//pop
	public void retrive()
	{
		for(int i=0;i<=top;i++)
			System.out.println(stackArr[i]+"  ");
	}//retrive
	public void resize()
	{
		int[] newStackArray=new int[stackSize*2];
		for(int i=0;i<stackSize;i++)
		{
			newStackArray[i]=stackArr[i];
		}
		stackArr=newStackArray;
		stackSize=2*stackSize;
	}
}//stackArray
class StackGenricMain 
{
	public static void main(String[] args) 
	{
		StackGenric stk=new StackGenric(5);
		stk.push(15);
		stk.push(25);
		stk.push(35);
		stk.push(45);
		stk.push(55);
		stk.push(65);
		stk.retrive();
		stk.pop();
		stk.retrive();
		stk.pop();
		stk.retrive();
		stk.pop();
		stk.retrive();
		stk.pop();
		stk.retrive();
		stk.pop();
		stk.retrive();
		stk.pop();

	}
}
