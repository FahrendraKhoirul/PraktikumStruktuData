
package prakstrukdat_m10_graph;


public class PraktikumGraph_1App {
    public static void main(String[] args) {
        PraktikumGraph_1 nomor1 = new PraktikumGraph_1();
        nomor1.addVertex('A');
        nomor1.addVertex('B');
        nomor1.addVertex('C');
        nomor1.addVertex('D');
        nomor1.addVertex('E');
        
        nomor1.addEdge(0, 2);
        nomor1.addEdge(1, 0);
        nomor1.addEdge(1, 4);
        nomor1.addEdge(4, 2);
        nomor1.addEdge(3, 4);
        
        nomor1.display();
        
        nomor1.dfs();
//        
        nomor1.topo();
        
    }
}
