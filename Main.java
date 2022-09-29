import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    
    //Ejercicio numero 1
    System.out.println("\nEjercicios tema 4");
    System.out.println("\n Ejercicio numero 1: ingrese un numero para saber si es negativo o positivo.\n");
    Scanner n = new Scanner(System.in);
    System.out.println(" Ingrese un numero :  ");
    int numeroif =n.nextInt();

    if (numeroif > 0)
    {
      System.out.println("\n el "+numeroif+" es positivo");
    }
    else if(numeroif < 0)
    {
      System.out.println("\n el "+numeroif+" es negaivo");
    }
    else
    {
      System.out.println("\n ingresate "+numeroif+" no es positivo ni negativo ");
    }

    
    
    //Ejercicio numero 2
    System.out.println("\n Ejercicio numero  2 while: n es menor a 3 \n");
    
    int numerowhile = 0 ;
    while (numerowhile < 3)
      {
        System.out.println(numerowhile);
        numerowhile = numerowhile + 1 ;
        
      }

  
  
    //Ejercicio numero 3
    System.out.println("\n Ejercicio numero 3 do while : numero es menor a 3 \n");
    int numerodowhile = 0;
    do
    {
      
      System.out.println( numerodowhile );
      numerodowhile=numerodowhile + 1;
    
    }while( numerodowhile < 3);


    //Ejercicio numero 4
    System.out.println("\n Ejercicio numero for 4 : numero es <= a 3\n");
    for(int numerofor = 0; numerofor <=3;numerofor = numerofor + 1)
        {
         System.out.println( numerofor );
        
        }

    
    //Ejercicio numero 5 Switch
    System.out.print("\n Ejercicio numero 5 Switch : en q estacioon estas.\n");
    Scanner estacio = new Scanner(System.in);
    System.out.println("\ningrese un numero de 1 al 4 :");
    int estacion =estacio.nextInt();
    
    switch(estacion)
    {
      case 1:
        System.out.println("\n estasen verano ");
        break;
      case 2:
        System.out.println("\n estas en invierno ");
        break;
      case 3:
        System.out.println("\n estas en primavera ");
        break;
      case 4:
        System.out.println("\n estas en otoño ");
        break;
      default:
        System.out.println("\n No es una estacion  ");
        break;
    }

    
    
    
   

  }
}    

      
    
    


