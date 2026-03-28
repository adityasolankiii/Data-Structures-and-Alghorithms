package Heaps;

import java.util.ArrayList;

public class HeapImplementation {
    static class Heap {
        ArrayList<Integer> nodes = new ArrayList<>();

        /***
         * Add element into Heap
         * @param data value that you want to add into the Heap
         */
        public void add(int data) {
            nodes.add(data);

            int chIdx = nodes.size() - 1;

            while (chIdx > 0) {
                int parIdx = (chIdx - 1) / 2;

                if (nodes.get(chIdx) < nodes.get(parIdx)) {
                    // swap
                    int temp = nodes.get(chIdx);
                    nodes.set(chIdx, nodes.get(parIdx));
                    nodes.set(parIdx, temp);

                    chIdx = parIdx;
                } else {
                    break;
                }
            }
        }

        /***
         * This method returns the top element from Heap
         * @return top element from Heap
         */
        public int peek() {
            return nodes.getFirst();
        }

        /***
         * This function will correct the heap when remove function called
         * @param idx First Index
         */
        private void heapify(int idx) {
            int left = 2*idx+1;
            int right = 2*idx+2;

            int minIdx = idx;

            if(left < nodes.size() && nodes.get(minIdx) > nodes.get(left)) {
                minIdx = left;
            }

            if(right < nodes.size() && nodes.get(minIdx) > nodes.get(right)) {
                minIdx = right;
            }

            if(minIdx != idx) {
                //swap
                int temp = nodes.get(idx);
                nodes.set(idx, nodes.get(minIdx));
                nodes.set(minIdx, temp);

                heapify(minIdx); //to set child nodes correctly
            }

        }
        /***
         * This method removes the top element from Heap
         * @return removed element
         */
        public int remove() {
            int data = nodes.getFirst();

            //step1 - swap first & last
            int temp = nodes.getFirst();
            nodes.set(0, nodes.getLast());
            nodes.set(nodes.size()-1, temp);

            //step2 - delete last
            nodes.removeLast();

            //step3 - Heapify
            heapify(0);

            return data;
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();

        // Add elements
        heap.add(10);
        heap.add(5);
        heap.add(30);
        heap.add(2);
        heap.add(8);

        // Peek top element
        System.out.println("Top element (min): " + heap.peek());

        // Remove elements one by one
        System.out.println("Removing elements:");
        while (!heap.nodes.isEmpty()) {
            System.out.print(heap.remove()+" ");
        }
    }
}
