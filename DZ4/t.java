package DZ4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class t {
    public static void main(String[] args){
        Random rnd = new Random();
        LinkedList<Integer> arr = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(0, 100));
    }
    System.out.println(arr);
    System.out.println(Reverse(arr));
    enqueue(arr,30);
    System.out.println(dequeue(arr));
    System.out.println(arr);
    System.out.println(first(arr));
    System.out.println(Summ(arr));

    }
    public static LinkedList<Integer> Reverse(LinkedList<Integer> array){
        LinkedList<Integer> res = new LinkedList<Integer>();
        for (int i = array.size() - 1; i >= 0; i--){
            res.add(array.get(i));
        }
        return res;
    }
    public static void enqueue(LinkedList<Integer> array, Integer el){
        array.add(el);
    }
    public static Integer dequeue(LinkedList<Integer> array){
        int res = array.get(0);
        array.remove(0);
        return res;
    }
    public static int first(LinkedList<Integer> array){
        return array.get(0);
    }
    public static int Summ(LinkedList<Integer> array){
        int s = 0;
        for (int i : array){
            s += i;
        }
        return s;
    }
}