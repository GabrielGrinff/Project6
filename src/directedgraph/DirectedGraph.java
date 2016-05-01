//Programmer: Gabriel Grinffiel
//Class: CS 3345.003
//Date: 4/30/2016
//Project 6
package directedgraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.io.*;

public class DirectedGraph {

    private List<Vertex> nodes;
    private List<Edge> edges;
    
    public static void main(String[] args) {
        
        try{
            FileReader flightData = new FileReader("fldata.txt");
            BufferedReader fRead = new BufferedReader(flightData);
            FileReader requestData = new FileReader("rqdata.txt");
            BufferedReader rRead = new BufferedReader(requestData);
            String fLine, junk = null;
            //, rLine, junk, destination, cost, time = null;
            int fInd = 0;
            int iTime = 0;
            int iCost = 0;
            
            
            while((fLine = fRead.readLine()) != null){
                if(fInd == 0)
                    junk = fLine;
                else{
                    String[] sLine = fLine.split("|");
                    String[] dLine = fLine.split("|");
                    String[] cost = fLine.split("|");
                    String[] time = fLine.split("");
                }
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("Error, file doesn't exist");
            System.exit(0);
        }
        catch(IOException ex){
            System.out.println("Error");
            System.exit(0);
        }
    }
    private void addLane(String laneId, int sourceLocNo, int destLocNo, int duration) {
        Edge lane = new Edge(laneId,nodes.get(sourceLocNo), nodes.get(destLocNo), duration);
        edges.add(lane);
  }
}
