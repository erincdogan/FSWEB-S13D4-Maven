package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Point first = new Point(6, 5);
        System.out.println(first.getX());
        System.out.println(first.getY());
        Point second = new Point(3, 1);
        System.out.println(second.getX());
        System.out.println(second.getY());
        System.out.println("----------------------------------");
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("----------------------------------");
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("----------------------------------");
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        System.out.println("----------------------------------");
        Point point = new Point(0,0);
        System.out.println("distance()= " + point.distance());
        System.out.println("----------------------------------");
        Player player1 = new Player("John", 100, Weapon.SWORD);
        System.out.println(player1.healthRemaining());
        System.out.println(player1.loseHealth(100));
        System.out.println(player1.restoreHealth(150));
    }
}