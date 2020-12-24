package by.epam.java.algoritmization.sorts;

import java.util.ArrayList;

/**
 * @author potap; Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bm. Образовать из них новую, так чтобы она была не убывающей
 */

public class SortTask02 {
    public static void main(String[] args) {

        int[] arrayA;
        arrayA = new int[]{2, 3, 7};

        int[] arrayB;
        arrayB = new int[]{1, 5, 6};

        int indexA;
        indexA = 0;
        int indexB;
        indexB = 0;

        ArrayList arraySorted;
        arraySorted = new ArrayList();

        for (int i = indexA; i < arrayA.length; i++) {
            for (int j = indexB; j < arrayB.length; j++) {

                if (arrayA[i] < arrayB[j]) {
                    arraySorted.add(arrayA[i]);
                    indexA++;
                } else {
                    arraySorted.add(arrayB[j]);
                    indexB++;
                }
            }
        }
        System.out.println(arraySorted);
    }
}
