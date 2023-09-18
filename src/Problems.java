import java.util.Arrays;

public class Problems {

    public static int searchElement(int [] usrInput,int searchElement){

        for(int i:usrInput){
            if(i==searchElement){
                return 1;
            }
        }
        return 0;
    }

    public static void maxandminElement(int []usrInput){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:usrInput){
            if(i>max){
                max=i;
            }
        }
        for(int i:usrInput){
            if(i<min){
                min=i;
            }
        }

        System.out.println("max ---> "+max);
        System.out.println("min ---> "+min);
    }

    /*
      Given an array of size n Find the number of elements in
      the array that have at least one element in the array
      greater than themselves
    */
    public static void isNumberGreaterOnce(int[] userInput) {
        int count = 0;
        if (userInput.length == 0) {
            return;
        } else {
            int max = Integer.MIN_VALUE;
            for (int j : userInput) {
                if (j > max) {
                    max = j;
                }
            }
            System.out.println("max element ---> " + max);
            for (int j : userInput) {
                if (j < max) {
                    count++;
                }
            }
            System.out.println("Count ---> " + count);

        }

    }
    /*
     *
     * Given array of size n and an integer k Return
     * True if there exist two elements a[i] and a[j]
     * so that a[i]+a[j]=k
     * else false
     *
     */
    public static boolean isSumExisted(int[] userInput, int target) {
        for (int i = 0; i < userInput.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (userInput[i] + userInput[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }


    /*
     * Reverse given array using constant extra space
     */
    public static void reverseArray(int start,int end,int [] userInput) {
        while (start < end) {
            int temp = userInput[start];
            userInput[start] = userInput[end];
            userInput[end] = temp;
            end--;
            start++;
        }
        System.out.println(Arrays.toString(userInput));
    }

    /*
     * Reverse given array without  using constant extra space
     */
    public static void reverseArray(int[] usrInput){
        int start=0;
        int end=usrInput.length-1;
        while (start<end){
            usrInput[start]=usrInput[start]+usrInput[end];
            usrInput[end]=usrInput[start]-usrInput[end];
            usrInput[start]=usrInput[start]-usrInput[end];
            start++;
            end--;
        }
        System.out.println(Arrays.toString(usrInput));
    }

    /*
    * Rotating array by left and right with k positions
    * Trick note down the output and reverse the halves
    */

    public static void rotatingArrayByLeft(int k,int [] userInput){
        int n=userInput.length;
        if(k>n){
            k=k%n;
        }
        reverseArray(0,k-1,userInput);
        reverseArray(k,n-1,userInput);
        reverseArray(0,n-1,userInput);
    }
    public static void rotatingArrayByRight(int k,int [] userInput){
        int n=userInput.length;
        if(k>n){
            k=k%n;
        }
        reverseArray(0,n-k-1,userInput);
        reverseArray(k+1,n-1,userInput);
        reverseArray(0,n-1,userInput);

    }


}
