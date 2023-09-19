package operaciones;
import java.util.Scanner;
public class monserrat
{
    public static void main(String[] args)
    {
    Scanner leer =new Scanner(System.in);
    int[]arreglo=new int[5];
    int cont;
    for(cont=0; cont<=4; cont++)
    {
        System.out.print("Ingresa un numero: ");
        arreglo[cont]=leer.nextInt();
    }
    for(cont=0; cont<=5; cont++)
    {
    System.out.print("Los numerosson: "+arreglo[cont]);    
    }
    
    }
    
}
