/**
 * Trivia Game, a minigame for Datos Party, first project of CE1103, IS-2020
 */
package triviagame;

import javax.swing.JOptionPane;

/**
 * Main and only class, creates and manages the dialog panes used for perform the quiz.
 * @author Hansel Hampton
 * @version 1.4
 */
public class Game {

    /**
     *Main method, it handles the main menu and most of its options.
     * @param args
     */
    public static void main (String args []){
        int opc, acert;
        String quest[]= new String[30];
        int corr[]= new int[30];
        quest[0]="En la saga Matched de Ally Condie, ¿cómo se llama la protagonista?\n1. Mare Barrow\n2. Cassia Reyes\n3. Sarah Hart";
        quest[1]="¿Còmo se titula la saga màs popular escrita por James Dashner?\n1. Maze Runner\n2. El Juego Infinito\n3. Endgame";
        quest[2]="¿Cuál es el nombre del segundo libro de la saga Shatter Me de Tehereh Mafi?\n1. Restore Me\n2. Destroy Me\n3. Unravel Me";
        quest[3]="El pseudónimo usado por los autores de Legados de Lorien es:\n1. Pittacus lore\n2. James Frey\n3. Greg Boose";
        quest[4]="¿Cuántos libros posee el mundo de Cazadores de Sombras, incluyendo Todos los libros de sagas publicados hasta la fecha?\n1. 9\n2. 11\n3. 16";
        quest[5]="Si ordenamos la saga Las Crónicas de Narnia por la cronología de la historia, ¿cuál sería el primer libro?\n1. El León, la Bruja y el Ropero\n2. El Sobrino del Mago\n3. El Caballo y el Muchacho";
        quest[6]="¿Cuántos libros complementarios tiene la saga La Selección, de Kiera Cass?\n1. 2\n2. 3\n3. 4";
        quest[7]="¿Cuántos libros complementarios tiene la saga Crepúsculo, de Stephanie Meyer?\n1. 2\n2. 3\n3. 4";
        quest[8]="La protagonista de Trono de Cristal, de Sarah J. Maas, recibe el nombre de:\n1. Celaena Sardothien\n2. Cyra Noavek\n3. Adelina Amouteru";
        quest[9]="¿Cuál de éstos libros no es de ciencia ficción?\n1. Si no Despierto\n2. El Piso Mil\n3. Y no Quedó Ninguno";
        quest[10]="¿En qué lugar ha sido ambientada la historia narrada en Delirium, de Lauren Oliver?\n1. Portland\n2. Detroit\n3. Chicago";
        quest[11]="Lena Haloway es el nombre de la protagonista de un libro. ¿Cuál?\n1. Delirium\n2. La Quinta Ola\n3. Legend";
        quest[12]="Verónica Roth, la autora de Divergente, tiene una bilogía en proceso. ¿Cómo se llama?\n1. Las Pruebas de Apolo\n2. Las Marcas de la Muerte\n3. El piso Mil";
        quest[13]="¿Cuál es la autora de La Reina Roja?\n1. Juliana Bagott\n2. Victoria Aveyard\n3. Marie Lu";
        quest[14]="De los siguientes libros, ¿cuál fue escrito por Lois Lowry?\n1. El Dador\n2. Los Jóvenes de la Élite\n3. Una Corte de Rosas y Espinas";
        quest[15]="De los siguientes libros, ¿cuál no fue escrito por Rick Riordan?\n1. Las Crónicas de Kane\n2. Magnus Chase y los Dioses de Asgard\n3. La Quinta Ola";
        quest[16]="Una de las siguientes sagas de libros no ha sido publicada en su totalidad. ¿Cuál?\n1. Legend\n2. Shatter Me\n3. Endgame";
        quest[17]="Legados de Lorien, de Pittacus Lore, ¿cuántos libros tiene?\n1. 3\n2. 5\n3. 7";
        quest[18]="El primer libro de Legados de Lorien, Soy el Número Cuatro, se ambienta en Estados Unidos. ¿Cuál estado?\n1. Ohio\n2. Michigan\n3. Virginia";
        quest[19]="¿Cuál de los siguientes libros de ciencia-ficción no es distópico?\n1. Endgame\n2. Delirium\n3. Legend";
        quest[20]="¿El Single Somebody, de The Chainsmokers, fue publicado en el año:\n1. 2017\n2. 2015\n3. 2018";//3
        quest[21]="La canción Church, de Fall Out Boy, ¿a qué album pertenece?\n1. Folie a Deux\n2. MANIA\n3. American Beauty";//2
        quest[22]="Complete el siguiente extracto de la canción Stargazing de Kygo:\nI will still be here, stargazing,\nI still look up, look up, look up for______.\n1. Love\n2. hope\n3. Goals";
        quest[23]="¿Cuál de las siguientes canciones de Sia ha sido usada en una película?\n1. Unstoppable\n2. Alive\n3. Move your Body";
        quest[24]="De las siguientes canciones de Zedd, ¿en cuál colaboró Selena Gomez?\n1. Addicted to a Memory\n2. Stay\n3. I Want You to Know";
        quest[25]="¿Qué canción de Kygo fue modificada para ser tema oficial del Ultra Music Festival 2015?\n1. Sunrise\n2. Here for You\n3. Firestone";
        quest[26]="De las siguientes canciones, ¿Cuál fue lanzada como single en el 2015?\n1. Firestone\n2. Summer\n3. Rockabye";
        quest[27]="¿Cuál de las siguientes canciones de Hardwell pertenece al álbum United we Are?\n1. Hollywood\n2. Arcadia\n3. Spaceman";
        quest[28]="¿Qué álbum fue el último publicado por Avicii, antes de su muerte?\n1.Stories\n2. True\n3. Avici EP";
        quest[29]="Complete el siguiente extracto de la canción Solo, de Clean Bandit:\nI want to fuck, fuck, fuck\nbut I'm broken hearted,\ncry, cry, cry, but I like to party;\ntouch, touch, touch, but I got nobody,\n_______________________________.\n1. I'm coming for\n2. here on my own\n3. can't turn me on";
        corr[0]=2;
        corr[1]=1;
        corr[2]=3;
        corr[3]=1;
        corr[4]=3;
        corr[5]=2;
        corr[6]=3;
        corr[7]=1;
        corr[8]=1;
        corr[9]=3;
        corr[10]=1;
        corr[11]=1;
        corr[12]=2;
        corr[13]=2;
        corr[14]=1;
        corr[15]=3;
        corr[16]=2;
        corr[17]=3;
        corr[18]=1;
        corr[19]=1;
        corr[20]=3;
        corr[21]=2;
        corr[22]=1;
        corr[23]=2;
        corr[24]=3;
        corr[25]=2;
        corr[26]=1;
        corr[27]=2;
        corr[28]=3;
        corr[29]=2;

        do {
            opc=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a la Trivia!\nEl tema actual es: Literatura moderna de Ciencia Ficcion y música.\n1. Instrucciones\n2. Jugar\n3. Ayuda\n4. Salir"));
            switch (opc){
                case 1:
                    JOptionPane.showMessageDialog(null, ">>La presente trivia consta de 30 preguntas, de las cuales se le mostrara al jugador 10, totalmente aleatorias.\n>>Usted debe respoder con la opcion que crea correcta.\n>>Cada pregunta le indica si su respuesta es correcta.\n>>Al terminar, se le mostrara un puntaje, que depende de la respuestas acertadas.\n>>Las preguntas se pueden repetir a lo largo de la misma ronda.");
                break;
                case 2:
                    acert= triv (quest, corr);
                    if (acert>7){
                        JOptionPane.showMessageDialog(null, "Felicidades! Usted ha acertado "+acert+" y falló "+(10-acert)+" de 10 totales. Usted es humano? :v");}
                    else{
                        if (acert<4){
                            JOptionPane.showMessageDialog(null, "Usted ha acertado "+acert+" de 10 totales. Me pregunto para que carajos hizo esta trivia >:|");}
                        else{
                            JOptionPane.showMessageDialog(null, "Usted ha acertado "+acert+" de 10 totales. Yo le diria que leyera un poco mas a menudo. :/");}}
                break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Para soporte tecnico, envie sus consultas al 8568-0466 o a hanselsol06.hh@gmail.com.\n                                                                   Gracias.");
                break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por jugar!");
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no disponible.");
                break;
            }
        }
        while (opc!=4);
        System.exit(0);
    }

    /**
     *Manage the quiz process, the answers, questions and points.
     * @param quest List of questions
     * @param corr List of correct answers
     * @return acert Integer of acerted points.
     */
    public static int triv(String quest[], int corr[]){
        int acert=0, aleat;
        int resp[]= new int[10];
        int used[]= new int[30];
        for (int j=0; j<used.length; j++){
            used[j]=0;
        }
        JOptionPane.showMessageDialog(null, "A lo que vinimos!");
        for (int i=0;i<10;i++){
            aleat=(int)(Math.random()*30);
            if (used[aleat]==0){
                used[aleat]+=1;
                do{
                    resp[i]=Integer.parseInt(JOptionPane.showInputDialog(quest[aleat]));
                    if (resp[i]==corr[aleat]){
                        JOptionPane.showMessageDialog(null, "El mae anda volando!");
                        acert+=1;
                    }
                    else{
                        if (resp[i]!=1&resp[i]!=2&resp[i]!=3){
                            JOptionPane.showMessageDialog(null, "Nu mames, esa no es una opcion :v");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Sias mamon XDXD");
                        }
                    }
                }
                while (resp[i]!=1&resp[i]!=2&resp[i]!=3);
            }
        }
        return acert;
    }
}
