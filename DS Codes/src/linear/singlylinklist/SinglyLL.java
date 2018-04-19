package linear.singlylinklist;

import java.util.Scanner;
class SinglyLL 
{
	public static void main(String[] args) 
	{
	int value;
		System.out.println("Singly LinkList");
		linklist obj=new linklist();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n----- Linked Lis -----\n");
		while(true){
		System.out.println("\n***** MENU *****\n");
		System.out.println("1. Insert\n2. Delete\n3. Display \n4. Number of element \n5. Exit");
		System.out.println("\nEnter your choice: ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("\n***** INSERT MENU *****");
			System.out.println("1. Insert at First\n2. Insert at End\n3. Exit");
			System.out.println("\nEnter your choice: ");
			int insertChoice=sc.nextInt();
			switch(insertChoice){
			case 1:
					System.out.println("\nEnter the value to be insert: ");
					value=sc.nextInt();
					obj.addStart(value); break;
			case 2:
					System.out.println("\nEnter the value to be insert: ");
					value=sc.nextInt();
					obj.addEnd(value); break;
			 case 3: System.exit(0);
			 default:
			 System.out.println("\nPlease select correct operations!!!\n");
			}
			break;
		case 2:
			System.out.println("\n***** DELETE MENU *****");
			System.out.println("1. Delete from First\n2. Delete from End\n3. Exit");
			System.out.println("\nEnter your choice: ");
			int deleteChoice=sc.nextInt();
			switch(deleteChoice){
			case 1:
					 obj.deleteFromStart(); break;
			case 2:
					 obj.deleteFromEnd(); break;
			 case 3: System.exit(0);
			 default:
			 System.out.println("\nPlease select correct operations!!!\n");
			}
			break;
		case 3:
			System.out.println("\n***** DISPLAY MENU *****");
			System.out.println("1. Display All Elements\n2. Display nth element\n3. Display nth element from end\n4. Display Middle Elements\n5. Exit");
			System.out.println("\nEnter your choice: ");
			int displayChoice=sc.nextInt();
			switch(displayChoice){
			case 1:
					 obj.retriveAll(); break;
			case 2:
					System.out.println("find nth element value of n must be less than "+obj.getSize());
					int n=sc.nextInt();
					if(n>obj.getSize())
						System.out.println("Invalid value of N");
					else
						System.out.println(obj.nthElement(n));
					break;
			 case 3:
					System.out.println("find nth element value of n must be less than "+obj.getSize());
					int m=sc.nextInt();
					if(m>obj.getSize())
						System.out.println("Invalid value of N");
					else
						System.out.println(obj.nthElementEnd(m));
					break;

			 case 4:
				System.out.println("midle element of linked list is "+obj.middleElement());
				break;
			 case 5: System.exit(0);
			 default:
			 System.out.println("\nPlease select correct operations!!!\n");
			}
			break;	
		case 4:
			System.out.println("number of node(s) in link list is "+obj.getSize());break;
		case 5:
			System.out.println("********************* Thanks *********************");
			System.out.println("************ Develope By UTTAM PANDEY ************");
			System.exit(0);
		default:
		 System.out.println("\nPlease select correct operations!!!\n");
		}
		}
		}
}
