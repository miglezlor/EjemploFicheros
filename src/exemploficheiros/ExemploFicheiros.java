package exemploficheiros;

import java.io.File;

/**
 *
 * @author mgonzalezlorenzo
 */
public class ExemploFicheiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LerFicheiro obxler = new LerFicheiro();
        //obx.lerFich("nomes.txt");
        obxler.lerFich("/datos/local/mgonzalezlorenzo/NetBeansProjects/PROGRAMACION/ExemploFicheiros/nomes.txt");
        //obxler.lerFich("/datos/local/mgonzalezlorenzo/Desktop/letras.txt");
        String sep = File.separator;
        //obxler.lerFich(sep+"datos"+sep+"local"+sep+"mgonzalezlorenzo"+sep+"Desktop"+sep+"letras.txt");
        //obxler.lerDatoFich("/datos/local/mgonzalezlorenzo/Desktop/letras.txt");
        //obxler.lerDatoFich("nomes.txt");
        //obxler.lerNumeros("/datos/local/mgonzalezlorenzo/NetBeansProjects/PROGRAMACION/ExemploFicheiros/numeros.txt");
        obxler.lerRexistros("/datos/local/mgonzalezlorenzo/NetBeansProjects/PROGRAMACION/ExemploFicheiros/alumnos.txt");
        obxler.visualizar();
    }
    
}
