package StackAndQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MAXhead {
    PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }
    );

}
