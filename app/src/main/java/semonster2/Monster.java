package semonster2;

public class Monster {
  private String name;
  private int rare;


  Monster(int nameNum, int rareNum) {
    this.name = this.summonMonster(nameNum);
    this.rare = rareNum;
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント","サイバードラゴン","クリボー","ニトロウォーリアー" };
    return monsters[mnumber];
  }

  void evolveMonster() {
    if (this.rare >= 3) this.name = "レア・" + this.name; 
  }

  @Override
  public String toString() {
    this.evolveMonster();
    return this.name + ":レア度[" + this.rare + "]";
  }
}
