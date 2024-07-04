import java.util.ArrayList;
import java.util.List;

public class Graph<T> {
    private List<NodeGraph<T>> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public void addNode(NodeGraph<T> node) {
        nodes.add(node);
    }

    public void addConnection(NodeGraph<T> node1, NodeGraph<T> node2) {
        if (!node1.getFriends().contains(node2)) {
            node1.addConnection(node2);
        }
        if (!node2.getFriends().contains(node1)) {
            node2.addConnection(node1);
        }
    }

    public List<NodeGraph<T>> getNodes() {
        return nodes;
    }
}
