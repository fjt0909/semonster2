package semonster2;

public class Monster {
  private String name;
  private int rare;


  Monster(int nameNum, int rareNum) {
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
