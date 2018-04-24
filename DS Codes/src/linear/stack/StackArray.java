package linear.stack;

class StackArray<T extends Object>
{
	private int stackSize;
	private T[] stackArr;
	int top;
	StackArray(int size)
	{
		this.stackSize=size;
		stackArr= (T[]) new Object[stackSize];
		top=-1;
	}//constructor
	public void push(T value)
	{
		if(top==stackSize-1)
			System.out.println("Stack OverFlow \nPUSH Next Time now resizing Stack ");
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
			T ele=stackArr[top--];
			System.out.println("Deleted Element is "+ele);
		}
	}//pop
	public void peek()
	{
		if(top==-1)
			System.out.println("Stcak Empty \nCan't get any element ");
		else
		{
			T ele=stackArr[top];
			System.out.println("top Element is "+ele);
		}
	}//peek
	
	public void retrive()
	{
		for(int i=0;i<=top;i++)
			System.out.println(stackArr[i]+"  ");
	}//retrive
}//stackArray
class StackMainGen 
{
	public static void main(String[] args) 
	{
		StackArray stk=new StackArray(5);
		stk.push("uttam");
		stk.push("pandey");
		stk.push("ravi");
		stk.push("lala");
		stk.push("pratap");
		stk.push("kumar");
		stk.peek();
		
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
