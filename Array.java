
//Take an array as input from the user.
//  Search for a given number x and print
//the index at which it occurs

// import java.util.*;



// public class Array1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a :");
//         int a = sc.nextInt();

//         int[] arr = new int[a];

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         //arr[3] = 34 ;
//         int x = 45 ;
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i] == x){
//                 System.out.println("The x is found at index :" +i);
//             }
            
//         }
//     }
// }



//Take an array of names as input from the user and 
//print them on the screen

 //import java.util.*;
 //import java.util.Arrays;


// public class Arrays {
//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size: ");
//         int size = sc.nextInt();

//         String names[] = new String[size];

//         // Input
//         for (int i = 0; i < size; i++) {
//             names[i] = sc.next();
//         }

//         // Output
//         for (int i = 0; i < names.length; i++) {
//             System.out.println("name " + (i + 1) + " is : " + names[i]);
//         }
//     }
// }

//Find the max and min no. in an array of integers

// public class Array{

//     public static int[] maxMin(int[] arr) {
//       //let
//       int max = arr[0];
//       int min = arr[0];  
//       for (int i = 0; i < arr.length; i++) {
//           if(arr[i] > max){
//             max = arr[i];
//           }if(arr[i]<min){
//             min = arr[i];
//           }
//       }
//       int arr1[] = new int[]{max,min};
//       return arr1;
//     //   System.out.println("Max no is :" + max);
//     //   System.out.println("Min no is :" + min);
        
//     }
//     public static void main(String[] args) {
//         int[] arr = {2,4,6,13,54,67,89};
//         int[] result = maxMin(arr);
//         System.out.println("the max and min numbers are :"+Arrays.toString(result));

        
//     }
// }

// import java.util.*;
// import java.util.Arrays;



// //Take an Array of numbers as input and check if it is an array sorted in ascending order


// public class Array{

//     public static boolean checkSorted(int[] arr) {
//         boolean issorted = true ;
//         for (int i = 0; i < arr.length - 1; i++) {
//              if(arr[i] > arr[i+1]){
//                 issorted = false ;
//                 break;
//              }

//         }
//         return issorted ;
     
//     }
//     public static void main(String[] args) {
//         int[] arr = {2,6,7,8,4,9};
//         boolean result = checkSorted(arr);
//         System.out.println((result));

//     }
// }


//Add all the indexes of the even number
// input: 2,4,5,6,80,24,57,12,26
//output: 28

public class Array{
    public static int addIndexes(int[] arr) {
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){ //arr[i] means element stored at i
                 sum += i ;
            }
        }
        return sum ;
        
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,80,24,57,12,26};
        int result = addIndexes(arr);
        System.out.println("Sum of even number is"+result);
    }
}
