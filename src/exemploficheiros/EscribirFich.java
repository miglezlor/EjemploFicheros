package exemploficheiros;

import java.io.*;

/**
 *
 * @author mgonzalezlorenzo
 */
public class EscribirFich {
    
    public void escribir(String nomeFich){
        File f = new File(nomeFich);
        PrintWriter escribir=null;
        try {
            //abrimos ficheiro para escribir
            escribir = new PrintWriter(f);
            for(int i=0;i<4;i++){
                
                escribir.println(i);
            }
        } 
        catch (FileNotFoundException ex) {
            System.out.println("Erro escritura "+ex.getMessage());
        }
        finally{
            escribir.close();
        }
    }
}
