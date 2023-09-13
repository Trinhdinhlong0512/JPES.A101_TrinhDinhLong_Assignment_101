package fa.training.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 sorter = new Exercise2();
        int[] arr = {1, 6, 7, 8, 10, 1, 2, 4};
        int max = sorter.maximum(arr);
        System.out.println("\nMaximum element in the array: " + max);
    }

    public int maximum(int[] list) {
        int max = list[0];
        int n = list.length;
        for (int i = 0; i < n; i++) {
            if (max < list[i]) {
                max = list[i];
            }
        }
        return max;
    }
}
