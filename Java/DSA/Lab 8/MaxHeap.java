import java.io.*;
import java.util.*;

public class MaxHeap{
    int[]heap;
    static int heapSize;
    int sizeMax;

    public int[] getHead(){
        return this.heap;
    }

    public MaxHeap(int cap){
        heapSize = 0;
        this.sizeMax = cap + 1;
        heap = new int [sizeMax];
        heap[0] = -1;
    }
    

    private int parent(int index){
        return index/2;
    }

    private int left(int index){
        return 2*index;
    }

    private int right(int index){
        return 2*index + 1;
    }

    private void swap(int a, int b){
        int tmp = heap[a];
        heap[a] = heap[b];
        heap[b] = tmp;
    }

    private void insert(int item){
        if(heapSize==sizeMax)   return;
        else{
            heapSize++;
            heap[heapSize] = item;
            shiftUp(heapSize);
        }
    }

    private int extractMax(){
        if(heapSize==0) return -1; //No element to extract max
        else{
            int max = heap[1];
            heap[1] = heap[heapSize];
            heapSize--;
            shiftDown(1);
            return max;
        }
    }

    private void shiftDown(int i){
        int max = heap[i];
        int maxID = i;
        if(left(i) <= heapSize  &&  heap[i] <= heap[left(i)]){
            max = heap[left(i)];
            maxID = left(i);
        }
        if(right(i) <= heapSize && heap[i] <= heap[right(i)]){
            max = heap[right(i)];
            maxID = right(i);
        }
        if(maxID==i)    return; 
        else{
            swap(maxID, i);
            i = maxID;
        }
    }

    private void shiftUp(int index){
        while(index>1 && heap[parent(index)] < heap[index]){
            swap(parent(index), index);
            index = parent(index);
        }
    }

    private static void heapSort(int[]arr){
        MaxHeap newHeap = new MaxHeap(arr.length);
        for(int i=0; i<arr.length; i++){
            newHeap.insert(arr[i]);
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = newHeap.extractMax();
        }
    }

    private void print(){
        System.out.println("Max Heap:");
        for (int i = 1; i <= heapSize; i++)
            System.out.print(heap[i] + " ");
    }

    public static void main(String[]args){
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(15);
        maxHeap.insert(23);
        maxHeap.insert(18);
        maxHeap.insert(63);
        maxHeap.insert(21);
        maxHeap.insert(35);
        maxHeap.insert(36);
        maxHeap.insert(21);
        maxHeap.insert(66);
        maxHeap.insert(12);
        maxHeap.insert(42);
        maxHeap.insert(35);
        maxHeap.insert(75);
        maxHeap.insert(23);
        maxHeap.insert(64);
        maxHeap.insert(78);
        maxHeap.insert(39);

        maxHeap.print();

        maxHeap.print();    
        int[] a = maxHeap.getHead();
        System.out.println(Arrays.toString(a));
    }
}