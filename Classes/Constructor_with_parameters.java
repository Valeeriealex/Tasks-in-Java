package Classes;

public class Constructor_with_parameters <T> {
    private static final int startLength = 1;
    private int length;
    private T[] data;

    public ArrayListClass() {
        this.length = 0;
        this.data = (T[]) new Object[startLength];
    }

    public ArrayListClass(T[] data) {
        this.length = data.length;
        this.data = data;
    }

    public int getLength() {
        return this.length;
    }

    public T[] getData() {
        return this.data;
    }

    // Печать массива
    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.getLength(); i++) {
            if (i != this.getLength() - 1)
                System.out.print(this.data[i] + ",");
            else
                System.out.print(this.data[i]);
        }
        System.out.print("]\n");
    }

    // Вставка в массив
    public void add(T element) {
        if (this.length == this.data.length) {
            addLenth();
        }
        this.data[this.length++] = element;
    }

    private void addLenth() {
        int newlen = this.getLength() + 1;
        T[] newData = (T[]) new Object[newlen];
        for (int i = 0; i < this.getLength(); i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }

    // Удаление по индексу
    public void remForIdx(int idx) throws IndexOutOfBoundsException {
        if (idx < 0 || idx > this.getLength()) {
            System.out.printf("Index %d out of bounds for length %d\n", idx, this.getLength());
        } else {
            int newlen = this.getLength() - 1;
            T[] newData = (T[]) new Object[newlen];
            int i = 0;
            while (i < idx) {
                newData[i] = this.data[i];
                i++;
            }
            i++;
            while (i < this.getLength()) {
                newData[i - 1] = this.data[i];
                i++;
            }
            this.data = newData;
            this.length--;
        }
    }

    // Удаление элемента по значению
    public void removeData(T element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                remForIdx(i);
                i--;
            }
        }
    }

    public int minData() {
        int min = (int) this.data[0];
        for (int i = 0; i < data.length; i++) {
            if (min > (int) this.data[i]) {
                min = (int) this.data[i];
            }
        }

        return min;
    }

    public int maxData() {
        int max = (int) this.data[0];
        for (int i = 0; i < data.length; i++) {
            if (max < (int) this.data[i]) {
                max = (int) this.data[i];
            }
        }

        return max;
    }

    public int sumData(){
        int result = 0;
        for (int i = 0; i < data.length; i++) {
            result += (int) this.data[i]; 
        }
        return result;
    }

    public int multData(){
        int result = 1;
        for (int i = 0; i < data.length; i++) {
            result *= (int) this.data[i]; 
        }
        return result;
    }

    public int findIdex(T element){
        
        int count = 0;
        for (T t : data) {
            if (t == element){
                return count;
            }
            count++;
        }
        return -1;
    }

    public boolean findData(T element){
        for (T t : data) {
            if (t == element){
                return true;
            }
        }
        return false;
    }

    public void BubbleSort() throws Constructor_without_parameters {
        T tmp = this.data[0];
        if (tmp instanceof Comparable) {
            for (int i = 0; i < this.getLength() - 1; i++) {
                boolean hasSwap = false;
                
                for (int j = 0; j < this.getLength() - i - 1; j++) {
                    Comparable<T> elem = (Comparable<T>)this.data[j];
                    T nextElem = this.data[j + 1];
                    if (elem.compareTo(nextElem) > 0) {
                        swap(j, j + 1);
                        hasSwap = true;
                    }
                }
                
                if (!hasSwap) {
                    break;
                }
            }
        }
        else {
            throw new Constructor_without_parameters(tmp.getClass().getSimpleName());
        }
    }

    private void swap(int i, int j) {
        T tmp = this.data[i];
        this.data[i] = this.data[j];
        this.data[j] = tmp;
    }

}
