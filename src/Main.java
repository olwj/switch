import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        char znak = '-';
        int a=23, b=43, wynik=0;
        System.out.println("Zmienna: " + (int) znak);

        Scanner wejscie = new Scanner (System.in);
        System.out.println("Podaj znak: ");
        znak = wejscie.next().charAt(0);

        switch (znak)
        {
            case '+':
                System.out.println("Wykonuje operacje dodawania ");
                wynik=a+b;
                break;
            case '-':
                System.out.println("Wykonuje odejmowanie");
                wynik=a-b;
                break;
        }
        switch (znak)
        {
            case '*':
                System.out.println("Wykonuje operacje mnozenia");
                wynik=a*b;
                break;
            case '/':
                if(b == 0)
                {
                    System.out.println("Nie mozna dzielic przez zero");
                }else{
                    wynik = a / b;
                }
                System.out.println("Wykonuje operacje dzielenia");
                wynik=a/b;
                break;


        }
        System.out.println("Wynik: " + wynik);
    }
}






