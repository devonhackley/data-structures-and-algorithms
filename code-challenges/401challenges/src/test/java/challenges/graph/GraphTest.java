package challenges.graph;


import org.junit.Test;
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
}
