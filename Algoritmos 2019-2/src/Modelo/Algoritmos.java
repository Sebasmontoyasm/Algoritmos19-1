/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JTextArea;

/**
 *
 * @author Remote
 */
public class Algoritmos {

    public Algoritmos() {
    }

    public void InsertionSort(ArrayList<Integer> arrayList) {

        for (int i = 1; i < arrayList.size(); ++i) {
            int key = (int) arrayList.get(i);
            int j = i - 1;

            while (j >= 0 && (int) arrayList.get(j) > key) {
                arrayList.set((j + 1), arrayList.get(j));
                j = j - 1;
            }
            arrayList.set((j + 1), key);
        }
    }

    public void InsertionSortRecursive(ArrayList<Integer> arrayList) {
        for (int i = 1; i < arrayList.size(); ++i) {
            InsertionSortR2(i - 1, arrayList, arrayList.get(i));
        }
    }

    public void InsertionSortR2(int j, ArrayList<Integer> arrayList, int aux) {
        if (j >= 0 && (int) arrayList.get(j) > aux) {
            arrayList.set((j + 1), arrayList.get(j));
            InsertionSortR2(j - 1, arrayList, aux);
        }

    }

    public void InsertionSortKhana(ArrayList<Integer> array) {
        for (int i = 1; i < array.size(); i++) {
            insertKhana(array, (array.size() - 1) - i, array.get(i));
        }
    }

    private void insertKhana(ArrayList array, int rightIndex, int value) {

    }

    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void binarySort(ArrayList<Integer> arrayList, int vBusqueda, JTextArea respuesta) {
        int min = 0;
        int max = arrayList.size() - 1;
        int mid = Math.round((min + max) / 2);

        while (vBusqueda != arrayList.get(mid)) {
            if (min >= max) {
                respuesta.setText("No se encontro el numero");
                break;
            } else if (arrayList.get(mid) < vBusqueda) {
                min = mid + 1;
                mid = Math.round((min + max) / 2);
            } else {
                max = mid - 1;
                mid = Math.round((min + max) / 2);
            }
        }
        System.out.println("posicion [" + mid + "]: " + arrayList.get(mid));
    }

    public void mergeSort(ArrayList<Integer> arrayList, int inicio, int fin) {
        if (inicio < fin) {
            int mitad = (int) Math.round((inicio + fin) / 2);

            mergeSort(arrayList, inicio, mitad);
            mergeSort(arrayList, mitad + 1, fin);

            merge(arrayList, inicio, mitad, fin);

        }
    }

    private void merge(ArrayList<Integer> arrayList, int inicio, int mitad, int fin) {
        int sizeIzq = mitad - inicio + 1;
        int sizeDer = fin - mitad;

        int[] vectorIzq = new int[sizeIzq + 1];
        int[] vectorDer = new int[sizeDer + 1];

        for (int i = 0; i < sizeIzq; i++) {
            vectorIzq[i] = arrayList.get(inicio + i);
        }

        for (int i = 0; i < sizeDer; i++) {
            vectorDer[i] = arrayList.get(mitad + i + 1);
        }

        vectorIzq[vectorIzq.length - 1] = Integer.MAX_VALUE;
        vectorDer[vectorDer.length - 1] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k = inicio; k <= fin; k++) {
            if (vectorIzq[i] <= vectorDer[j]) {
                arrayList.set(k, vectorIzq[i]);

                System.out.println("V["+k+"]: "+arrayList.get(k)+" cambio con el Vizq["+i+"]: "+vectorIzq[i]);

                i++;

            } else {
                arrayList.set(k, vectorDer[j]);

                System.out.println("V["+k+"]: "+arrayList.get(k)+" cambio con el VDer["+j+"]: "+vectorDer[j]);

                j++;
            }
        }
    }

    private void mostrarVectores(int[] vectorIzq, int[] vectorDer) {
        System.out.println("---------- Vector izquierdo ----------");
        for (int i = 0; i < vectorIzq.length; i++) {
            System.out.println("[" + i + "]: " + vectorIzq[i]);
        }
        System.out.println("---------- Vector derecho ----------");
        for (int i = 0; i < vectorDer.length; i++) {
            System.out.println("[" + i + "]: " + vectorDer[i]);
        }
    }

    public void algoritmosRecorrido(int[][] A) {
        int nveces = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[A.length - 1].length; j++) {
                nveces++;
            }
            nveces++;
        }
        System.out.println("numeros de veces que se repitio j: " + nveces);
    }

    public void bubbleSort(ArrayList<Integer> arrayList) {
        int aux;
        // C1*(n+1)
        for (int i = 1; i < arrayList.size(); i++) {
            // n * (C2*(n-
            for (int j = 0; j < arrayList.size() - i; j++) {
                if (arrayList.get(j) > arrayList.get(j + 1)) {
                    aux = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, aux);
                }
            }
        }
    }

    public int point9(int n) {

        int x = 1;
        System.out.println("xo: " + x);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                x = 2 * x;
                System.out.println("xi: " + x);
            }
        }
        System.out.println("xf: " + x);
        return x;
    }

    public int GCD2(int a, int b) {
        if (b == 0) {
            return a;
        }
        a = a % b;
        System.out.println("a: " + a);
        return GCD2(b, a);
    }

    public void RadixSort(ArrayList<Integer> vector) {
        int[] repet = new int[10];

        for (int i = 0; i < repet.length; i++) {
            repet[i] = -1;
        }

        for (int i = 1; i <= 10; i++) {
            int cont = 0;
            for (Integer dato : vector) {
                if (i == dato) {
                    cont++;
                    repet[i - 1] = cont;
                }
            }
        }

        int x = 0;
        int y = 0;

        while (x != repet.length && y < vector.size()) {
            if (repet[x] != -1) {
                for (int k = 0; k < repet[x]; k++) {
                    vector.set(y, x + 1);
                    y++;
                }
                x++;
            } else {
                x++;
            }
        }
    }

    public void Bucket(ArrayList<Integer> vector) {
        int cantidad = nListas(vector);

        LinkedList<LinkedList<Integer>> casilleros = new LinkedList<>();
        int fin = -1;

        for (int i = 0; i < cantidad; i++) {

            int inicio = fin + 1;
            fin = ((i + 1) * 10) - 1;

            LinkedList<Integer> casillero = new LinkedList<>();

            for (Integer dato : vector) {
                if (dato >= inicio && dato <= fin) {
                    casillero.add(dato);
                }
            }

            casilleros.add(casillero);
        }

        for (LinkedList<Integer> casillero : casilleros) {
            BucketSort(casillero);
        }
    }

    private int nListas(ArrayList<Integer> vector) {
        float mayor = BuscarMayor(vector);
        return (int) Math.ceil(mayor / 10);

    }

    private int BuscarMayor(ArrayList<Integer> vector) {
        int mayor = vector.get(0);

        for (Integer dato : vector) {
            if (dato > mayor) {
                mayor = dato;
            }
        }

        return mayor;

    }

    private void BucketSort(LinkedList<Integer> casillero) {
        ArrayList<Integer> converse = new ArrayList<>();

        casillero.forEach((item) -> {
            converse.add(item);
        });
        InsertionSort(converse);
    }

    public ArrayList<Integer> Counting(ArrayList<Integer> arreglo) {

        int Max = arreglo.get(0);

        for (Integer number : arreglo) {
            if (number > Max) {
                Max = number;
            }
        }

        int[] Auxiliar = new int[Max + 1];
        for (Integer number : arreglo) {

            Auxiliar[number] = Auxiliar[number] + 1;

        }

        for (int i = 1; i < Auxiliar.length; i++) {
            Auxiliar[i] = Auxiliar[i - 1] + Auxiliar[i];

        }

        ArrayList<Integer> order = new ArrayList<>();

        for (int i = 0; i < Max; i++) {
            order.add(0);
        }

        for (int i = 0; i < arreglo.size(); i++) {
            if (Auxiliar[arreglo.get(i)] != 0) {
                order.set(Auxiliar[arreglo.get(i)] - 1, arreglo.get(i));

                Auxiliar[arreglo.get(i)]--;
            }

        }

        return order;
    }

    public void QuickSort(ArrayList<Integer> vector, int p, int r) {
        if (p < r) {
            int q = Partition(vector, p, r);

            QuickSort(vector, p, (q - 1));
            QuickSort(vector, (q + 1), r);

        }
    }

    private int Partition(ArrayList<Integer> vector, int p, int r) {
        int pivot = vector.get(p);

        int i = p;
        int j = r;

        int Aux;

        while (i < j) {
            while (vector.get(i) <= pivot && i <= r) {
                i = i + 1;
            }
            while (vector.get(j) > pivot && j >= p) {
                j = j - 1;
            }

            if (i < j) {
                System.out.println("V["+i+"]"+vector.get(i)+" cambio con V["+j+"]: "+vector.get(j));
                Aux = vector.get(i);
                vector.set(i, vector.get(j));
                vector.set(j, Aux);
            }
        }
        System.out.println("V["+p+"]"+vector.get(p)+" cambio con V["+j+"]: "+vector.get(j));
        Aux = vector.get(p);
        vector.set(p, vector.get(j));
        vector.set(j, Aux);

        return j;
    }

    public void QuickSortForFingers(ArrayList<Integer> vector, int p, int r) {
        if (p < r) {
            int q = Partition4(vector, p, r);

            QuickSortForFingers(vector, p, (q - 1));
            QuickSortForFingers(vector, (q + 1), r);

        }
    }

    private int Partition4(ArrayList<Integer> vector, int p, int r) {
        int pivot = vector.get(r);
        int i = p - 1;

        int Aux;

        for (int j = p; j < r; j++) {
            if ((int) vector.get(j) <= pivot) {
                i = i + 1;
                System.out.println("hace swap");
                System.out.println("V[" + i + "]: " + vector.get(i) + " cambio con V[" + j + "]: " + vector.get(j));

                Aux = vector.get(i);
                vector.set(i, vector.get(j));
                vector.set(j, Aux);
            }
        }

        System.out.println("hace swap");
        System.out.println("V[" + (i + 1) + "]: " + vector.get(i + 1) + " cambio con V[" + r + "]: " + vector.get(r));
        
        Aux = vector.get(i + 1);
        vector.set((i + 1), vector.get(r));
        vector.set(r, Aux);

        return i + 1;
    }
    
    public void MultiMatrices(int[] deno){
        for (int i = 1; i < deno.length; i++) {
            System.out.println("denominaciones: "+deno[i-1]+"x"+deno[i]);
        }
         int[] [] Table = new int[deno.length -1][deno.length -1];
         
        for (int i = 0; i < 10; i++) {
            Table[i][i] = 0;
        }
        int j = Table.length-1;
        int l;
        int r;
        int min;
        
        while(j == 0){
            for (int i = 1; i < j-i; i++) {
                if(Table[i - 1][i] == 0 && Table[i+1][i] == 0){
                   l = deno[i-1]*deno[i];
                   r = deno[i]*deno[i+1];
                   
                   Table[i][i] = l*r;
                }
                else if(Table[i-1][i] != 0 && Table[i+1][i] != 0){
                    min =Math.min(Table[i-1][i],Table[i+1][i]);
                    
                    if(min == Table[i-1][i]){
                        Table[i][i] = min * deno[i+1];
                    }
                    else{
                        Table[i][i] = min * deno[i-1];
                    }
                }
            }
        }
       
       
        
    }
    
   
    
    
}
