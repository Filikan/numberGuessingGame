import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int a,cevap;
		Random rnd = new Random();
		a= rnd.nextInt(100);
	    System.out.println("Guess the number between 0-100.");
	    //System.out.println("Sayi:"+a);
	    int count=1;

		Scanner sc = new Scanner(System.in);

	    do {
			System.out.println("Guess "+count+":");
			cevap = sc.nextInt();

	    	if(cevap<a){
	    		System.out.println("Go up.");
	    		count++;
			}
	    	else if (cevap>a){
	    		System.out.println("Go Down.");
	    		count++;
			}
		}while(cevap!=a);
	    System.out.println("Congrats,you found the number!");


    }
}
