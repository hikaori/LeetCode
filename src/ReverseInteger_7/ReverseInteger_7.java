package ReverseInteger_7;

import java.util.ArrayList;

/**
 * Created by kaorihirata on 2017-06-19.
 * <p>
 * Reverse digits of an integer.
 * <p>
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */

public class ReverseInteger_7 {
    public static void main(String[] args) {
//        Intreverse(123);
        System.out.println(Intreverse(123));
    }

    public static int Intreverse(int x) {
        String temp = Integer.toString(x);
        int tail = 0;

        for (int i = 0; i < temp.length(); i++) {
            tail = tail * 10 + x % 10;
            x = x / 10;
        }

        return tail;
    }
}
