package ejercicios;

public class ejFun15 {
    public static void main(String[] args) {
        System.out.println(sp(5));
    }   
    private static int sp(int n){
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += Math.pow(i, i);
        }
        return res;
    }
}
