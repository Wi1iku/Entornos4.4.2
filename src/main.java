
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wiku
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclao= new Scanner(System.in);
        boolean check=true;
        while(check){
        System.out.println("Hola Mundo.");
            System.out.println("Escribe continuar o cualquier otra cosa para cerrar");
            String cont= teclao.nextLine();
            cont=cont.toLowerCase();
            if("continuar".equals(cont)){
            check=true;
            }else{
            System.exit(0);
                          
            }
        }
        
       
    }
    
}
