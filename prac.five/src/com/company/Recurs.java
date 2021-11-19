package com.company;

public class Recurs {
    private int recursionn;
    private int summ;

        public int recursion(int n) {
            summ += n;
            if (n==0)
                return 1;
            System.out.println(summ);
            return recursion(n % 10);
        }
}
