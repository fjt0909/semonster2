/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;

public class App {
    public String getGreeting() {
        return "こんにちは SEMonster";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Monster monster = new Monster(5,5);
        System.out.println(monster.toString());
    }


}