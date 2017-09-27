import java.util.*;
public class Pattern{
public static void main(String args[]){
int a,i,j,k,l;

System.out.println("Enter number in biggest line:");
Scanner sc = new Scanner(System.in);
a=sc.nextInt();
for(i=0;i<(a/2)+1;i++)
{
 for(j=0;j<=(a/2)-i;j++)
 {
  System.out.print(" ");
 }
 k=(a/2)+1-i;
 for(l=0;l<=2*i;l++)
 {
 System.out.print(k);
 k++;
 }
System.out.println("\n");
}
 
for(i=0;i<(a/2);i++)
{
for(j=0;j<=i+1;j++)
 {
  System.out.print(" ");
 }
k=a-1-i;
for(l=0;l<=a-2*i-3;l++)
 { 
 System.out.print(k);
 k--;
 } 
System.out.println("\n");
} 
}
}