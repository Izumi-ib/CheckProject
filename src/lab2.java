import java.math.BigDecimal;
import java.math.RoundingMode;

public class lab2 {
    public static void main(String[] args){
        System.out.println("=== TASK 2 ==="); task2(); System.out.println();
        System.out.println("=== TASK 3 ==="); task3(); System.out.println();
        System.out.println("=== TASK 4 ==="); task4(); System.out.println();
        System.out.println("=== TASK 5 ==="); task5(); System.out.println();
    }

    static void task2() {
        float eW = 72.5f;
        float mG = 0.38f;
        float mW = eW * mG;

        double dMars = mW;
        //System.out.println(dMars);

            double d4 = Math.round(dMars*10000.0)/10000.0;
        System.out.println("mars ~4dp: " + d4);

        int iMars = (int)dMars;
        System.out.println("as int: " + iMars);

        char chMars = (char)iMars;
        System.out.println("as char: " + chMars);

        int chOp = chMars + 7;
        System.out.println("char+7 (int): " + chOp);
    }

    static void task3(){
        int num = (int)(Math.random()*100) + 1;
        System.out.println("generated: " +num);
        boolean even = (num % 2 == 0);
        if (even) {System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    static void task4(){
        int bricks = 77;
        int cap = 8;

        int full = bricks / cap;
        int rest = bricks % cap;

        int total = full + (rest > 0 ? 1 : 0);

        System.out.println("full containers: " + full);
        System.out.println("total containers: " + total);
        System.out.println("in not-full: " + rest);
    }

    static void task5(){
        double net = 9.99;
        double vat = 0.23;
        double factor = 1 + vat;
        double gross = net * factor;
        System.out.println("gross (double one): " + gross);

        double totalG = gross * 10000;
        double tmp = totalG;
        System.out.println("gross x10000 (double): " + tmp);

        double backNet = tmp / factor;
        System.out.println("back to net (double): " + backNet);

        BigDecimal netBD = new BigDecimal("9.99");
        BigDecimal vatBD = new BigDecimal("0.23");
        BigDecimal one = BigDecimal.ONE;

        BigDecimal fBD = one.add(vatBD);
        System.out.println("factor BD: " + fBD);

        BigDecimal grossBD = netBD.multiply(fBD);
        System.out.println("gross BD: " + grossBD);

        BigDecimal totalGBD = grossBD.multiply(new BigDecimal("10000"));
        System.out.println("gross x10000 BD: " + totalGBD);

        BigDecimal backNetBD = totalGBD.divide(fBD, 2, RoundingMode.HALF_UP);
        System.out.println("back to net BD: " + backNetBD);
    }
}
