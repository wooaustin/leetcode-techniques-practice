/* EASY Problem: Given an array of sorted numbers, remove all duplicates from it. 
                 You should not use any extra space; after removing the duplicates 
                 in-place return the new length of the array. */

class Solution{
    public int removeDuplicates(int [] arr){
        int nextNonDuplicate = 1;
        for(int i = 1; i < arr.lengthp; i++){
            if(arr[nextNonDuplicate - 1]  != arr[i]){
                arr[nextNonDuplicate++] = arr[i];
            }
        }
        return nextNonDuplicate;
    }
}