package com.company;
public class SortingStudentsByGPA implements Comparator {

    @Override
    public int sort(int[] array, int low, int high){
        if (array.length == 0)
            return 1;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return 1;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            sort(array, low, j);

        if (high > i)
            sort(array, i, high);
        return 1;
    }

}
