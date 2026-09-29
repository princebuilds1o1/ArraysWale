





//show third largest number

import java.util.Arrays;


public class Array{
    public static int[] secondlar(int[] arr) {
       int max1 = arr[0] ;
       int max2 = arr[0] ;
       int max3 = arr[0];
       for (int i = 0; i < arr.length; i++) {
        if(arr[i] > max1 ){
            
            max2 = max1 ;
            max3 = max2 ;
            max1 = arr[i] ;
        }else if (arr[i] > max2 && arr[i] != max1 && arr[i]< max1  ){
           max3 = max2 ;
           max2 = arr[i];
     }else if(arr[i] > max3 && arr[i] != max2 && arr[i] < max2){
           max3 = arr[i] ;
     }
  }
      int[] arr1 = new int[] {max1, max2,max3};
        return arr1 ;
       
         
}

 public static void main(String[] args) { 
 int[] arr = {2,4,5,6,20,24,57,57,12,26,26};
 int[] result = secondlar(arr);
 System.out.println( Arrays.toString(result));

    }
}
    
    