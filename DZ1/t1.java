package DZ1;

public class t1 {
    public static void main(String[] args){
    System.out.println(treug(10));
    }    
    public static int treug(int n) {
        int s = 0;
        for (int i = 0; i <= n; i++){
            s += i;
        }
        return s;
    }
}