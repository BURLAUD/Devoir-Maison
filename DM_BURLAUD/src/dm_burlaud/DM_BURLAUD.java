/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm_burlaud;
import java.util.Scanner;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author Anthony
 */
public class DM_BURLAUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String NEWLINE = System.getProperty("line.separator");
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
        
        System.out.println("Veuilez entrer votre niveau de difficulter :"+NEWLINE+"1 = Facile (7 essaies/combinaisons)"+NEWLINE+"2 = Moyen (10 essaies/combinaisons)"+NEWLINE+"3 = Difficile (20 essaies/combinaisons)");
        int dif = sc.nextInt();
        
         Timer timer = new Timer("Printer");         //Crée un chrono
            MyTask t = new MyTask();                    //Permet de créer une nouvelle page dans laquel il y aura le code du chrono
        
   //==========================================================================================================================================================================================================================
        
    if (dif == 1)
    {// DEBUT DU NIVEAU FACILE
        
        System.out.println("L'alarme c'est déclencher");
        timer.schedule(t, 0, 2000);
        Scanner saisieFaci1 = new Scanner(System.in);
        int combi = 1;                                                                      //Determine les 3 combinaisons
        
    while (combi <= 3)
    { //DEBUT DES 3 ESSAIES
        
        int nbEssaie = 0;                                                                    //Determine le nombre d'essais
        int nbAleaFaci1 = random.nextInt(100);                                                   //ajoute à la fonction nbaleafaci1 une valeur aleatoire
        System.out.println(NEWLINE+"Saisir la combinaison n°" +combi+ " (de 1 a 100)");
        int valeurFaci1 = saisieFaci1.nextInt();                                                 //Saisi tu nombre aleatoire
        
        while (valeurFaci1 != nbAleaFaci1)                          //si la valeur entrer n'est pas egale au nombre aleatoire
        {                                                       
            nbEssaie ++;                                                                     
            if (valeurFaci1 < nbAleaFaci1)
            {                                                       //Si la valeur entre est plus petite, alors il demande "plus grand"
                System.out.println("Plus grand !");
            }
            
            if (valeurFaci1 > nbAleaFaci1)                          //Si la valeur entre est plus grande alors il demande "plus petit"
            {                                                       
                System.out.println("Plus petit !");
            }
            
            if (nbEssaie == 7)                                  // Si le nombre d'essais arrive Ã  7, il stop le code
            {                                                               
            System.out.println(NEWLINE+"ECHEC !!! Vous avez fais 7 tentatives, le coffre est bloquer !");
            System.exit(0);
            }
            
            valeurFaci1 = saisieFaci1.nextInt();                   // redemande de rentrer une valeur si il se trompe                                                              
       
        }
            
            if (valeurFaci1 == nbAleaFaci1)
            {                                                      // si la valeur entre est bonne alors il valide la combinaison
                System.out.println("Bravo ! vous avez trouver la combinaison " +combi+"/3 !");
            }
        combi ++;
    }//FIN DES 3 ESSAIES
        
        System.out.println(NEWLINE+"FELICITATION !!! Vous avez deverrouiller le coffre et partez sans etre arreter !");
        System.exit(0);
    }// FIN DU NIVEAU FACLIE
    
    //=========================================================================================================================================================================================================================
    
    if (dif == 2)
    {// DEBUT DU NIVEAU MOYEN
        
        System.out.println("L'alarme c'est déclecher");
        timer.schedule(t, 0, 2000);
        Scanner saisieMoyen = new Scanner(System.in);
        int combi = 1;
        
    while (combi <= 3)
    { //DEBUT DES 3 ESSAIES
        
        int nbEssaie = 0;
        int nbAleaMoyen = random.nextInt(500);
        System.out.println(NEWLINE+"Saisir la combinaison n°" +combi+ " (de 1 à 500)");
        int valeurMoyen = saisieMoyen.nextInt();
        
        while (valeurMoyen != nbAleaMoyen)
        {
            nbEssaie ++;
            if (valeurMoyen < nbAleaMoyen)
            {
                System.out.println("Plus grand !");
            }
            
            if (valeurMoyen > nbAleaMoyen)
            {
                System.out.println("Plus petit !");
            }
            
            if (nbEssaie == 10)
            {
            System.out.println(NEWLINE+"ECHEC !!! Vous avez fais 10 tentatives, le coffre est bloquer !");
            System.exit(0);
            }
            
            valeurMoyen = saisieMoyen.nextInt();              
       
        }
            
            if (valeurMoyen == nbAleaMoyen)
            {
                System.out.println("Bravo ! vous avez trouver la combinaison " +combi+"/3 !");
            }
        combi ++;
    }//FIN DES 3 ESSAIES
        
        System.out.println(NEWLINE+"FELICITATION !!! Vous avez deverrouiller le coffre et partez sans etre arreter !");
        System.exit(0);
    }// FIN DU NIVEAU MOYEN
    
    //=========================================================================================================================================================================================================================
    
    if (dif == 3)
    {// DEBUT DU NIVEAU DIFFICILE
       
        System.out.println("L'alarme c'est déclencher");
        timer.schedule(t, 0, 2000);
        Scanner saisieDiffici1e = new Scanner(System.in);
        int difficile = 1;
        
    while (difficile <= 3){ //DEBUT DES 3 ESSAIES
        
        int nbEssaie = 0;
        int nbAleaDiffici1e = random.nextInt(1000);
        System.out.println(NEWLINE+"Saisir la combinaison n°" +difficile+ " (de 1 à 1000)");
        int valeurDiffici1e = saisieDiffici1e.nextInt();
        
        while (valeurDiffici1e != nbAleaDiffici1e)
        {
            nbEssaie ++;
            if (valeurDiffici1e < nbAleaDiffici1e)
            {
                System.out.println("Plus grand !");
            }
            
            if (valeurDiffici1e > nbAleaDiffici1e)
            {
                System.out.println("Plus petit !");
            }
            
            if (nbEssaie == 20)
            {
            System.out.println(NEWLINE+"ECHEC !!! Vous avez fais 20 tentatives, le coffre est bloquer !");
            System.exit(0);
            }
            
            valeurDiffici1e = saisieDiffici1e.nextInt();              
       
        }
            
            if (valeurDiffici1e == nbAleaDiffici1e)
            {
                System.out.println("Bravo ! vous avez trouver la combinaison " +difficile+"/3 !");
            }
        difficile ++;
    }//FIN DES 3 ESSAIES
        
        System.out.println(NEWLINE+"FELICITATION !!! Vous avez deverrouiller le coffre et partez sans etre arreter !");
        System.exit(0);
    }// FIN DU NIVEAU DIFFICILE
        
    }
    
}

//=============================================================================================================================================================================================================================

class MyTask extends TimerTask{

    private int times = 60;    //Nombre de seconde

    @Override
    public void run() {
        times--;               //Enleve une seconde a chaque fois
        if (times != 0) {                                          // Si le temps est different de 0 alors ...
            System.out.println("                        " + times +" secondes avant que la police arrive");  //Affiche le temps sur le coté
        } else {
            System.out.println("La police est arrivée et vous arrête, vous avez perdu !");  
            this.cancel();                                  //... Arrete le chrono
            System.exit(0);                                 //Arrete le programme
        }

        
    }
    
}
