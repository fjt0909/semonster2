package semonster2;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {
  public void testdeckoutput() {
    int num[] ={0,1,2,3,4};
    String name = "koudaitarou";
    Player player = new Player(num,name);
    Assert.assertEquals("Deck koudaitaro\nスライム:レア度[0]サハギン:レア度[1]ドラゴン:レア度[2]デュラハン:レア度[3]シーサーペント:レア度[4]",player.deckoutput());
  }

}
