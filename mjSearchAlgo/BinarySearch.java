// package com.algorithm;

public class BinarySearch {

    public static void bSearch (int[] array, int key){
        int first = 0;
        int last = array.length - 1;
        int middle = (first + last)/2;

      while (first<= last) {
          if (array[middle] < key) {
              first = middle + 1;
          } else 
			  if (array[middle] == key) {
              System.out.println("Search found. Your number is: " + key);
              break;
          } else {
              last = middle - 1;
          }
          middle = (first + last) / 2;
      }
        if  (first > last) {
        System.out.println (key+ " is not present in the list");
        }
    }

    public static void main(String[] args) {

        int [] list =    
                {1, 2, 6, 8, 9, 12, 17, 21, 24, 26, 30, 34, 37, 42, 48, 50, 53, 58, 61, 68, 71, 75, 77, 83, 89, 91, 94, 97, 101 ,109, 120};

		bSearch(list , 83);
        }

    }
