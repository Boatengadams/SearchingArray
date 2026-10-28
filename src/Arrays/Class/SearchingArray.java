// Question: How can binarySearch find values in a sorted array?
package Arrays.Class;
//Using binarySearch()
//The array should be sorted in increasing order
//then binarySearch(number, 4)
//return values
// if found it will return the index of the element
// if not it will return the -(insertionIndex + 1) like say the array was suppose to be in between (3,5) and it will have taken the index 3 if inserted so it will return - (3+1)= -4


import java.util.Arrays;

public class SearchingArray {
    public static void main(String[] args) {
//        int[] numbers = {5,4,3,2,1,0,-1,6};
        int[] numbers = {-5,-1,-6,5,6};
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+ " ");
        System.out.println(Arrays.binarySearch(numbers,5));
        System.out.println(Arrays.binarySearch(numbers,-1));
        System.out.println(Arrays.binarySearch(numbers,-5));
        System.out.println(Arrays.binarySearch(numbers,-6));

    }
}
