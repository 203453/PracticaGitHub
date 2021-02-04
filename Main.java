import java.util.Scanner;
public class Main{
    static Scanner insertar = new Scanner(System.in);
    public static void main(String[] args) {
      int d1, d2, opc=2, suma=0, puntaje=0;
      do{
      opc = 2;
      d1 = 0;
      d2 = 0;
      d1 = evaluard1(d1);
      d2 = evaluard2(d2);
      Dados dados = new Dados(d1, d2);
      Juego juego = new Juego(0, 0, dados);
      suma = juego.getSumar();
      puntaje = puntaje + suma;
      juego = new Juego(puntaje, suma, dados);
      System.out.println("La suma de ambos dados es: " + juego.getSumar());
      if(juego.getSumar() == 7 || juego.getSumar() == 11){
          System.out.println("Felicidades, has ganado!, puedes tomar el premio mayor.");
      }
      if((juego.getSumar() == 2) || (juego.getSumar() == 3) || (juego.getSumar() >= 12)){
          System.out.println("Oops, has perdido :(.");
      }
      if((juego.getSumar() > 3) && (juego.getSumar() < 7) || (juego.getSumar() == 8) || (juego.getSumar() == 9) || (juego.getSumar() == 10)){
        System.out.println("Usted tiene " + juego.getPuntaje() + " puntos, desea seguir jugando? 1. Si 2.No");
        opc = insertar.nextInt();
        if (opc==2){
          opc=2;
        }
        else{
          opc=0;
        }
      }
      System.out.println("Total acumulado: " + juego.getPuntaje());
      }while (opc!=2);
    }

    public static int evaluard1(int d1){
      do{
      System.out.println("Inserte el numero del primer dado: ");
      d1 = insertar.nextInt();
      if(d1 < 1 || d1 > 6){
        System.out.println("Inserte un dato del 1 al 6...");
      }
      }while(d1 < 1 || d1 > 6);
      return d1;
    }

    public static int evaluard2(int d2){
      do{
      System.out.println("Inserte el numero del segundo dado: ");
      d2 = insertar.nextInt();
      if(d2 < 1 || d2 > 6){
        System.out.println("Inserte un dato del 1 al 6...");
      }
      }while(d2 < 1 || d2 > 6);
      return d2;
    }

}