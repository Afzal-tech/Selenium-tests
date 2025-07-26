package arrays;
// prints second largest number in array using for loop //
public class ASecond_largest_number {
    public  static void second_largest_number() {
        int[] arr = {23, 2, 4, 11, 19, 3, 8};
        int max= arr[0];
        int sec_max =Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                sec_max=max;
                max= arr[i];
            }
            else if (arr[i]<max  && arr[i]>sec_max){
                sec_max= arr[i];
            }

        }
        System.out.println(sec_max);
    }
    public static  void main( String[] args){
        second_largest_number();

    }
}

