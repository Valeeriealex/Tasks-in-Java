// Простая сортировка 

public class merge_sort {
    public static void Merge (int[] array) {
        int[] a1 = new int[] {21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500}; // есть первый массив чисел
        int[] a2 = new int[] {10, 11, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000};      // есть второй массив чисел 
        int[] a3 = new int[a1.length + a2.length];                                                // есть третий результирующий массив

        int i=0, j=0;// i и j – индексы для массивов a1 и a2 соответственно, которые указывают на текущие элементы на каждом шаге и образуют тот буфер                                           
            for (int k = 0; k < a3.length; k++) { // k - индекс для массива а3

            if (i > a1.length-1) { //проверка, что бы индекс не вышел за переделы количества элементов в первом массиве
                int a = a2[j];
                a3[k] = a;
                j++;
            }
            else if (j > a2.length-1) { //проверка, что бы индекс не вышел за переделы количества элементов во втором массиве
                int a = a1[i];
                a3[k] = a;
                i++;
            }
            else if (a1[i] < a2[j]) { //условие, обеспечивающее перемещение в массив наименьшего элемента из первого массива
                int a = a1[i]; 
                a3[k] = a;
                i++;
            }
            else {                  //условие, обеспечивающее перемещение в массив наименьшего элемента из второго массива
                int b = a2[j];
                a3[k] = b;
                j++;
            }
        }
    }
}

// Сдожная сортировка с разбивкой на методы
   
    public int [] sortArray(int[] arrayA){ // сортировка массива, который передается в функцию
        // проверяем не нулевой ли он?
        if (arrayA == null) {
            return null;
        }
        // проверяем не 1 ли элемент в массиве?
        if (arrayA.length < 2) {
            return arrayA; // возврат в рекурсию
        }
        // копируем левую часть от начала до середины
        int [] arrayB = new int[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        // копируем правую часть от середины до конца массива, вычитаем из длины первую часть
        int [] arrayC = new int[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        // рекурсией закидываем поделенные обе части обратно в наш метод, он будет крутится до тех пор,
        // пока не дойдет до 1 элемента в массиве, после чего вернется в строку и будет искать второй такой же,
        // точнее правую часть от него и опять вернет его назад
        arrayB = sortArray(arrayB); // левая часть возврат из рекурсии строкой return arrayA;
        arrayC = sortArray(arrayC); // правая часть возврат из рекурсии строкой return arrayA;

        // далее опять рекурсия возврата слияния двух отсортированных массивов
        return mergeArray(arrayB, arrayC);
    }

    public int [] mergeArray(int [] arrayA, int [] arrayB) { // слияние отсортированных массивов
        int [] arrayC = int [arrayA.length + arrayB.length]; // ошибка?
        int positionA = 0, positionB = 0;
        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length){
                arrayC[i] = arrayB[i - positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[i - positionA];
                positionA++;
            } else if (arrayA[i - positionA] < arrayB[i - positionB]) {
                arrayC[i] = arrayA[i - positionA];
                positionB++;
            } else {
                arrayC[i] = arrayB[i - positionB];
                positionA++;
            }
        }
        return arrayC;
    }