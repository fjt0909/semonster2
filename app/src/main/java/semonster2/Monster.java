package semonster2;

import java.util.Random;

public class Monster {
  private String name;
  private int rare;
  private int HP;
  private int ATK;


  Monster(int nameNum, int rareNum) {
    Random random = new Random();
    Random random2 = new Random();
    this.name = this.summonMonster(nameNum,rareNum);
    this.rare = rareNum;
  }

  String summonMonster(int mnumber ,int rare) {
    String monsters[] = {"スライム","サハギン","ドラゴン","デュラハン","シーサーペント"};
    return monsters[mnumber];
  }

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]";
  }
}
