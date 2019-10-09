import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.*;

public class SecondSmallestEl {

    public static int secondSmallest(int[] aray, int length) {

//    int temp;
//                                                                         // Sort with for Loop
//    for (int i = 0 ; i<length ; i++){
//
//        for (int j = i+1 ; j<total ; j++) {
//
//            if (a[i] > a[j]){
//                temp = a[i];
//                a[i] = a[j];
//                a[j] = temp;
//            }
//        }
//    }
        Arrays.sort(aray);                                                     // Sort with out for Loop

        return aray[1];
    }

    public static void main(String[] args) {

//        int aray[] = { 44, 0, 66, 99, 77, 33, 22, 55, 12, 88, 13};                // With out Scanner


        Scanner input = new Scanner(System.in);                                    // With Scanner
        System.out.println("Please Enter the Values of Array! ");
        int ln = input.nextInt();
        int[] aray = new int[ln];


        System.out.println("Enter Elements : ");                                  //For Loop for Enter Elements
        for (int i = 0; i < ln; i++) {
            aray[i] = input.nextInt();
        }



        int arsize = aray.length;
        System.out.println();
        System.out.println("You Entered  (" + arsize + ")  Elements !");            //Show Quantity of Entered Elements
        System.out.println();

        System.out.println("Second Smallest Element is : " + secondSmallest(aray, arsize));
    }
}


