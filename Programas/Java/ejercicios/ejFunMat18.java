package ejercicios;

public class ejFunMat18 {
    public static void main(String[] args) {
        int [] vector0 = {1,2,3,4,5,6,7,8};
        int vector1[] = new int[19];
        copiarVector(vector0, vector1);
        System.out.println("|");
        for (int i = 0; i < vector0.length; i++) {
            System.out.print(vector0[i] + "|");
        }
        System.out.print("\n |");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i] + "|");
        }
    }

    private static void copiarVector(int vector0[], int vector1[]){
        for (int i = 0; i < vector0.length && i < vector1.length; i++) {
            vector1[i] = vector0[i];
        }
        if (vector1.length > vector0.length){
            for (int i = vector0.length; i < vector1.length; i++) {
                vector1[i] = 0;
            }
        }

    }
}
