package DZ6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class t {
    public static void print(Object o){
        System.out.println(o);
    }
    //public static 
    public static void main(String[] args) {
        Notebook acer = new Notebook();
        Notebook samsung = new Notebook();
        Notebook asus = new Notebook();
        Notebook xiaomi = new Notebook();
        Notebook apple = new Notebook();
        {
            acer.RAM = 4;
            acer.HDD = 512;
            acer.OS = "Windows";
            acer.color = "black";
            acer.price = 30000;
            samsung.RAM = 8;
            samsung.HDD = 1024;
            samsung.OS = "Windows";
            samsung.color = "grey";
            samsung.price = 50000;
            xiaomi.RAM = 6;
            xiaomi.HDD = 1024;
            xiaomi.OS = "Linux";
            xiaomi.color = "white";
            xiaomi.price = 35000;
            asus.RAM = 16;
            asus.HDD = 2048;
            asus.OS = "Linux";
            asus.color = "black";
            asus.price = 45000;
            apple.RAM = 8;
            apple.HDD = 1024;
            apple.OS = "Mac";
            apple.color = "white";
            apple.price = 60000;
        }
        HashSet nbs = new HashSet<Notebook>(Arrays.asList(acer, samsung, asus, xiaomi, apple));
        HashMap characteristics = new HashMap<Integer, String>();
        {
            characteristics.put(1, "RAM");
            characteristics.put(2, "HDD");
            characteristics.put(3, "OS");
            characteristics.put(4, "color");
            characteristics.put(5, "price");
        }
        for (int i = 1; i<6; i++){
            System.out.printf("%d - %s \n", i, characteristics.get(i).toString());
        }
        int par = 0;
        String parm = "";
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
                print("Выберите операционную систему (Windows/Linux/Mac): ");
                parm = in.next();
                break;
            case (4):
                print("Выберите цвет (black/grey/white): ");
                parm = in.next();
                break;
            case (5):
                print("Введите минимальную цену: ");
                par = in.nextInt();
                break;
        }
        for (Object j:nbs){
            String ch = characteristics.get(choice).toString();
            print(j.getClass());
        }
    }
}
