package dev.ranieri.collect;

import java.util.*;

public class CollectionPlayground {

    public static void main(String[] args) {

        Player lebron = new Player("Lebron", 37, 81);
        Player steph = new Player("Steph",34, 74);
        Player giannis = new Player("Giannis", 27, 83);

        // List Interface
        // 1. A list can contain duplicates
        // 2. Maintain the order of insertion
        List<Player> playerList = new LinkedList(); // array list is a class
        playerList.add(lebron);
        playerList.add(steph);
        playerList.add(giannis);
        playerList.add(giannis);


        // Set Interface
        // 1. Cannot contain duplicates
        // 2. DOES NOT maintain the order of insertion
        Set<Player> playerSet = new HashSet(); // array list is a class
        playerSet.add(lebron);
        playerSet.add(steph);
        playerSet.add(giannis);
        playerSet.add(giannis);


        // Map Interface
        // 1. Objects are stored via Key Value pairs
        // 2. You cannot directly iterate over a map
        Map<String, Player> playerMap = new HashMap();
        playerMap.put("The King", lebron);
        playerMap.put("Greek", giannis);
        playerMap.put("Splash", steph);

        Player player = playerMap.get("Greek");


        // Queue
        // 1. Objects are stored First in First Out FIFO
        Queue<Player> playerQueue = new LinkedList();
        playerQueue.add(lebron);
        playerQueue.add(giannis);
        playerQueue.add(steph);

        // System.out.println(playerQueue.size()); // 3
        Player p1 = playerQueue.poll();// lebron
        Player p2 = playerQueue.poll();// giannis
        Player p3 = playerQueue.poll();// steph
        // System.out.println(p2);
        // System.out.println(playerQueue.size()); // 0

        // Stack (Realistically you would use Deque)
        // 1. Last In First Out
        Deque<Player> playerStack = new ArrayDeque<>();
        playerStack.add(lebron);
        playerStack.add(giannis);
        playerStack.add(steph);

        Player p10 = playerStack.pop();// steph
        Player p20 = playerStack.pop();// giannis
        Player p30 = playerStack.pop();// lebron


    }
}
