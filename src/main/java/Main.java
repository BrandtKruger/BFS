

public class Main {

    public static void main(String[] args) {

        BFS bfs = new BFS();

        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex5 = new Vertex(5);
        Vertex vertex6 = new Vertex(6);
        Vertex vertex7 = new Vertex(7);

        vertex1.addNeighborVertex(vertex3);
        vertex1.addNeighborVertex(vertex4);
        vertex2.addNeighborVertex(vertex5);
        vertex2.addNeighborVertex(vertex6);
        vertex3.addNeighborVertex(vertex7);

        bfs.bfs(vertex1);

    }


}
