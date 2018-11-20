package com.marlen.java.lesson_1.Lesson7_1.Home7.Sorting.Bubble_Sort;



public class BubbleSortSmart {
        public static void main(String[] args) {
            int[] a = {300,5, 90, 35, 45, 150, 3, 167, 0,168, 1};

            //   stupidBubbleSort(a);

            smartBubbleSortSpeed(a);

            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }

        private static void stupidBubbleSort(int[] a) {
            int n = a.length;
            int temp = 0;

            for (int i = 0; i < n-1; i++) {
                for (int j = 1; j < n - i; j++) {

                    if (a[j - 1] > a[j]) {
                        temp = a[j - 1];
                        a[j - 1] = a[j];
                        a[j] = temp;
                    }

                }
            }

        }

        //  вроде более ускоренный вариант Bubble Sort - заключается в том,
        // чтобы завершать работу функции сразу, как мы отсортировали массив.
        // Вводится дополнительная переменная - swap
        // Критерий отсортированности - если каждый элементне надо было обменивать местами,
        // это значит, что все элементы стоят на своих местих и массив посортирован

        public static void smartBubbleSortSpeed(int[] a) {
            int n = a.length;
            int temp = 0;

            for (int i = 0; i < n-1; i++) {
                int swap=0;  // *******
                for (int j = 1; j < n - i; j++) {

                    if (a[j - 1] > a[j]) {
                        temp = a[j - 1];
                        a[j - 1] = a[j];
                        a[j] = temp;
                        swap++; // ********
                    }
                }
                if(swap==0){
                    break;
                }
            }

        }
    }
