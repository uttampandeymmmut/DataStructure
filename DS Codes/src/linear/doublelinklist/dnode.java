package linear.doublelinklist;

class  dnode
{
	int ele;
	dnode next;
	dnode prev;
	dnode(int ele)
	{
		this.ele=ele;
		next=null;
		prev=null;
	}
	dnode()
	{
		this.ele=0;
		next=null;
		prev=null;
	}
}
