/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;

public class App {
    public String getGreeting() {
        return "こんにちは SEMonster";
    }

    public static void main(String[] args) {
        //Monster.java
        System.out.println(new App().getGreeting());
        Monster monster = new Monster(0,0);
        System.out.println(monster.toString());
        //Player.java
        int num[] ={0,1,2,3,4};
        String name = "konishi";
        Player player = new Player(num,name);
        player.deckoutput();git
    }


}
