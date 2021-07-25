public class PlayerTest {
  @Test
  public void testdeckoutput() {
    int num[] ={0,1,2,3,4};
    String name = "konishi";
    Player player = new Player(num,name);
    Assert.assertEquals("Deck konishi\nスライム:レア度[0]サハギン:レア度[1]ドラゴン:レア度[2]デュラハン:レア度[3]シーサーペント:レア度[4]",player.deckoutput());
  }

}
