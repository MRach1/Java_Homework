package DZ1;

public class t3 {
    public static void main(String[] args){
        for (int j = 1; j < 1001; j++){
            if (prost(j)){
                System.out.println(j);
            }
        }
    }
    public static boolean prost(int n){
        boolean F = true;
        for (int i = 2; i < (Math.sqrt(n)) - (Math.sqrt(n))%1 + 1; i++){
            if (n % i == 0){
                F = false;
            }
        }
        return F;
    }
}
