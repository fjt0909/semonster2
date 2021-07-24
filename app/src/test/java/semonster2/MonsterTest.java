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

}