package com.company;

import java.util.Scanner;

public class Main {
    static BinaryTree A = new BinaryTree();

    public static void main(String[] args) {
        ShowMenu();
        Scanner input = new Scanner(System.in);
        while (input.hasNext())
            MenuChoose(input.nextInt());
    }

    public static void MenuChoose(int NumMenu) {

        Scanner in = new Scanner(System.in);
        switch (NumMenu) {
            case 1:
                A.lRun();                       // Обход в глубину
                ShowMenu();
                break;
            case 2:
                System.out.println("Введите элемент");
                String value = in.next();
                A.add(value);
                ShowMenu();

                break;
            case 3:
                A.wRun();                       // Обход в ширину
                ShowMenu();
                break;
        }
    }

    public static void ShowMenu() {
        System.out.println("\n" + " Введите команду : " + "\n" +
                "\n" + "1: Обход в глубину" +
                "\n" + "2: Добавить Элемент" +
                "\n" + "3: Обход в ширину и печать");
    }
}