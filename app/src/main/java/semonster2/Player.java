package semonster2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Player {
  String name;// Player name
  int randomNumberList[];
  ArrayList<Monster> monsterDeck = new ArrayList<>();
  ArrayList<Monster> monsterATK = new ArrayList<>();
  // randomな0~4の数値を必要な数保存しておく
  Player(int randomNumberList[], String playerName) {
    this.randomNumberList = randomNumberList;
    this.name = playerName;
    drawMonsters();
  }

  public void drawMonsters() {
    for (int i = 0; i < 5; i++) {
      int num = this.randomNumberList[i];
      this.monsterDeck.add(new Monster(num,num));
    }
  }

  
  public String deckoutput(){
    int num;
    StringBuilder sd = new StringBuilder();
    sd.append("Deck "+ this.name +"\n");
    for(int i=0;i<5;i++){
      sd.append(monsterDeck.get(i));
    }
    return sd.toString();

  }

}
