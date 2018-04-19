package linear.doublelinklist;

class doublLL 
{
	dnode start;
	dnode end;
	int size;
	doublLL()
	{
		start=null;
		end=null;
		size=0;
	}
	public int getSize()
	{
		return size;
	}
	public void addStart(int d)
	{
		dnode newnode=new dnode(d);
		size++;
		if(start==null)
		{
			start=newnode;
			end=newnode;
		}
		else
		{
			newnode.next=start;
			start=newnode;
		}
		end.next=start;
	}

	public void addEnd(int d)
	{
		dnode newnode=new dnode(d);
		size++;
		if(start==null)
		{
			start=newnode;
			end=newnode;
		}
		else
		{
			newnode.prev=end;
			end.next=newnode;
			end=newnode;
		}
		end.next=start;
	}

	public void deleteFromStart()
	{
		if(start==null)
		{
			System.out.println("Empty LinkList so can not delete");
			return;
		}
		else if(size==1||start.next==start)
		{
			System.out.println("Deleted element is "+start.ele);
			System.out.println("Now linklist is empty ");
			start=null;
		}
		else
		{
			System.out.println("Deleted element is "+start.ele);
			start=start.next;
			start.prev=null;
		}
		size--;
		end.next=start;
	}
	public void deleteFromEnd()
	{
		if(start==null)
		{
			System.out.println("Empty LinkList so can not delete");
			return;
		}
		else if(size==1||start.next == start)
		{
			System.out.println("Deleted element is "+start.ele);
			System.out.println("Now linklist is empty ");
			start=null;
		}
		else
		{
			dnode tmp=start;
			System.out.println("Deleted element is "+end.ele);
			while(tmp.next==end)
				tmp=tmp.next;
			end=tmp;
		}
		size--;
		end.next=start;
	}


	public void retriveAll()
	{
		if(start==null)
		{
			System.out.println("Empty Link List");
			return;
		}
		else if((size==1)&&(end==start))
		{
			System.out.println("Only one element in linklist is "+start.ele);
			return;
		}
		else
		{
			dnode temp=start;
			System.out.println("Linklist all elements are  ");
			while(temp != end)
			{
				System.out.print(temp.ele+"  ");
				temp=temp.next;
			}
			System.out.println(end.ele);
		}
	}
	public int middleElement()
	{
		return nthElement((size+1)/2);
/*
		dnode fast=start;
		dnode slow=start;
		while(fast!=end)
		{
			fast=fastlink;
			fast=fast.next;
			slow=slow.next;
		}
		return slow.ele;
*/
	}
	public int nthElement(int n)
	{
			dnode tmp=start;
			for(int i=1;i<n;i++)
			tmp=tmp.next;
			return tmp.ele;
	}
	public int nthElementEnd(int n)
	{
			dnode tmp=start;
			dnode tmp1=start;
			for(int i=1;i<n;i++)
			tmp=tmp.next;
			while(tmp!=end)
			{
				tmp=tmp.next;
				tmp1=tmp1.next;
			}
			return tmp1.ele;
	}
}
