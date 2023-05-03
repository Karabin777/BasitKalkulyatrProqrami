import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1;
        int n2;
        int secim;
        int cavab;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Sayi daxil edin");
        n1=scanner.nextInt();

        System.out.println("Sayi daxil edin");
        n2=scanner.nextInt();

        System.out.println("Secim edin : ");
        System.out.println("1-Toplama \n2-Cixman\n3-Vurma\n4-Bolme");
        secim=scanner.nextInt();

        switch (secim){
            case 1:
                cavab=n1+n2;
                System.out.println("Cavab : " + cavab);
                break;
            case 2:
                cavab=n1-n2;
                System.out.println("Cavab : " + cavab);
                break;
            case 3 :
                cavab=n1*n2;
                System.out.println("Cavab : " + cavab);
                break;
            case 4:
                cavab=n1/n2;
                System.out.println("Cavab : " + cavab);
                break;



        }

            scanner.close();
        System.out.println("Yanlis sayi daxil etdiniz");

    }
}