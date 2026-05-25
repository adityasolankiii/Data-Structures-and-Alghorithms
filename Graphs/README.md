# Graph Data Structure

A **Graph** is a non-linear data structure used to represent relationships between objects.  
It consists of:

- **Vertices (Nodes)** → entities/data
- **Edges** → connections between nodes

---

# Table of Contents

1. Introduction
2. Types of Graphs
3. Graph Representation
4. Graph Traversal
5. BFS
6. DFS
7. BFS vs DFS
8. Cycle Detection
9. Topological Sorting
10. Dijkstra’s Algorithm
11. Minimum Spanning Tree
12. Applications
13. Complexity Analysis

---

# Introduction

Graphs are widely used in:

- Social Networks
- Google Maps
- Computer Networks
- Recommendation Systems
- Dependency Management

---

# Basic Terminology

| Term | Description |
|---|---|
| Vertex | A node in the graph |
| Edge | Connection between two nodes |
| Degree | Number of edges connected to a node |
| Indegree | Incoming edges |
| Outdegree | Outgoing edges |

---

# Types of Graphs

## 1. Undirected Graph

Edges do not have direction.

```text
A ----- B
 \     /
   C
```

---

## 2. Directed Graph

Edges contain direction.

```text
A → B → C
↑
D
```

---

## 3. Weighted Graph

Edges contain weights.

```text
A --5-- B
```

---

## 4. Unweighted Graph

All edges are equal.

---

## 5. Cyclic Graph

Contains cycles.

```text
A → B → C → A
```

---

## 6. Acyclic Graph

No cycles exist.

---

# Graph Representation

# 1. Adjacency List

Stores neighbors for each node.

## Example

```text
0 → 1 → 2
1 → 0 → 2
2 → 0 → 1
```

## Java Example

```java
import java.util.*;

public class Graph {

    public static void main(String[] args) {

        int V = 3;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(2);

        graph.get(2).add(0);
        graph.get(2).add(1);

        System.out.println(graph);
    }
}
```

## Complexity

| Operation | Complexity |
|---|---|
| Add Edge | O(1) |
| Space | O(V + E) |

---

# 2. Adjacency Matrix

A 2D matrix representation.

## Example

```text
    A B C
A   0 1 1
B   1 0 1
C   1 1 0
```

## Java Example

```java
int[][] graph = {
    {0,1,1},
    {1,0,1},
    {1,1,0}
};
```

## Complexity

| Operation | Complexity |
|---|---|
| Add Edge | O(1) |
| Check Edge | O(1) |
| Space | O(V²) |

---

# Graph Traversal

Traversal means visiting all vertices in the graph.

Main traversal algorithms:

1. BFS (Breadth First Search)
2. DFS (Depth First Search)

---

# Breadth First Search (BFS)

BFS visits nodes level by level.

Uses:
- Queue
- Visited array

---

## BFS Example

```text
0 --- 1
|     |
2 --- 3
```

Traversal:

```text
0 → 1 → 2 → 3
```

---

## BFS Java Code

```java
import java.util.*;

public class BFSGraph {

    static void bfs(ArrayList<ArrayList<Integer>> graph, int start) {

        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            for(int neighbor : graph.get(current)) {

                if(!visited[neighbor]) {

                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {

        int V = 4;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(3);

        graph.get(2).add(0);
        graph.get(2).add(3);

        graph.get(3).add(1);
        graph.get(3).add(2);

        bfs(graph, 0);
    }
}
```

## BFS Complexity

| Complexity | Value |
|---|---|
| Time | O(V + E) |
| Space | O(V) |

---

# Depth First Search (DFS)

DFS explores deeply before backtracking.

Uses:
- Recursion
- Stack

---

## DFS Traversal

```text
0 → 1 → 3 → 2
```

---

## DFS Java Code

```java
import java.util.*;

public class DFSGraph {

    static void dfs(ArrayList<ArrayList<Integer>> graph,
                    int current,
                    boolean[] visited) {

        visited[current] = true;

        System.out.print(current + " ");

        for(int neighbor : graph.get(current)) {

            if(!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {

        int V = 4;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(3);

        graph.get(2).add(0);
        graph.get(2).add(3);

        graph.get(3).add(1);
        graph.get(3).add(2);

        boolean[] visited = new boolean[V];

        dfs(graph, 0, visited);
    }
}
```

## DFS Complexity

| Complexity | Value |
|---|---|
| Time | O(V + E) |
| Space | O(V) |

---

# BFS vs DFS

| Feature | BFS | DFS |
|---|---|---|
| Data Structure | Queue | Stack |
| Traversal | Level-wise | Depth-wise |
| Shortest Path | Yes | No |
| Memory Usage | Higher | Lower |

---

# Cycle Detection

## Undirected Graph

Uses:
- DFS
- Parent tracking

---

## Directed Graph

Uses:
- Recursion stack
- Topological sort

---

# Topological Sorting

Applicable only for Directed Acyclic Graphs (DAG).

Condition:

```text
u → v
```

u must appear before v.

Applications:
- Job scheduling
- Dependency management

---

# Dijkstra’s Algorithm

Finds shortest path from source node.

Works only for:
- Positive edge weights

Uses:
- Priority Queue

---

# Minimum Spanning Tree (MST)

Connects all vertices with minimum cost.

Algorithms:
- Prim’s Algorithm
- Kruskal’s Algorithm

---

# Applications of Graphs

| Application | Usage |
|---|---|
| Google Maps | Shortest path |
| Social Media | Friend network |
| Web Crawlers | Page ranking |
| Compiler Design | Dependency graph |
| Operating Systems | Deadlock detection |

---

# Complexity Summary

| Operation | Complexity |
|---|---|
| BFS | O(V + E) |
| DFS | O(V + E) |
| Adjacency Matrix Space | O(V²) |
| Adjacency List Space | O(V + E) |

---

# Important Interview Questions

1. BFS vs DFS
2. Detect cycle in graph
3. Topological sorting
4. Dijkstra algorithm
5. Number of islands
6. Clone graph
7. Bipartite graph
8. Minimum spanning tree
9. Union Find
10. Strongly connected components

---

# Conclusion

Graphs are one of the most important data structures in computer science.  
They are widely used in networking, AI, social media, routing systems, and many real-world applications.

Mastering:
- BFS
- DFS
- Shortest Path
- MST
- Cycle Detection

is essential for coding interviews and system design.

---