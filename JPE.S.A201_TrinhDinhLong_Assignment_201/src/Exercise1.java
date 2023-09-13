public class Exercise1 {
    public static void main(String[] args) {
        // +
        int resultA = (101 + 0) / 3;
        System.out.println("(101 + 0)/3 -> " + resultA);
        //
        double resultB = 3.0e-6 * 10000000.1;
        System.out.println("3.0e-6 * 10000000.1 -> " + resultB);
        //
        Boolean resultC = true && true;
        System.out.println("true && true -> " + resultC);
        //
        Boolean resultD = false && false;
        System.out.println("false && false -> " + resultD);
        //
        Boolean resultE = (false && false) || (true && true);
        System.out.println("(false && false) || (true && true) -> " + resultE);
        //
        Boolean resultF = (false || false) && (true || true);
        System.out.println("(false && false)||(true && true) -> " + resultF);

    }
}
