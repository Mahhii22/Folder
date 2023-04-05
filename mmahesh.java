import java.util.Random;

public class Randomnumbers {
public static void main(String[] args) { 
System.out.println("Enter the Nandom Num");
Random rand = new Random(); for (int i = 0; i < 10; i++) {
System.out.println(rand.nextInt());

}
}
}