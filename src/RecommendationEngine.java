import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecommendationEngine {

    public List <User> recommendFriends (NodeGraph<User> node, Graph<User> graph){
        List<User> recommendations = new ArrayList<>();
        for (NodeGraph <User> potentialFriendNode : graph.getNodes() ) {
            User potentialFriend = potentialFriendNode.getData();
            if (!node.getFriends().contains(potentialFriendNode) && !node.getData().equals(potentialFriend)) {
                double similarity = calculateSimilarity(node.getData(), potentialFriend);
                if (similarity >0.3) { //Umbral para recomendacion
                    recommendations.add(potentialFriend);
                    
                }
                
            }
            
        }
        return recommendations;
    }


    private double calculateSimilarity(User user1, User user2){
        Set<String> interests1 = new HashSet<>(user1.getInterests());
        Set<String> interests2 = new HashSet<>(user2.getInterests());
        Set<String> interseccion = new HashSet<>(interests1);
        interseccion.retainAll(interests2);
        Set<String> union = new HashSet<>(interests1);
        union.addAll(interests2);

        double resp = (double) interseccion.size() / union.size();
        System.out.println("Valor - "+resp);

        return resp;

    }

}
