package cz.educanet.praha;

import java.util.Scanner;

public class VstupPredstaveni {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Ahoj, já jsem");
        System.out.println(name);

        System.out.println("Je mi");
        System.out.println(age);
    }
}
