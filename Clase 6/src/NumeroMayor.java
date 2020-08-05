import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NumeroMayor {
	 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int n = 0,mayor = -99999;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa un numero");
            n = Integer.parseInt(br.readLine());
            if(n > mayor){
                mayor = n;
            }
                }
        System.out.println("El numero mayor es :" + mayor);
      
    }
 
}