import java.util.*;
import java.io.*;
import java.math.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[] allMountains=new int[4];
        // game loop
        while (true) {
            for (int i = 0; i < 4; i++) {
                //int mountainH = in.nextInt(); // represents the height of one mountain.
                allMountains[i]=in.nextInt();
            }
                int id=0;
                 int highest=0;
            for (int i = 0; i < 4; i++)
                 {
                if(highest<allMountains[i]){
                            highest=allMountains[i];
                             id=i;
                    }
                }


            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println("The tallest mountain in the entered series is : "+id); // The index of the mountain to fire on.
        }
    }
}
