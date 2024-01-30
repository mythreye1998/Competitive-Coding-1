//time complexity = O(logn), space complexity - O(N)
//Check for missing elements at the beginning and end of the array.
//Use binary search to find the missing element by comparing differences between array elements and their indices.
//Return the average of the two indices where the difference is inconsistent in the binary search loop.
import java.io.*;

class GFG {
    public static int search(int ar[], int n){
        int low =0;
        int high = n-1;
        if(ar[0]!=1) return 1;
        if(ar[n-1] != n+1) return n+1;
        
        while(high-low >=2){
            int mid = low+(high-low)/2;
            int midDiff = ar[mid]-mid;
            int lowDiff = ar[low]-low;
            int highDiff = ar[high]-high;
            if(midDiff != lowDiff) high = mid;
            else low = mid;
        }
        return (ar[low]+ar[high])/2;
    }
	
	public static void main(String[] args){
	    int ar[] = {1,2,3,4,6,7};
	    System.out.println(search(ar, ar.length));
	    
	}
}
