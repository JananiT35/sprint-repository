package quiz;

public class LineList {
	class LineList implements ListOfLines {
		 Vector<Line> lines;
		 public LineList(Vector<Line> lines) {
		 this.lines = lines;
		 }
		 public Vector<Line> getLinesFromStartingPoint(Point p) {
		 Vector<Line> res = new Vector<>();
		 int n=lines.size();
		 for (int i = 0; i < n; i++) {
		 Line c = lines.elementAt(i);
		 if (test(c.getStart(), p))
		 res.add(c);
		 }
		 return res;
		 }
		 private boolean test(Point a, Point b) {
		 return a.getX() == b.getX() && a.getY() == b.getY();
		 }
		 public Line getLineWithMaxLength() {
		 Line maxl = lines.elementAt(0);
		 for (int i = 1; i < n; i++) {
		 if (lines.elementAt(i).getLineLength() > maxl.getLineLength())
		 maxl = lines.elementAt(i);
		 }
		 return maxl;
		 }
		}
	public Line getLinesfromStartingPoint(Point p) {
		
	}
}
class Edge {
	 public final int fromNode;
	 public final int toNode;
	 private Edge(int fromNode, int toNode) {
	 this.fromNode = fromNode;
	 this.toNode = toNode;
	 }
	 @Override
	 public boolean equals(Object o) {
	 if (this == o) {
	 return true;
	 }
	 Edge edge = (Edge) o;
	 return this.fromNode == edge.fromNode && this.toNode == edge.toNode;
	 }
	 @Override
	 public int hashCode() {
	 return (int) (fromNode * 100000L * toNode) % 1000000007;
	 }
	 @Override
	 public String toString() {
	 return ("From node: " + this.fromNode + " To node: " + this.toNode);
	 }
	 public static Edge createEdge(int fromNode, int toNode) {
	 return new Edge(fromNode, toNode);
	 }
	}
class Edge implements Comparable<Edge> {
    private int fromNode;
    private int toNode;
 
    public Edge(int fromNode, int toNode) {
        this.fromNode = fromNode;
        this.toNode = toNode;
    }
 
    public static Edge createEdge(int fromNode, int toNode) {
        return new Edge(fromNode, toNode);
    }
 
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        Edge ed = (Edge) obj;
        return fromNode == ed.fromNode && toNode == ed.toNode;
    }
 
    public int compareTo(Edge ed) {
        if (this.fromNode != ed.fromNode)
            return Integer.compare(this.fromNode, ed.fromNode);
        return Integer.compare(this.toNode, ed.toNode);
    }
 
    public int hashCode() {
        return Objects.hash(fromNode, toNode);
    }
 
    public String toString() {
        return "From node: " + fromNode + " To node: " + toNode;
    }
}
 
