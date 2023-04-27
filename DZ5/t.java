package DZ5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class t {
    public static void main(String[] args){
        HashMap<Integer, String> phoneBook = new HashMap<>();
        {
            phoneBook.put(123, "Иван Петин");
            phoneBook.put(215, "Андрей Савин");
            phoneBook.put(422, "Елена Белова");
            phoneBook.put(983, "Александр Мечников");
        }
        Scanner in = new Scanner(System.in);
        int choice = 0;
        System.out.println(phoneBook);
        while (choice != 5){
        System.out.println();
        System.out.println("Выберите действие:\n1 - Добавить номер \n2 - Поиск имени владельца телефона по номеру \n3 - Удалить номер \n4 - Вывести книгу \n5 - Выйти");
        choice = in.nextInt();
        int num = 0;
        String nam = "";
        String surn = "";
        String namE = "";
        switch (choice){
            case (1):
                System.out.println("Введите номер телефона: ");
                num = in.nextInt();
                System.out.println("Введите имя: ");
                nam = in.next();
                System.out.println("Введите фамилию: ");
                surn = in.next();
                namE = nam + " " + surn;
                add(num, namE, phoneBook);
                break;
            case (2):
                System.out.println("Введите номер телефона: ");
                num = in.nextInt();
                System.out.println(numSearch(num, phoneBook));
                break;
            case (3):
                System.out.println("Введите номер телефона: ");
                num = in.nextInt();
                delete(num, phoneBook);
                break;
            case (4):
                for (int i: phoneBook.keySet()){
                    System.out.print(phoneBook.get(i));
                    System.out.print(" - ");
                    System.out.println(i);
                }
        }
    }

    }
    public static void add(int num, String name, HashMap<Integer, String> pb) {
        pb.put(num, name);
    }
    public static String numSearch(int num, HashMap<Integer, String> pb){
        return pb.get(num);
    }
    public static void delete(int num, HashMap<Integer, String> pb) {
        pb.remove(num);
    }
}
