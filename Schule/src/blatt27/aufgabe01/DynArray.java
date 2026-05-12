package blatt27.aufgabe01;

import blatt07.ArbeitMitArrays;

import java.util.Arrays;

public class DynArray {

    private int[] arr;
    private int l;

    public DynArray(int l) {
        this.l = l;
        this.arr = new int[l];
    }

    //b
    public void printArr() {
        blatt07.ArbeitMitArrays.printArray(this.arr);
    }

    //c
    public boolean isEmpty() {
        if (this.arr.length == 0) {
            return false;
        }
        return true;
    }

    //d
    public int size() {
        return this.arr.length;
    }

    //Zum Testen
    public void fillArr() {
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = i;
        }
    }

    //e
    public int get(int i) {
        try {
            return this.arr[i];
        }  catch (Exception o) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        return 0;
    }

    //f
    public boolean contains(int such) {
        try {
            for (int i = 0; i < this.arr.length; i++) {
                if (this.arr[i] == such) {
                    return true;
                }
            }
            return false;
        }   catch (Exception o) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        return false;
    }

    //g
    public int indexOf (int such) {
        if (contains(such)) {
            for (int i = 0; i < this.arr.length; i++) {
                if (this.arr[i] == such) {
                    return i;
                }
            }
        }
        return -1;
    }

    //h
    public void add(int a) {
        int[] temp = new int[this.arr.length + 1];
        for (int i = 0; i < this.arr.length; i++) {
            temp[i] = this.arr[i];
        }
        temp[temp.length - 1] = a;
        this.arr = temp;
    }

    //i
    public void add(int zahl, int pos) {
        add(zahl);
        for (int i = pos; i < this.arr.length; i++) {
            int count = this.arr.length - 1;
            int temp = this.arr[i];
            this.arr[i] = this.arr[count];
            this.arr[count] = temp;
            count--;
        }
    }

    //j
    public void set(int zahl, int pos) {
        this.arr[pos] = zahl;
    }

    //k
    public int remove (int pos) {
        return -1;
    }
}
