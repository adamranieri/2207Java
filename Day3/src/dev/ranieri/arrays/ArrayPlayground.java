package dev.ranieri.arrays;

public class ArrayPlayground {

    public static void main(String[] args) {
        // Arrays are objects
        // Compared to most other high level language Java arrays are quite limited
        // 1. They have fixed size
        // 2. few helper methods

        int [] nums = new int[10];

        nums[0] = 1; // first element
        nums[1] = 20;
        nums[9] = 99; // last element

        // noob syntax for iterating over an array
        for(int i = 0; i <nums.length; i++){
            System.out.println(nums[i]);
        }

        // enhanced for loop
        // nicer syntax if you just need to iterate without editing element positions
        for(int i : nums){
            System.out.println(i);
        }

        String [] names = {"Adam","Bill","Charlotte"};

    }
}
