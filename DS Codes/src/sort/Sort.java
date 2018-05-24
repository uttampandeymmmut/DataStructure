package sort;
import java.util.Arrays;
import java.util.Scanner;
class Sort 
{
	public static void bubble(int arr[])
	{
		System.out.println("#########  BUBBLE SORT  #########");
		int len=arr.length-1;
		for(int i=len;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void insertion(int arr[])
	{
		System.out.println("#########  INSERTION SORT  #########");
		for(int i=1;i<arr.length;i++)
		{
			int temp=arr[i];
			int j=i-1;
			System.out.println(Arrays.toString(arr));
			while((j>=0) && (temp<arr[j]) )
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}//insertion sort

	public static int selectionMimum(int arr[],int k,int n)
	{
		int min=arr[k];
		int index=k;
		for(int i=k+1;i<n;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
				index=i;
			}
		}
		 return index;
	}
	public static void selection(int arr[])
	{
		System.out.println("#########  SELECTION SORT  #########");
		int j;
		for(int i=0;i<arr.length;i++)
		{
			j=selectionMimum(arr,i,arr.length);
			int tmp=arr[i];
			arr[i]=arr[j];
			arr[j]=tmp;
			System.out.println(Arrays.toString(arr));
		}
	}
	public static int quickBreak(int arr[],int b,int e)
	{
		int left,right,temp,loc,flag;
		loc=left=b;
		right=e;
		flag=0;
		while(flag!=1)
		{
			while((loc != right) && (arr[loc] <= arr[right]))
				right--;
			if(loc==right)
				flag=1;
			else if(arr[loc]>arr[right])
				{
					temp=arr[loc];
					arr[loc]=arr[right];
					arr[right]=temp;
					loc=right;
				}
				if(flag != 1)
				{
					while((loc !=left) && (arr[loc] >= arr[left]))
						left++;
					if(loc==left)
						flag=1;
					else if(arr[loc]<arr[left])
					{
						temp=arr[loc];
						arr[loc]=arr[left];
						arr[left]=temp;
						loc=left;
					}
				}
		}
		return loc;
	}
	public static void quick(int arr[],int beg,int end)
	{
		int loc;
		if(beg<end)
		{
			loc=quickBreak(arr,beg,end);
			quick(arr,beg,loc-1);
			System.out.println(Arrays.toString(arr));
			quick(arr,loc+1,end);
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void mergeCombin(int arr[],int beg,int mid,int end)
	{
		int i=beg, j=mid+1,index=beg,k;
		int temp[]=new int[10];
		while((i<=mid) && (j<=end))
		{
			if(arr[i]<arr[j])
			{
				temp[index]=arr[i];
				i++;
			}
			else
			{
				temp[index]=arr[j];
				j++;
			}
			index++;
		}
		if(i>mid)
		{
			while(j<=end)
			{
				temp[index]=arr[j];
				j++;
				index++;
			}
		}
		else
		{
			while(i<=mid)
			{
				temp[index]=arr[i];
				i++;
				index++;
			}
		}
		for(k=beg;k<index;k++)
			arr[k]=temp[k];
	}

	public static void merge(int arr[],int beg,int end)
	{
		if(beg<end)
		{
			int mid=(beg+end)/2;
			merge(arr,beg,mid);
			System.out.println(Arrays.toString(arr));
			merge(arr,mid+1,end);
			System.out.println(Arrays.toString(arr));
			mergeCombin(arr,beg,mid,end);
		}
	}

public static void radix(int arr[])
{
		System.out.println("#########  RADIX SORT  #########");
		int bucket[][]=new int[10][10];
		int bucketCount[]=new int[10];
		int  nop=0,divisor=1;
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
			max=max<arr[i]?arr[i]:max;
		while(max>0)
		{
			nop++;
			max/=10;
		}
		for(int p=0;p<nop;p++)
		{
			for(int i=0;i<10;i++)
				bucketCount[i]=0;
			for(int i=0;i<arr.length;i++)
			{
				int rem=(arr[i]/divisor)%10;
				bucket[rem][bucketCount[rem]]=arr[i];
				bucketCount[rem]+=1;
			}
			System.out.println(Arrays.toString(arr));
			int i=0;
			for(int k=0;k<10;k++)
			{
				for(int j=0;j<bucketCount[k];j++)
				{
					arr[i]=bucket[k][j];
					i++;
				}
			}
			System.out.println(Arrays.toString(arr));
			divisor *=10;
		}
}


	public static void main(String arg[])
	{
		int[] arrsort={10,20,45,2,49,-12,8,15,78,-4};
		int arr1[]=new int[]{42, 15, 12, 8, 6, 32};
			System.out.println("\n***** SORTING MENU *****");
			System.out.println("1. BUBBLE SORT\n2. INSERTION SORT\n3. SELECTION SORT\n4. QUICK SORT\n5. MERGE SORT\n6. RADIX SORT \n7. Exit");
			System.out.println("\nEnter your choice: ");
			int insertChoice=new Scanner(System.in).nextInt();
			switch(insertChoice){
			case 1:
					Sort.bubble(arrsort);
					Sort.bubble(arr1);
					break;
			case 2:
					Sort.insertion(arr1);
					Sort.insertion(arrsort);
					break;
			case 3:
					Sort.selection(arrsort);
					Sort.selection(arr1);
					break;
			case 4:
					System.out.println("#########  QUICK SORT  #########");
					Sort.quick(arr1,0,arr1.length-1);
					System.out.println("#########  QUICK SORT  #########");
					Sort.quick(arrsort,0,arrsort.length-1);
					break;
			case 5:
					System.out.println("#########  MERGE SORT  #########");
					Sort.merge(arr1,0,arr1.length-1);
					System.out.println("#########  MERGE SORT  #########");
					Sort.merge(arrsort,0,arrsort.length-1);
					break;
			case 6:
					Sort.radix(arr1);
					break;
			 case 7: System.exit(0);
			 default:
			 System.out.println("\nPlease select correct operations!!!\n");
			}
	}
}
