package Hashing;

import java.util.*;

public class HashMapImplementation {

    static class HashMap<K, V> {

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of nodes
        private int N; // number of buckets
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        // ---------------- HASH FUNCTION ----------------
        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        // ---------------- SEARCH IN LinkedList ----------------
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for (Node node : ll) {
                if (node.key.equals(key)) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        // ---------------- PUT ----------------
        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;

            if (lambda > 2.0) {
                rehash();
            }
        }

        // ---------------- GET ----------------
        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                return buckets[bi].get(di).value;
            }
            return null;
        }

        // ---------------- CONTAINS KEY ----------------
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            return di != -1;
        }

        // ---------------- REMOVE ----------------
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            return null;
        }

        // ---------------- KEY SET ----------------
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (LinkedList<Node> ll : buckets) {
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        // ---------------- IS EMPTY ----------------
        public boolean isEmpty() {
            return n == 0;
        }

        // ---------------- REHASH ----------------
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBucket = buckets;

            buckets = new LinkedList[N * 2];
            N = N * 2;

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            n = 0;

            for (LinkedList<Node> ll : oldBucket) {
                while (!ll.isEmpty()) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }
    }

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100);
        map.put("China", 150);
        map.put("USA", 50);

        System.out.println(map.get("India")); // 100
        System.out.println(map.containsKey("USA")); // true

        map.remove("China");

        ArrayList<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + map.get(key));
        }

        System.out.println("Is Empty: " + map.isEmpty());
    }
}