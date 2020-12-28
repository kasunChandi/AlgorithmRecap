


/*Example how it works [ 5, 1, 4, 2 ,8 ]
 ***************************
( 5 1 4 2 8 ) –> ( 1 5 4 2 8 )
( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 )
( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 )
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )*/


public class SelectionSortAlgo {  

public static int getSmallest(int a[], int n, int i)  
{  
    int small,pos,j;  
    small = a[i];  
    pos = i;  
    for(j=i+1;j<10;j++)  
    {  
        if(a[j]<small)  
        {  
            small = a[j];  
            pos=j;  
        }  
    }  
    return pos;  
}  


public static void main(String[] args) {  
    int[] a = { 9, 7, 101, 24, 44, 55, 12, 78, 34, 24,56, 80};  
    int i,j,k,pos,temp;  
    for(i=0;i<10;i++)  
    {  
        pos = getSmallest(a,10,i);  
        temp = a[i];  
        a[i]=a[pos];  
        a[pos] = temp;  
    }  
    System.out.println("\nprinting sorted values ..\n");  
    for(i=0;i<10;i++)  
    {  
        System.out.print(a[i] + " ");  
    }  
}  
}  