import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        while (true) {
            System.out.println("Unesite cijeli broj i izracuna cemo fakotrijel broja: ");
            int rezultat = 0;
            boolean faktorijel = false;
            try{
                Scanner unosBroja = new Scanner(System.in);
                if(!unosBroja.hasNextInt()){
                    throw new InputMismatchException("Niste unijeli cijeli pozitvni broj.");
                }
                int broj = unosBroja.nextInt();
                for (int i = 0; i <= broj; i++) {
                   if (i == 0) {
                        rezultat = 1;
                    } else {
                        rezultat = rezultat * i;
                    }
                   faktorijel = true;
                }
                if (broj < 0){
                   throw new InputMismatchException("Niste unijeli cijeli pozitvni broj.");
                }
            } catch (InputMismatchException e){
                System.out.println("Niste unijeli cijeli broj. Greska: " + e.getMessage());
            } finally {
                if(faktorijel){
                    System.out.println("Faktorijel broja je: " + rezultat);
                }

            }

        }
    }
}
