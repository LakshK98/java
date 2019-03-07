
//N queen problem using backtracking and bitset
//input N 
//output all possible solutions for placing N queens in N x N grid 

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        boolean col[]= new boolean[n];
        boolean d1[] = new boolean[2*n-1];
        boolean d2[] =new boolean[2*n-1];
        
        int mat[][]= new int[n][n];
        queen(0,n,mat,col,d1,d2);
    } 
    static int count=0;
    static void queen(int j,int n,int[][]mat,boolean[]col,boolean[]d1,boolean[]d2){
        for(int i=0;i<n;i++){
            

            if(j==0){
                clean(n,mat,col,d1,d2);
            }
            if (isSafe(i,j,n,col,d1,d2))
            {
                col[i]=true;
                d1[i-j+n-1]=true;
                d2[i+j]=true;
                mat[j][i]=1;
                if(j==n-1)
                {
                    count++;
                    System.out.println("Solution Number: "+(count));
                    System.out.print("  ");
                    for(int x=0;x<n;x++){
                        System.out.print((x+1)+" ");
                    }
                    System.out.println();
                    for(int x=0;x<n;x++){
                        for(int y=0;y<n;y++){
                            if(y==0){
                                System.out.print((char)('A'+x)+" ");
                            }
                            if(mat[x][y]==1)
                                System.out.print("Q ");
                            else
                                System.out.print("- " );
                        }   
                        System.out.println();

                    }
                }
                else{
                    queen(j+1,n,mat,col,d1,d2);
                }
                
                    col[i]=false;
                    d1[i-j+n-1]=false;
                    d2[i+j]=false;
                    mat[j][i]=0;
            }
        }
    }
    static boolean isSafe(int i,int j,int n,boolean[]col,boolean[]d1,boolean[]d2){
        
        if(!col[i] && !d1[i-j+n-1] && !d2[i+j])
        {
            return true;
        }
        return false;
    }
    static void clean(int n,int[][]mat,boolean[]col,boolean[]d1,boolean[]d2){
        for(int i=0;i<n;i++)
        {
            col[i]=false;
        }
        for(int i=0;i<2*n-1;i++)
        {
            d1[i]=false;
            
            d2[i]=false;
        }
        for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
                mat[x][y]=0;
            }   
       }
    }
}

