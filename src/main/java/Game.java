//import jdk.internal.jimage.ImageStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Game {
    ArrayList<Player> players = new ArrayList<>();//храним игроков в виде списков
    private Player player;
  //  Map players= new HashMap();

 //   HashMap<String, String> map = new HashMap<>();


/* for (String name : map.player()) {
     String value = map.get(name);
    }*/

    //метод регистрации игрока
    public void register(Player player) {
       players.add(player);
       // players.put(player.getName(), player);
        }
  //  }

    //метод соревнования
    public int round(String playerName1, String playerName2) {
        Player player1 = null;
        Player player2 = null;

        for (Player player : players) {
            if (player.getName().equals(playerName1)) {
                player1 = player;
            }
            if (player.getName().equals(playerName2)) {
                player2 = player;
            }

        }//если нет таких игроков
        if (player1 == null) {
            throw new NotRegisteredException(playerName1);
        }
        if (player2 == null) {
            throw new NotRegisteredException(playerName2);
        }// сравниваем силу игроков
        if (player1.getStrength() > player2.getStrength()) {
            return 1;

        }
        if (player1.getStrength() < player2.getStrength()) {
            return 2;

        } else {
            return 0;

        }
    }


}
