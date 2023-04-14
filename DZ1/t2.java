package DZ1;

public class t2 {
    public static void main(String[] args){
    System.out.println(factor(5));
    }    
    public static int factor(int n) {
        int s = 1;
        for (int i = 1; i <= n; i++){
            s *= i;
        }
        return s;
    }
}