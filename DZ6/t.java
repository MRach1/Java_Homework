package DZ6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class t {
    public static class Notebook {
        private int RAM;
        private int HDD;
        private int OS;
        private int color;
        private int price;
        private String name;
    }


    public static void print(Object o){
        System.out.println(o);
    }



    public static void main(String[] args) {
        Notebook n1 = new Notebook();
        Notebook n2 = new Notebook();
        Notebook n3 = new Notebook();
        Notebook n4 = new Notebook();
        Notebook n5 = new Notebook();
        {
            n1.RAM = 4;
            n1.HDD = 512;
            n1.OS = 1;
            n1.color = 1;
            n1.price = 30000;
            n1.name = "Lenovo A3";
            n2.RAM = 8;
            n2.HDD = 1024;
            n2.OS = 1;
            n2.color = 2;
            n2.price = 50000;
            n2.name = "Samsung S2";
            n4.RAM = 6;
            n4.HDD = 1024;
            n4.OS = 2;
            n4.color = 3;
            n4.price = 35000;
            n4.name = "Xiaomi X7";
            n3.RAM = 16;
            n3.HDD = 2048;
            n3.OS = 2;
            n3.color = 1;
            n3.price = 45000;
            n3.name = "Asus U10";
            n5.RAM = 8;
            n5.HDD = 1024;
            n5.OS = 3;
            n5.color = 3;
            n5.price = 60000;
            n5.name = "Apple G4";
        }
        System.out.println("1 - RAM\n2 - HDD\n3 - OS\n4 - Color\n5 - Price");
        int par = 0;
        print("Выберите номер нужной характеристики:");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice){
            case (1):
                print("Введите минимальный объём оперативной памяти: ");
                par = in.nextInt();
                break;
            case (2):
                print("Введите минимальный объём жёсткого диска: ");
                par = in.nextInt();
                break;
            case (3):
                print("Выберите операционную систему \nWindows - 1\nLinux - 2\nMac - 3");
                par = in.nextInt();
                break;
            case (4):
                print("Выберите цвет \nblack - 1 \ngrey - 2 \nwhite - 3");
                par = in.nextInt();
                break;
            case (5):
                print("Введите минимальную цену: ");
                par = in.nextInt();
                break;
        }
        Notebook[] ex = new Notebook[5];
        ex[0] = n3;
        ex[1] = n5;
        ex[2] = n4;
        ex[3] = n2;
        ex[4] = n1;
        print("По вaшим параметрам подходят следующие ноутбуки:");
        for (Notebook a: ex){
            switch (choice){
                case (1):
                    if (a.RAM >= par){
                        print(a.name);
                    }
                    break;
                case (2):
                    if (a.HDD >= par){
                        print(a.name);
                    }
                    break;
                case (3):
                    if (a.OS == par){
                        print(a.name);
                    }
                    break;
                case (4):
                if (a.color == par){
                    print(a.name);
                }
                    break;
                case (5):
                if (a.price >= par){
                    print(a.name);
                }
                    break;
            }
        }

    }



}
