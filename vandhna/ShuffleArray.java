package org.vandhna;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("original array"+" "+Arrays.toString(arr));

        
        shuffleArray(arr);

        System.out.println("Shuffled array: " + Arrays.toString(arr));
    }

    public static void shuffleArray(int[] arr) {
        Random rand = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);

            
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

}