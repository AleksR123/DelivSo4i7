import java.util.Scanner;

public class delivi {

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        System.out.println("Vnesi broj na clenovi vo nizata: ");
	        int n = input.nextInt();
	        int niza1[] = new int[n];

	        System.out.println("Vnesi gi clenovite na nizata:");
	        for (int i = 0; i < niza1.length; i++) {
	            System.out.print("niza1[" + i + "] --> ");
	            niza1[i] = input.nextInt();
	        }

	        System.out.println("Broevi delivi so 4:");
	        for (int i = 0; i < niza1.length; i++) {
	            if (niza1[i] % 4 == 0) {
	                System.out.println("niza1[" + i + "] = " + niza1[i]);
	            }
	        }

	        System.out.println("Broevi delivi so 4 i 7 se :" );
	        for (int i = 1; i <= n; i++) {
	            if (i % 4 == 0 && i % 7 == 0) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	}


