package _2_Array_And_Matrices;

public class _5_MiniPeaks {

    public static void main(String[] args) {
        int[] arr = {13, 12, 0, 2, 4, -8, 13};
        miniPeaks(arr);
    }

    public static void miniPeaks(int[] numbs) {

        int size = numbs.length;

        System.out.println("Mini Peaks are: ");

        // loop from 1 to size-2 (avoid first and last element)
        for (int i = 1; i < size - 1; i++) {

            // check if the element is greater than both its neighbors
            if (numbs[i] > numbs[i - 1] && numbs[i] > numbs[i + 1]) {
                System.out.println(numbs[i]);
            }
        }
    }
}
