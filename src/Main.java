import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer nbMin = null;
        Integer nbMax = null;
        int randomNb = 0;
        boolean itOk = false;


        while(itOk == false){
            try{
                System.out.println("Rentrer un nombre entier min");
                nbMin = scanner.nextInt();

                System.out.println("Rentrer un nombre entier max");
                nbMax = scanner.nextInt();

                System.out.println("Rentrer le nombre d'élements aléatoire a tester");
                randomNb = scanner.nextInt();

            }catch(InputMismatchException ime){
                System.out.println("Vous avez rentrer un nombre incorrect");
            }finally {
                scanner.close();
                itOk = true;
            }
        }
        Calcul nb = new Calcul(nbMin,nbMax,randomNb);

        nb.operation();
    }
}
