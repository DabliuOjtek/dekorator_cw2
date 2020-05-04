import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean exit = false;
        boolean option = false;

        ArrayList<Integer> array = new ArrayList<>();
        AbstractPlainText phrase = new PlainText();

        System.out.print("Wprowadz text: ");
        phrase.text = scanner.nextLine();
        System.out.println("\n" + "Wybierz opcje otagowania: ");
        System.out.println("1: <p> " + "\n2: <strong>" + "\n3: <em>" + "\n4: <mark>"+ "\n5: Wyswietl zmiany\n");

        while (exit == false) {
            System.out.println("Wybor: ");
            while (!scanner.hasNextInt()){
                System.out.println("Nie ma takiej opcji, ponow swoj wybor!");
                scanner.next();
            }
            number = scanner.nextInt();

            for(int i=0; i<array.size(); i++){
                if(array.get(i) == number){
                    System.out.println("Ta opcja jest już wybrana");
                    option = true;
                    break;
                }else
                    option = false;
            }
            if(option == false) {
                array.add(number);

                switch (number) {
                    case 1: {
                        phrase = new DecoratorP(phrase);
                        break;
                    }
                    case 2: {
                        phrase = new DecoratorStrong(phrase);
                        break;
                    }
                    case 3: {
                        phrase = new DecoratorEm(phrase);
                        break;
                    }
                    case 4: {
                        phrase = new DecoratorMark(phrase);
                        break;
                    }
                    case 5: {
                        System.out.println("======================");
                        System.out.print("Twoj zmieniony tekst: ");
                        phrase.write();
                        System.out.println("\n======================");
                        exit = true;
                        break;
                    }
                    default: {
                        System.out.println("Nie ma takiej opcji, ponow swoj wybor!");
                        break;
                    }
                }
            }
        }
    }
}
