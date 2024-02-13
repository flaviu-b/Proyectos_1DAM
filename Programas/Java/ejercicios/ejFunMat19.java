package ejercicios;

public class ejFunMat19 {
    public static void main(String[] args) {
        int [] vector0 = {1,2,3,4,5,6,7,8};
        int [] vector1 = {1,2,3,4,5,6,7,8};
        System.out.println(igualVectores(vector0, vector1));


    }
    
    private static boolean igualVectores(int vector0[], int vector1[]){
        boolean sonIguales;
        sonIguales = (vector0.length == vector1.length);
        if (sonIguales == true) {
            for (int i = 0; i < vector0.length; i++) {
                if (vector0[i] != vector1[i]) return false;
            }
        }
        return sonIguales;
    }
}
