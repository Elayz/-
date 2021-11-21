package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	SortingStudentsByGPA students = new SortingStudentsByGPA();
        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        System.out.println("Было");
        System.out.println(Arrays.toString(x));
        int low = 0;
        int high = x.length - 1;
        students.sort(x, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }
}
