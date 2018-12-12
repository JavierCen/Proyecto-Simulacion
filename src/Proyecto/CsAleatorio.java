
package Proyecto;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class CsAleatorio {
static double numero;
static double numero2;
    
    public ArrayList aleatorio(int iteraciones){
        
        
        ArrayList<Fila>lista;
        
        int a,b,c,aux;  
        
        a=3; 
        b=7; 
        c=54; 
        int array[]= new int[iteraciones]; 
        int i=0; 
        
        lista= new ArrayList<Fila>();
        
        for(int x=0; x<array.length; x++){
            
            Fila fila = new Fila();    
            
            numero = (double) (Math.random() *1.0) + .0; 
            System.out.println(" Aleatorio (R1):"+numero);
            numero2 = (double) (Math.random() *1.0) + .0; 
            System.out.println(" Aleatorio (R2):"+numero2);
            
            if(numero<(b-a)/(c-a)){
                double datos=a+(b-a)*Math.sqrt(numero2);
                fila.setAleatorio(datos);
            }else{
                double datos2=c-(c-b)*Math.sqrt(1-numero2);
                fila.setAleatorio(datos2);
            }

            fila.setI(i);
            i++;
            
            lista.add(fila);
        }
        
        return lista;
    }
    
}
