public class Main {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 2; i <= 1000; i += 2) {
            total += i;
        }
        System.out.println("Tổng của các số chẵn từ 1 đến 1000 là: " + total);
        total = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0) {
                total += i;
            }
        }
        System.out.println("Tổng của các số chẵn từ 1 đến 1000 là: " + total);
        total = 0;
        for(int i = 3; i <= 1000; i++){
            if(i >= 10 && i <= 99){
                continue;
            }
            if(i % 3 == 0){
                    total += i;
            }

        }
        System.out.println("Tổng của các số chia hết cho 3 từ 1 đến 1000 (Trừ 10 - 99) là: " + total);
        total = 0;
        for (int i = 3; i <= 1000; i++) {
            if (( i < 10 && i % 3 == 0) || (i > 99 && i % 3 == 0)){
                total += i;
            }
        }
        System.out.println("Tổng của các số chia hết cho 3 từ 1 đến 1000 (Trừ 10 - 99) là: " + total);
        int i = 0;
        int j = i++ + ++i;
        System.out.println(j);
    }
}