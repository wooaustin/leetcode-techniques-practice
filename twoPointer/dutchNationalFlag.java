/* MEDIUM Problem: 
    Given an array containing 0s, 1s and 2s, sort the array in-place. 
    You should treat numbers of the array as objects, hence, we can’t count 0s, 1s, and 2s to recreate the array.
    The flag of the Netherlands consists of three colors: red, white and blue; and since our input array also consists
    of three different numbers that is why it is called Dutch National Flag problem. */

class Solution{
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public int[] dutchNationalFlag(int[] arr){
        int left = 0, right = arr.length -1;
        for(int i = 0;i<=right;){
            if(arr[i] == 0){
                swap(arr, i, left);
                left++;
                i++;
            }
            else if(arr[i] == 1){
                i++;
            }
            else{
                swap(arr,i,right);
                right--;
            }
        }
        return arr;
    }
}