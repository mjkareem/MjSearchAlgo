
// package com.algorithm;

public class Search {

    public static boolean linearSearch(int[] values, int key){
        boolean output = false;
		
        for (int index=0; index<values.length; index++){

            if (key == values[index]){
                System.out.println("Linear Search found: " +values[index]);
                output = true;
                break;
            }
        }
        return  output;
    }

    public static void main(String[] args) {
        int [] a = {21,423,5,6,8,43,54,-43,6,45,6};
        System.out.println(linearSearch(a,6));
    }
}
