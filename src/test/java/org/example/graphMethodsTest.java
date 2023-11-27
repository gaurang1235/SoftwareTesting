package org.example;


import org.example.Models.Edge;
import org.example.Service.graphMethods;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class graphMethodsTest {

    @Test
    public void testTopoSort() {
        graphMethods solution = new graphMethods();
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(3);
        adj.get(3).add(4);

        int[] result = solution.topoSort(V, adj);
        int[] expected = {0, 2, 1, 3, 4};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testKahnSort() {
        graphMethods solution = new graphMethods();
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(3);
        adj.get(3).add(4);

        int[] result = solution.kahnSort(V, adj);
        int[] expected = {0, 1, 2, 3, 4};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testBFSOfGraph() {
        graphMethods solution = new graphMethods();
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(3);
        adj.get(3).add(4);

        ArrayList<Integer> result = solution.bfsOfGraph(V, adj);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        assertEquals(expected, result);
    }

    @Test
    public void testDFSOfGraph() {
        graphMethods solution = new graphMethods();
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(3);
        adj.get(3).add(4);

        ArrayList<Integer> result = solution.dfsOfGraph(V, adj);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 3, 4, 2));
        assertEquals(expected, result);
    }

    @Test
    public void testIsCycle() {
        graphMethods solution = new graphMethods();
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(0);

        assertTrue(solution.isCycle(V, adj));
    }

    @Test
    public void testIsCyclic() {
        graphMethods solution = new graphMethods();
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(0);

        assertTrue(solution.isCyclic(V, adj));
    }

    @Test
    public void testIsBipartite() {
        graphMethods solution = new graphMethods();
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);

        assertTrue(solution.isBipartite(V, adj));
    }

    @Test
    public void testDijkstra() {
        graphMethods solution = new graphMethods();
        int V = 5;
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.get(0).add(new ArrayList<>(Arrays.asList(2, 4)));
        adj.get(1).add(new ArrayList<>(Arrays.asList(3, 5)));
        adj.get(2).add(new ArrayList<>(Arrays.asList(3, 1)));
        adj.get(3).add(new ArrayList<>(Arrays.asList(4, 3)));

        int[] result = solution.dijkstra(V, adj, 0);
        int[] expected = {0, 2, 4, 5, 8};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testBellmanFord() {
        graphMethods solution = new graphMethods();
        int V = 5;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(Arrays.asList(0, 1, 2)));
        edges.add(new ArrayList<>(Arrays.asList(0, 2, 4)));
        edges.add(new ArrayList<>(Arrays.asList(1, 3, 5)));
        edges.add(new ArrayList<>(Arrays.asList(2, 3, 1)));
        edges.add(new ArrayList<>(Arrays.asList(3, 4, 3)));

        int[] result = solution.bellman_ford(V, edges, 0);
        int[] expected = {0, 2, 4, 5, 8};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTopoSortWithDisconnectedGraph() {
        graphMethods solution = new graphMethods();
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(3);
        adj.get(3).add(4);

        // Adding an isolated node
        adj.add(new ArrayList<>());

        int[] result = solution.topoSort(V + 1, adj);
        int[] expected = {5, 0, 2, 1, 3, 4}; // Including the isolated node
        assertArrayEquals(expected, result);
    }

    @Test
    public void testIsCyclicWithDisconnectedGraph() {
        graphMethods solution = new graphMethods();
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(0);

        // Adding an isolated node
        adj.add(new ArrayList<>());

        assertTrue(solution.isCyclic(V + 1, adj));
    }

    @Test
    public void testTopoSortWithEmptyGraph() {
        graphMethods solution = new graphMethods();
        int V = 0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int[] result = solution.topoSort(V, adj);
        int[] expected = {};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testKahnSortWithEmptyGraph() {
        graphMethods solution = new graphMethods();
        int V = 0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int[] result = solution.kahnSort(V, adj);
        int[] expected = {};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testBFSOfGraphWithEmptyGraph() {
        graphMethods solution = new graphMethods();
        int V = 0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        ArrayList<Integer> result = solution.bfsOfGraph(V, adj);
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    public void testDFSOfGraphWithEmptyGraph() {
        graphMethods solution = new graphMethods();
        int V = 0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        ArrayList<Integer> result = solution.dfsOfGraph(V, adj);
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    public void testIsCycleWithDisconnectedGraph() {
        graphMethods solution = new graphMethods();
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(0);

        // Adding an isolated node
        adj.add(new ArrayList<>());

        assertTrue(solution.isCycle(V + 1, adj));
    }

    @Test
    public void testIsCyclicWithDisconnectedGraphAndIsolatedNodes() {
        graphMethods solution = new graphMethods();
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(0);

        // Adding isolated nodes
        adj.add(new ArrayList<>());
        adj.add(new ArrayList<>());

        assertTrue(solution.isCyclic(V + 2, adj));
    }

    @Test
    public void testIsBipartiteWithDisconnectedGraph() {
        graphMethods solution = new graphMethods();
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(0);

        // Adding an isolated node
        adj.add(new ArrayList<>());

        assertTrue(solution.isBipartite(V + 1, adj));
    }

    @Test
    public void testIsCycleWithSingleNode() {
        graphMethods solution = new graphMethods();
        int V = 1;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        assertFalse(solution.isCycle(V, adj));
    }

    @Test
    public void testIsCyclicWithSingleNode() {
        graphMethods solution = new graphMethods();
        int V = 1;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        assertFalse(solution.isCyclic(V, adj));
    }

    @Test
    public void testIsBipartiteWithSingleNode() {
        graphMethods solution = new graphMethods();
        int V = 1;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        assertTrue(solution.isBipartite(V, adj));
    }

    @Test
    public void testDijkstraWithSingleNode() {
        graphMethods solution = new graphMethods();
        int V = 1;
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        int[] result = solution.dijkstra(V, adj, 0);
        int[] expected = {0};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testBellmanFordWithSingleNode() {
        graphMethods solution = new graphMethods();
        int V = 1;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();

        int[] result = solution.bellman_ford(V, edges, 0);
        int[] expected = {0};
        assertArrayEquals(expected, result);
    }


    @Test
    public void testIsBipartiteWithDisconnectedGraphAndCycle() {
        graphMethods solution = new graphMethods();
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(0);

        adj.get(3).add(4);
        adj.get(4).add(5);
        adj.get(5).add(3);

        assertFalse(solution.isBipartite(V, adj));
    }

//    @Test
//    public void testDijkstraWithGraphContainingNegativeWeight() {
//        Solution1 solution = new Solution1();
//        int V = 4;
//        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
//        for (int i = 0; i < V; i++) {
//            adj.add(new ArrayList<>());
//        }
//        adj.get(0).add(new ArrayList<>(Arrays.asList(1, 2)));
//        adj.get(0).add(new ArrayList<>(Arrays.asList(2, -3)));
//        adj.get(1).add(new ArrayList<>(Arrays.asList(3, 5)));
//        adj.get(2).add(new ArrayList<>(Arrays.asList(3, 1)));
//
//        int[] result = solution.dijkstra(V, adj, 0);
//        int[] expected = {0, 2, -1, 1};
//        assertArrayEquals(expected, result);
//    }

    @Test
    public void testBellmanFordWithGraphContainingNegativeCycle() {
        graphMethods solution = new graphMethods();
        int V = 4;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(Arrays.asList(0, 1, 2)));
        edges.add(new ArrayList<>(Arrays.asList(0, 2, -3)));
        edges.add(new ArrayList<>(Arrays.asList(1, 3, 5)));
        edges.add(new ArrayList<>(Arrays.asList(2, 3, 1)));
        edges.add(new ArrayList<>(Arrays.asList(3, 0, -7)));

        int[] result = solution.bellman_ford(V, edges, 0);
        int[] expected = {-1};
        assertArrayEquals(expected, result);
    }


    @Test
    public void testKruskalMSTWithValidInput() {
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 2));
        edges.add(new Edge(1, 2, 4));
        edges.add(new Edge(2, 3, 1));
        edges.add(new Edge(3, 0, 3));

        graphMethods kruskalMST = new graphMethods();
        List<Edge> result = kruskalMST.kruskalMST(edges, 4);

        // Verify that the result is a valid MST
        assertEquals(3, result.size());  // The MST should have V-1 edges for V vertices

        // You may want to further validate the specific edges in the MST
    }

    @Test
    public void testKruskalMSTWithEmptyEdges() {
        List<Edge> edges = new ArrayList<>();

        graphMethods kruskalMST = new graphMethods();
        List<Edge> result = kruskalMST.kruskalMST(edges, 0);

        // The result should be an empty list since there are no edges
        assertEquals(0, result.size());
    }

    @Test
    public void testFindWithValidInput() {
        int[] parent = {0, 1, 2, 3};

        graphMethods kruskalMST = new graphMethods();
        int result = kruskalMST.find(parent, 2);

        // The result should be the root of the set, which is 2 in this case
        assertEquals(2, result);
    }

    @Test
    public void testUnionWithValidInput() {
        int[] parent = {0, 1, 2, 3};

        graphMethods kruskalMST = new graphMethods();
        kruskalMST.union(parent, 1, 3);

        // After union, the parent of 1 should be 3
        assertEquals(3, parent[1]);
    }

    @Test
    public void testHamiltonianCycle() {
        graphMethods hamiltonianCycle = new graphMethods();
        int[] ans1 = { 0, 1, 2, 4, 3, 0 };
        int[][] arr1 = {
                { 0, 1, 0, 1, 0 },
                { 1, 0, 1, 1, 1 },
                { 0, 1, 0, 0, 1 },
                { 1, 1, 0, 0, 1 },
                { 0, 1, 1, 1, 0 },
        };
        assertArrayEquals(ans1, hamiltonianCycle.findHamiltonianCycle(arr1));

        int[] ans2 = { -1, -1, -1, -1, -1, -1 };
        int[][] arr2 = {
                { 0, 1, 0, 1, 0 },
                { 1, 0, 1, 1, 1 },
                { 0, 1, 0, 0, 1 },
                { 1, 1, 0, 0, 0 },
                { 0, 1, 1, 0, 0 },
        };
        assertArrayEquals(ans2, hamiltonianCycle.findHamiltonianCycle(arr2));
    }
}
