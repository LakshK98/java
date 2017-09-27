//instead of using arracopy method two get two halfs of array pass high and low (high =n nd low =0 for 1st case) as parameterin the recursive function
// better method

/*
    public static void sort(int[] a, int low, int high) 
    {
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        // recursively sort 
        sort(a, low, mid); 
        sort(a, mid, high); 
        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) 
        {
            if (i == mid)  
                temp[k] = a[j++];
            else if (j == high) 
                temp[k] = a[i++];
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        for (int k = 0; k < N; k++) 
            a[low + k] = temp[k];         
    }
*/


import java.util.*;
import java.lang.*;

import java.math.*;
class ModifySort {
        public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j=0 ; j<t; j++){
		
		
		int n=sc.nextInt();
		int arr[]=new int[n];
	
		
		for(int i=0;i<n;i++)
		{
		
			arr[i]=sc.nextInt();
			
		}
				
		arr=sort(arr);
		for(int i=0;i<n;i++)
		{
		
			System.out.print(arr[i]+" ");
			
		}		
	}		
}
public static int[] sort(int a[])
{
int l=a.length;
if(l>1)
{
	int b[]=new int [l/2];	
	int c[]=new int [l-l/2];
	System.arraycopy(a,0,b,0,l/2);	
	System.arraycopy(a,l/2,c,0,l-l/2);
	b=sort(b);
	c=sort(c);
	for(int i=0,k=0,j=0;i<l;i++)
	{
	if(j==b.length)
	{
		System.arraycopy(c,k,a,i,l-i);
		break;
	}
	else if(k==c.length)
	{
		System.arraycopy(b,j,a,i,l-i);
		break;
	}
	else
	{
		
		int x=(int)(Math.log(b[j])/Math.log(2));
		int y=(int)(Math.log(c[k])/Math.log(2));

		if(x>y )
		{
			a[i]=b[j];
			j++;
	
		}
		else if (y>x) 
		{
			a[i]=c[k];
			k++;
		}
		else
		{
			int n=2,m=2;
			while(n <= b[j]){ 
			if(b[j] % n == 0)
			break;
			n++;
			}
				
			while(m <= c[k]){ 
			if(c[k] % m == 0)
			break;
			m++;
			}
			if(n>=m)
			{
			a[i]=b[j];
			j++;
			}
			else
			{
			a[i]=c[k];
			k++;
			}
		}
	}
	}
}

return(a);
}
		
}	
import java.util.*;
import java.lang.*;

import java.math.*;
class ModifySort {
        public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j=0 ; j<t; j++){
		
		
		int n=sc.nextInt();
		int arr[]=new int[n];
	
		
		for(int i=0;i<n;i++)
		{
		
			arr[i]=sc.nextInt();
			
		}
				
		arr=sort(arr);
		for(int i=0;i<n;i++)
		{
		
			System.out.print(arr[i]+" ");
			
		}		
	}		
}
public static int[] sort(int a[])
{
int l=a.length;
if(l>1)
{
	int b[]=new int [l/2];	
	int c[]=new int [l-l/2];
	System.arraycopy(a,0,b,0,l/2);	
	System.arraycopy(a,l/2,c,0,l-l/2);
	b=sort(b);
	c=sort(c);
	for(int i=0,k=0,j=0;i<l;i++)
	{
	if(j==b.length)
	{
		System.arraycopy(c,k,a,i,l-i);
		break;
	}
	else if(k==c.length)
	{
		System.arraycopy(b,j,a,i,l-i);
		break;
	}
	else
	{
		
		int x=(int)(Math.log(b[j])/Math.log(2));
		int y=(int)(Math.log(c[k])/Math.log(2));

		if(x>y )
		{
			a[i]=b[j];
			j++;
	
		}
		else if (y>x) 
		{
			a[i]=c[k];
			k++;
		}
		else
		{
			int n=2,m=2;
			while(n <= b[j]){ 
			if(b[j] % n == 0)
			break;
			n++;
			}
				
			while(m <= c[k]){ 
			if(c[k] % m == 0)
			break;
			m++;
			}
			if(n>=m)
			{
			a[i]=b[j];
			j++;
			}
			else
			{
			a[i]=c[k];
			k++;
			}
		}
	}
	}
}

return(a);
}
		
}	

import java.util.*;
import java.lang.*;

import java.math.*;
class MergeSort {
        public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];
	
		
		for(int i=0;i<n;i++)
		{
		
			arr[i]=sc.nextInt();
			
		}
				
		arr=sort(arr);
		for(int i=0;i<n;i++)
		{
		
			System.out.println(arr[i]);
			
		}		
		
}
public static int[] sort(int a[])
{
int l=a.length;
if(l>1)
{
	int b[]=new int [l/2];	
	int c[]=new int [l-l/2];
	System.arraycopy(a,0,b,0,l/2);	
	System.arraycopy(a,l/2,c,0,l-l/2);
	b=sort(b);
	c=sort(c);
	for(int i=0,k=0,j=0;i<l;i++)
	{
	if(j==b.length)
	{
		System.arraycopy(c,k,a,i,l-i);
		break;
	}
	else if(k==c.length)
	{
		System.arraycopy(b,j,a,i,l-i);
		break;
	}
	else
	{
		
		if(b[j]<=c[k] )
		{
			a[i]=b[j];
			j++;
	
		}
		else 
		{
			a[i]=c[k];
			k++;
		}
	}
	}
}

return(a);
}
		
}	