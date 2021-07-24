package semonster2;

import java.util.HashMap;
import java.util.LinkedList;

public class SeMonsterGame {
  HashMap<String,Player> playerMap = new HashMap<>();

  void addPlayer(String playerName,int randomNumberList[]){
    this.playerMap.put(playerName, new Player(randomNumberList,playerName));
  }
  void draw(String playerName){
    //Player player = this.playerMap.put(playerName);
    //player.drawMonsters();
    //System.out.println(player);
  }

}
