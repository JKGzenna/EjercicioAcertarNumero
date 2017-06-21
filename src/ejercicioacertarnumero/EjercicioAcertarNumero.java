package ejercicioacertarnumero;

// dando a source y a fix imports nos soluciona los imports que tenemos dandonos problemas

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author JUAN
 */
public class EjercicioAcertarNumero {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Random r = new Random();
        int numero = r.nextInt(100);
        //System.out.println(numero);
        
        String respuesta="";
        int n;
        do {
            System.out.println("Escribe un número: ");
            n = Integer.parseInt(br.readLine());
        
            if( n == numero )
                System.out.println("Acierto");
            else
            {
                if( n > numero )
                    System.out.println("Es menor");
                else
                    System.out.println("Es mayor");
        
                System.out.println("¿Quieres continuar? (s|n): ");
                    
                respuesta = br.readLine();
            }
            } while( respuesta.equals("s") && n !=numero );
    }  
}
