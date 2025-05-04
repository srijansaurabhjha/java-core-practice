package org.srijansaurabhjha.Heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxHeap {
    public static void main(String[] args){
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        //using Comparatore
        Queue<Integer> maxHeap2= new PriorityQueue<>((o1, o2) -> o2-o1);
        maxHeap2.add(4);
        maxHeap2.add(6);
        maxHeap2.add(2);
        System.out.println(maxHeap2.peek());
    }
}
