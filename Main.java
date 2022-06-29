import java.util.Scanner;
import static java.lang.Math.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Witaj w kalkulatorze paliwa na trasie, wybierz opcje:\r\n1.Koszt przyszlej trasy.\r\n2.Koszt odbytej trasy.");
    
    int a = scan.nextInt();

    switch (a){
      case 1:
      {
        System.out.println("Podaj długość trasy w kilometrach:");
        double d = scan.nextDouble();
        System.out.println("Podaj srednie spalanie paliwa[l/100km]:");
        double s = scan.nextDouble();
        System.out.println("Podaj cene 1litra paliwa [zl/l]:");
        double c = scan.nextDouble();
        double koszt = (d/100)*s*c;
        double spalone =(d/100)*s;
        
        System.out.println("Koszt przejechania :"+d+"km wynosi "+koszt+"zl");
        System.out.println("Spalisz "+spalone+"l paliwa");
        
      }break;
        
      case 2:
      {
          System.out.println("Podaj długość przejechanej trasy [km]:");
        double d1 = scan.nextDouble();
        System.out.println("Podaj ilosc spalonego paliwa [l]:");
        double ilosc = scan.nextDouble();
        System.out.println("Podaj cene 1 litra paliwa [zl/l]:");
        double cena = scan.nextDouble();
        double spalanie=(ilosc/d1);
        double cena1km=spalanie*cena;
        double koszt = cena1km*d1;
        
        System.out.println("Koszt przejechanej trasy wynosił :"+koszt+"zl");
        System.out.println("Koszt 1km trasy wynosił :"+cena1km+"zl");
        
        
      }break;
    }
  }
}
        