//Programmer: Gabriel Grinffiel
//Class: CS 3345.003
//Date: 4/30/2016
//Project 6
package directedgraph;

import java.util.List;

public class Graph {
  private final List<Vertex> vertexes;
  private final List<Edge> edges;

  public Graph(List<Vertex> vertexes, List<Edge> edges) {
    this.vertexes = vertexes;
    this.edges = edges;
  }

  public List<Vertex> getVertexes() {
    return vertexes;
  }

  public List<Edge> getEdges() {
    return edges;
  }
} 
