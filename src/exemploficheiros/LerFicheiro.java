package exemploficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author mgonzalezlorenzo
 */
public class LerFicheiro {
    ArrayList <Alumno> lista = new ArrayList();
    
    public void lerFich(String nomeFich) {
        Scanner sc = null;
        try {
            File    f = new File (nomeFich);
            sc = new Scanner(f);
            while(sc.hasNextLine()){
                String res = sc.nextLine();
                System.out.println(res);
            }
            
        }
        catch (FileNotFoundException ex) {
            System.out.println("Erro no ficheiro1 " + ex.toString());
        }
        finally{
            sc.close();
        }
    }
    public void lerDatoFich(String nomeFich){
        Scanner ler = null;
        try {
            ler = new Scanner(new File(nomeFich)).useDelimiter("\\s*,\\s*");
            while(ler.hasNext()){
                System.out.println("* * "+ler.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro 2 "+ex.getMessage());
            
        }
        finally{
            if (ler != null)
                ler.close();
        }
    }
    public void lerNumeros(String nomeFich){
        Scanner num = null;
        try {
            num = new Scanner(new File(nomeFich));
            while(num.hasNextInt()){
                System.out.println("**"+num.nextInt());
            }
        } 
        catch (FileNotFoundException ex) {
            System.out.println("Erro numeros "+ex.getMessage());            
        }
        finally{
            if (num != null)
                num.close();
        }
    }
    
    public ArrayList<Alumno> lerRexistros(String nomeFich) {
        Scanner sc = null;
        
        try {
            File f = new File (nomeFich);
            sc = new Scanner(f);
            while(sc.hasNextLine()){
                String res = sc.nextLine();
                String[]datos = res.split(",");
                lista.add(new Alumno(datos[0], datos[1], Integer.parseInt(datos[2])));
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Erro no ficheiro1 " + ex.toString());
        }
        finally{
            sc.close();
        }
        return lista;
    }
    
    
    
    public void visualizar(){
        System.out.println(lista);
    }
}
