package arrays;
import java.util.PriorityQueue;
// Nth largest number using min heap
public class B_Nth_largest_number_minheap {
    public static  int second_largest_number() {
        int[] arr = {23, 2, 4, 11, 19, 3, 8};
        int k = 3;
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for (int nums : arr) {
            minheap.offer(nums);
            if (minheap.size() > k) {
                minheap.poll();
            }
        }
        return minheap.peek();

    }

    public static void main(String[] args) {

        int  number=second_largest_number();
        System.out.println(number);




    }
}
