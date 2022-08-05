import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer nbMin = null;
        Integer nbMax = null;
        int randomNb = 0;
        boolean itOk = false;

        try{
            while(itOk == false){// tant que itOk n'est pas true on execute la boucle
                try{
                    System.out.println("Rentrer un nombre entier min");// l'utilisateur rentre la valeur min, soit -1000 dans l'énoncer
                    nbMin = scanner.nextInt();

                    System.out.println("Rentrer un nombre entier max");// l'utilisateur rentre la valeur max, soit 1000 dans l'énoncer
                    nbMax = scanner.nextInt();

                    System.out.println("Rentrer le nombre d'élements aléatoire a tester");//il rentre le nombre de donnée aléatoire à piocher entre -1000 et 1000
                    randomNb = scanner.nextInt();

                }catch(InputMismatchException ime){// si il rentre autre chose que des chiffres, sa crée une erreur et le renvoie dans la boucle
                    System.out.println("Vous avez rentrer un nombre incorrect");
                    scanner.nextLine();
                }
                if (nbMin > nbMax){// si la valeur min est plus grande on affiche un message et lui demande de reécrire les données
                    System.out.println("La valeur min est supérieur a la max, veuillez réessayer");
                    nbMin = null;
                }
                if (nbMin != null && nbMax!= null && randomNb != 0){// si tout est bon , on passe itOk à true et on sort de la boucle
                    itOk = true;
                }
            }
        }finally {
            scanner.close();//on ferme notre scanner
        }

        Calcul nb = new Calcul(nbMin,nbMax,randomNb);//on crée notre objet

        nb.operation();//on appelle notre méthode
    }
}
