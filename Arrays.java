//package DSAyou;
import java.util.*;
public class Arrays {
    public static void main(String[] args) {

        // int marks[] = {45,49,47};
        // // int[] marks = new int [3];
        // // marks[0] = 45 ;
        // // marks[1] = 49 ;
        // // marks[2] = 47 ;

        // // System.out.println(marks[0]);
        // //  System.out.println(marks[1]);
        // //   System.out.println(marks[2]);
        // for (int i = 0; i < marks.length; i++) {
        //        System.out.println(marks[i]);
        // }
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size:");
    int size = sc.nextInt();
    int[] num = new int[size];

    //input
    for (int i = 0; i < size; i++) {
         num[i] = sc.nextInt();
    }
    //output
    for (int i = 0; i < size; i++) {
        System.out.println(num[i]);
    }
    }

    }

