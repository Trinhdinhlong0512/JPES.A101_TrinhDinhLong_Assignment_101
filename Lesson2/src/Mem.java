
public class Mem {
    public static void main(String[] args) {

//        int[] numbers = {12, 34, 45, 67, 89, 23, 56};
//
//        int firstLargest = numbers[0];
//        int secondLargest = numbers[0];
//
//        for (int number : numbers) {
//            if (number > firstLargest) {
//                secondLargest = firstLargest;
//                firstLargest = number;
//            } else{
//                if (number > secondLargest && number != firstLargest) {
//                    secondLargest = number;
//                }
//            }
//        }
//
//        if (secondLargest != Integer.MIN_VALUE) {
//            System.out.println("Số lớn thứ hai là: " + secondLargest);
//        } else {
//            System.out.println("Không có số lớn thứ hai.");
//        }
//        int i = 5;
//        switch (i){
//            default:
//            case 1: System.out.println("1");
//            case 2: System.out.println("3");
//            break;
//        }
//        if(args[0].equals("open"))
//            if(args[1].equals("someone"))
//                System.out.println("Hello!");
//        else System.out.println("Go away  " + args[1]);
//    }
//        int i = 0, j = 11;
//        do {
//            if (i > j) {
//                break;
//            }
//            j--;
//        } while (++i < 5);
//        System.out.println(i + "va " + j);
//        int a = 5, b = 7, k = 0;
//        Integer m = null;
//        int c = 0;
//        boolean flag = true;
//        for(int i = 0; i < 3; i++){
//            while (flag) {
//                c++;
//                if(i > c || c > 5)flag = false;
//            }
//        }
//        System.out.println(c);
          int result = 0;
          short s = 42;
          Long x = new Long("42");
          Long y = new Long(42);
          Integer z = new Integer(s);

          if(x == y) result = 1;
          if(x.equals(z)){
              result += 10;
          }
          System.out.println(result);
    }
}
