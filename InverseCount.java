import java.math.*;
import java.util.*;
class InverseSort {
        public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int n=sc.nextInt();
		int arr[]=new int[n];
	
		
		for(int i=0;i<n;i++)
		{
		
			arr[i]=sc.nextInt();
			
		}
				
		
		System.out.print(countSort(arr,0,arr.length));
		/*for(int i=0;i<n;i++)
		{
		
		System.out.print(arr[i]+" ");
			
		}	*/	
			
}

	static int countSort(int a[],int low ,int high)
	{
		int n= high-low;
		if(n<=1)
		{
			return 0;
		}	
		int mid=low+n/2;
		int x=countSort( a,low,mid)+countSort( a,mid,high);
		
		
		int temp[] = new int[n];
		
		for(int i=low,j=mid,k=0;k<n;k++)
		{
			if(i==mid)
				temp[k]=a[j++];
			else if(j==high)
				temp[k]=a[i++];
			else if(a[i]>a[j])
				{
				x+= mid-i;
				temp[k]=a[j++];
				}
			else
				temp[k]=a[i++];
					
		}
		return x;
	}

}