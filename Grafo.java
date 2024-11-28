import java.util.*;

    public class Grafo {
    private Map<Integer, List<Integer>> listaAdjacencia;

    
    public Grafo() {
        listaAdjacencia = new HashMap<>();
    }

    
    public void adicionarAresta(int v1, int v2) {
        listaAdjacencia.putIfAbsent(v1, new ArrayList<>());
        listaAdjacencia.get(v1).add(v2);

        listaAdjacencia.putIfAbsent(v2, new ArrayList<>());
        listaAdjacencia.get(v2).add(v1);
    }

    
    public boolean saoVizinhos(int v1, int v2) {
        return listaAdjacencia.containsKey(v1) && listaAdjacencia.get(v1).contains(v2);
    }

    
    public void obterVizinhos(int vertice) {
        if (listaAdjacencia.containsKey(vertice)) {
            List<Integer> vizinhos = listaAdjacencia.get(vertice);
            System.out.println("Vizinhos de " + vertice + ": " + vizinhos);
        } 
        else {
            System.out.println("O vértice " + vertice + " não existe no grafo.");
        }
    }

    
    public Map<Integer, List<Integer>> getListaAdjacencia() {
        return listaAdjacencia;
    }
    
    public void imprimirGrafo() {
        System.out.println("Grafo no formato de listas de adjacência:");
        for (int vertice : listaAdjacencia.keySet()) {
            System.out.print(vertice + " -> ");
            System.out.println(listaAdjacencia.get(vertice));
        }
    }
}


