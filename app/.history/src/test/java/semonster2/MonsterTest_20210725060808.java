package semonster2;

import org.junit.Assert;
import org.junit.Test;

public class MonsterTest {
  @Test
  public void testSummonMonster1() {
    Monster monster = new Monster(5, 5);
    Assert.assertEquals("サイバードラゴン:レア度[5]", monster.toString());

  }

}