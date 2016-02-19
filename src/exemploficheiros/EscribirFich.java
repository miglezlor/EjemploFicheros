package exemploficheiros;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mgonzalezlorenzo
 */
public class EscribirFich {
    ArrayList <Alumno> lista = new ArrayList();
    
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
    
    public void lerEscNotPares(String nomeFichAlum, String nomeFich) {
        Scanner sc = null;
        PrintWriter escribir = null;
        try {
            File f = new File (nomeFich);
            File x = new File (nomeFichAlum);
            sc = new Scanner(x);
            escribir = new PrintWriter(f);
            while(sc.hasNextLine()){
                String res = sc.nextLine();
                String[]datos = res.split(",");
                if (Integer.parseInt(datos[2])%2==0){
                    escribir.println(datos[0]+","+datos[1]+","+Integer.parseInt(datos[2]));
                }
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Erro no ficheiro1 " + ex.toString());
        }
        finally{
            sc.close();
            escribir.close();
        }
        
    }
}
