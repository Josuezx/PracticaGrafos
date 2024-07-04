import java.util.ArrayList;
import java.util.List;

public class NodeGraph<T> {
    private T data;
    private List<NodeGraph<T>> friends;

    public NodeGraph(T data) {
        this.data = data;
        this.friends = new ArrayList<>();
    }

    public T getData() {
        return data;
    }

    public List<NodeGraph<T>> getFriends() {
        return friends;
    }

    public void addConnection(NodeGraph<T> node) {
        friends.add(node);
    }

    
}
