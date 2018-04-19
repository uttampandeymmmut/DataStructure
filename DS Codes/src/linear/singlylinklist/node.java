package linear.singlylinklist;

class node
{
	int ele;
	node link;
	node(int ele, node link)
	{
		this.ele=ele;
		this.link=link;
	}
	node()
	{
		this.ele=0;
		this.link=null;		
	}

}