package linear.circulerlinklist;

class circulerlinklist 
{
	node start;
	node end;
	int size;
	circulerlinklist()
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
		node newnode=new node(d,null);
		size++;
		if(start==null)
		{
			start=newnode;
			end=newnode;
		}
		else
		{
			newnode.link=start;
			start=newnode;
		}
		end.link=start;
	}

	public void addEnd(int d)
	{
		node newnode=new node(d,null);
		size++;
		if(start==null)
		{
			start=newnode;
			end=newnode;
		}
		else
		{
			end.link=newnode;
			end=newnode;
		}
		end.link=start;
	}

	public void deleteFromStart()
	{
		if(start==null)
		{
			System.out.println("Empty LinkList so can not delete");
			return;
		}
		else if(size==1||start.link==start)
		{
			System.out.println("Deleted element is "+start.ele);
			System.out.println("Now linklist is empty ");
			start=null;
		}
		else
		{
			System.out.println("Deleted element is "+start.ele);
			start=start.link;
		}
		size--;
		end.link=start;
	}
	public void deleteFromEnd()
	{
		if(start==null)
		{
			System.out.println("Empty LinkList so can not delete");
			return;
		}
		else if(size==1||start.link == start)
		{
			System.out.println("Deleted element is "+start.ele);
			System.out.println("Now linklist is empty ");
			start=null;
		}
		else
		{
			node tmp=start;
			System.out.println("Deleted element is "+end.ele);
			while(tmp.link==end)
				tmp=tmp.link;
			end=tmp;
		}
		size--;
		end.link=start;
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
			node temp=start;
			System.out.println("Linklist all elements are  ");
			while(temp != end)
			{
				System.out.print(temp.ele+"  ");
				temp=temp.link;
			}
			System.out.println(end.ele);
		}
	}
	public int middleElement()
	{
		return nthElement((size+1)/2);
/*
		node fast=start;
		node slow=start;
		while(fast!=end)
		{
			fast=fastlink;
			fast=fast.link;
			slow=slow.link;
		}
		return slow.ele;
*/
	}
	public int nthElement(int n)
	{
			node tmp=start;
			for(int i=1;i<n;i++)
			tmp=tmp.link;
			return tmp.ele;
	}
	public int nthElementEnd(int n)
	{
			node tmp=start;
			node tmp1=start;
			for(int i=1;i<n;i++)
			tmp=tmp.link;
			while(tmp!=end)
			{
				tmp=tmp.link;
				tmp1=tmp1.link;
			}
			return tmp1.ele;
	}
}
