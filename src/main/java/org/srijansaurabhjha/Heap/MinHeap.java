package org.srijansaurabhjha.Heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class MinHeap {
    public static void main(String[] args){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(3);
        minHeap.add(39);
        minHeap.add(1);

        System.out.println(minHeap.peek());  //1
        System.out.println(minHeap.poll());  //1
        System.out.println(minHeap.peek());  //3
        System.out.println(minHeap.size());  //2

        Queue<Integer> minHeap2 = new PriorityQueue<>();
        minHeap2.add(45);
        minHeap2.add(67);
        minHeap2.add(23);
        System.out.println(minHeap2.peek()); //23
    }
}
