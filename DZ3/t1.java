package DZ3;

import java.util.ArrayList;
import java.util.Random;

public class t1 {
    public static void main(String[] args){
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(0, 100));
        }
        System.out.println(arr);
        System.out.printf("Минимум: %d \n Максимум: %d \n Среднее: %s \n", Min(arr), Max(arr), Average(arr));
        System.out.println(Nechet(arr));
    }
        public static ArrayList<Integer> Nechet(ArrayList<Integer> a){
            ArrayList<Integer> res = new ArrayList<>();
            for (int i : a){
                if (i % 2 != 0){
                    res.add(i);
                }
            }
            return res;
        }
        public static int Min(ArrayList<Integer> a){
            int min = a.get(0);
            for (int i : a){
                if (i < min){
                    min = i;
                }
            }
            return min;
        }
        public static int Max(ArrayList<Integer> a){
            int max = a.get(0);
            for (int i : a){
                if (i > max){
                    max = i;
                }
            }
            return max;
        }
        public static double Average(ArrayList<Integer> a){
            double sum = 0;
            for (int i : a){
                sum += i;
            }
            return (sum / a.size());
        }
    }

