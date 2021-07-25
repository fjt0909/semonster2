package semonster2;

import org.junit.Assert;
import org.junit.Test;

public class MonsterTest {
  @Test
  public void testSummonMonster1() {
    Monster monster = new Monster(0, 0);
    Assert.assertEquals("スライム:レア度[0]", monster.toString());
  }

  @Test
  public void testevolveMonster() {
    Monster monster = new Monster(0, 3);
    Assert.assertEquals("レア・スライム:レア度[3]", monster.toString());
  }
  
  @Test
  public void testSummonMonster2() {
    Monster monster = new Monster(5, 5);
    Assert.assertEquals("レア・サイバードラゴン:レア度[5]", monster.toString());
  }

}
