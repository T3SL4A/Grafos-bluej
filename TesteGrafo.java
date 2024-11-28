import java.util.*;

public class TesteGrafo {
    public static void main(String[] args) {
        
        Grafo grafo = new Grafo();

        
        grafo.adicionarAresta(1, 2); 
        grafo.adicionarAresta(1, 5); 
        grafo.adicionarAresta(2, 5); 
        grafo.adicionarAresta(2, 4); 
        grafo.adicionarAresta(2, 3); 
        grafo.adicionarAresta(3, 4); 
        grafo.adicionarAresta(4, 5); 

        
        System.out.println("Grafo no formato de listas de adjacência:");
        imprimirGrafo(grafo);

        
        grafo.obterVizinhos(1); 
        grafo.obterVizinhos(4); 
        grafo.obterVizinhos(6); 
    }

    
    public static void imprimirGrafo(Grafo grafo) {
        
        Map<Integer, List<Integer>> listaAdjacencia = grafo.getListaAdjacencia();

        
        for (int vertice : listaAdjacencia.keySet()) {
            System.out.print(vertice + " -> ");
            System.out.println(listaAdjacencia.get(vertice));
        }
    }
}

