import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            if((i%sumaCifara(i))==0) System.out.println(i);
        }

    }

    //funkcija koja racuna sumu cifara
    private static int sumaCifara(int n) {
        int sum = 0;
        while(n!=0){
            sum = sum + n%10;
            n = n/10;
        }
        return sum;
    }
}