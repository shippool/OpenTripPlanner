package org.opentripplanner.graph_builder.issues;

import org.opentripplanner.graph_builder.DataImportIssue;
import org.opentripplanner.routing.graph.Vertex;

public class BogusVertexGeometry implements DataImportIssue {

    public static final String FMT = "Vertex %s has NaN location; this will cause all sorts of " +
    		"problems. This is probably caused by a bug in the graph builder, but could " +
    		"conceivably happen with extremely bad GTFS or OSM data.";
    
    final Vertex vertex;
    
    public BogusVertexGeometry(Vertex vertex){
    	this.vertex = vertex;
    }
    
    @Override
    public String getMessage() {
        return String.format(FMT, vertex);
    }

}
