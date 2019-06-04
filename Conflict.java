iimport java.util.Random;
public class Ransu {
  public static void main(String args[]) {
    Random rand = new Random();
    for(int i=0; i<10; i++){

      int d  = rand.nextInt(100) +1 ;
    System.out.println(d);
    }
  }
}
