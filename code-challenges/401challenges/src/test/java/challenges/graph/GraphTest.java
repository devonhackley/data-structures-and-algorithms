package challenges.graph;


import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedList;

import static org.junit.Assert.*;
public class GraphTest {
    @Test public void testGraph(){
        Graph graph = new Graph();
        Node devon = graph.addNode("devon");
        Node evan = graph.addNode("evan");

        assertEquals(2, graph.getSize());
        assertTrue(graph.getNodes().contains(devon));
        assertTrue(graph.getNodes().contains(evan));
    }

    @Test public void testEmptyGraph(){
        Graph graph = new Graph();
        assertEquals(0, graph.getSize());
        assertFalse(graph.getNodes().contains(new Node("simon")));
    }

    @Test public void testGraphAddEdge(){
        Graph graph = new Graph();
        Node devon = graph.addNode("devon");
        Node evan = graph.addNode("evan");
        Node michelle = graph.addNode("michelle");

        graph.addEdge(devon, evan);
        graph.addEdge(devon,michelle);

        assertTrue(graph.getVertices().size() > 0);
    }

    @Test public void testGraphGetNodes(){
        Graph graph = new Graph();
        Node devon = graph.addNode("devon");
        Node evan = graph.addNode("evan");
        Node michelle = graph.addNode("michelle");

        assertTrue(graph.getNodes().size() == 3);
        assertTrue(graph.getNodes().contains(devon));
    }

    @Test public void testBreadthFirst(){
        Graph graph = new Graph();
        Node pandora = new Node("pandora");
        Node arendelle = new Node("arendelle");
        Node metroville = new Node("metroville");
        Node monstroplolis = new Node("monstroplolis");
        Node narnia = new Node("narnia");
        Node naboo = new Node("naboo");

        //add neighbors
        HashSet<Node> neighbor1 = new HashSet<>();
        neighbor1.add(pandora);
        neighbor1.add(metroville);
        neighbor1.add(monstroplolis);
        arendelle.setNeighbors(neighbor1);

        HashSet<Node> neighbor2 = new HashSet<>();
        neighbor2.add(arendelle);
        pandora.setNeighbors(neighbor2);

        HashSet<Node> neighbor3 = new HashSet<>();
        neighbor3.add(arendelle);
        neighbor3.add(narnia);
        neighbor3.add(naboo);
        neighbor3.add(monstroplolis);
        metroville.setNeighbors(neighbor3);

        HashSet<Node> neighbor4 = new HashSet<>();
        neighbor4.add(arendelle);
        neighbor4.add(metroville);
        neighbor4.add(naboo);
        monstroplolis.setNeighbors(neighbor4);

        HashSet<Node> neighbor5 = new HashSet<>();
        neighbor5.add(metroville);
        neighbor5.add(naboo);

        HashSet<Node> neighbor6 = new HashSet<>();
        neighbor6.add(narnia);
        neighbor6.add(metroville);
        neighbor6.add(monstroplolis);

        LinkedList<Node> expected = new LinkedList<>();
        expected.add(pandora);
        expected.add(arendelle);
        expected.add(metroville);
        expected.add(monstroplolis);
        expected.add(narnia);
        expected.add(naboo);

        assertEquals(expected, graph.breadthFirstTraversal(pandora));
    }

    @Test(expected = NullPointerException.class)
    public void testEmptyGraphBreadthFirst(){
        Graph graph = new Graph();
        graph.breadthFirstTraversal(null);
    }

    @Test public void testOneValueGraph(){
        Graph graph = new Graph();
        Node pandora = new Node("pandora");

        LinkedList<Node> expected = new LinkedList<>();
        expected.add(pandora);

        assertEquals(expected, graph.breadthFirstTraversal(pandora));
    }
}
