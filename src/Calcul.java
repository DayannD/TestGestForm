import java.util.ArrayList;
import java.util.Random;

public class Calcul {
    private ArrayList nbRamdon = new ArrayList<>();

    public Calcul(Integer nbMin,Integer nbMax,int randomNb){
        Random r = new Random();
        for (int i = 0; i < randomNb; i++){
            nbRamdon.add(r.nextInt(nbMax-nbMin) + nbMin);
        }
    }

    public void operation(){
        for (int i = 0; i < nbRamdon.size(); i++){
            int value = (int) nbRamdon.get(i);
            if ((value % 3) == 0 && (value % 5) == 0){
                System.out.println(Affiche.GESTFORM);
                continue;
            }
            if((value % 3) == 0){
                System.out.println(Affiche.GESTE);
            } else if ((value % 5 == 0)) {
                System.out.println(Affiche.FORM);
            }else {
                System.out.println(value);
            }
        }
    }
}
