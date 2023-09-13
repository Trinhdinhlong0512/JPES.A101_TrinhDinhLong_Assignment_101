package fa.training.exercise1;

public class Exercise1 {
    public static void main(String[] args){
        Exercise1 sorter = new Exercise1();
        int[] arr = {1 , 2,  1, 5, 1, 3};
        sorter.bubbleSort_increase(arr);
        for (int num: arr){
            System.out.print(num + " ");
        }
        sorter.bubbleSort_decrease(arr);
        System.out.print("\n");
        for (int num: arr){
            System.out.print(num + " ");
        }
    }
    public void bubbleSort_increase (int[] list) {
        int n = list.length;
        for(int i = 0; i < n ; i++){
            for(int j = i + 1; j < n; j++){
                if(list[i] > list[j]){
                    int c = list[i];
                    list[i] = list[j];
                    list[j] = c;
                }
            }
        }
    }
    public void bubbleSort_decrease (int[] list) {
        int n = list.length;
        for(int i = 0; i < n ; i++){
            for(int j = i + 1; j < n; j++){
                if(list[i] < list[j]){
                    int c = list[i];
                    list[i] = list[j];
                    list[j] = c;
                }
            }
        }
    }
}
