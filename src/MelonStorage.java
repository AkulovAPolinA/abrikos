import java.util.Scanner;

public class MelonStorage{

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        //int melonAmount=melonStart.getMelonAmount();
        int melonAmount=300;
        MelonStartCount startMelonCount = new MelonStartCount(melonAmount);

        startMelonCount.getMelonStartAmount();



        while(true){

            int choice = MelonStorage.MainMenu();

            if(choice==1){

                System.out.println("\n\t______________________________  ");
                System.out.println("\n\tКакое количество дынь вывести?");
                int amountToTake= input.nextInt();//надо по заданию
                int newMelonAmount=MelonStorage.reduceMelonAmount(amountToTake,melonAmount);//надо по заданию
                MelonCount melonCount = new MelonCount(newMelonAmount);
                melonAmount=melonCount.getMelonAmount();
            }

            else if (choice==2){
                System.out.println("\n\t______________________________  ");
                System.out.println("\n\tКакое количество дынь привести?");
                int amountToBring = input.nextInt();//надо по заданию
                int newMelonAmount = MelonStorage.bringMelonAmount(amountToBring,melonAmount);//надо по заданию
                BringMelon melonCount = new BringMelon(newMelonAmount);
                melonAmount=melonCount.getMelonAmount();
            }

            else if (choice==3){
                System.out.println("На данный момент на складе "+melonAmount+" дынь");
            }
            else{
                System.out.println("\n\t______________________________  ");
                System.out.println("\n\tосуществляется выход");
                break;
            }
        }

    }



    public static int reduceMelonAmount(int amountToTake, int melonAmount){//надо по заданию
        if(amountToTake>melonAmount){
            int difference =amountToTake-melonAmount;
            System.out.println("Не удалось вывести "+difference+" дынь");
            System.out.println("Вывезено  "+melonAmount+" дынь");
            melonAmount =0;
            return melonAmount;
        }
        else
            return melonAmount-amountToTake;
    }

    public static int bringMelonAmount(int amountToBring, int melonAmount){

        melonAmount=melonAmount+amountToBring;
        System.out.println("Привезено  "+amountToBring+" дынь");
        return melonAmount;


    }

    public static int MainMenu(){
        Scanner input =new Scanner(System.in);

        int choice;

        while (true){

            System.out.println("\n\n\n\n\n\t______________________________  ");
            System.out.println("\n\tЧто вы хотите получить?:  ");
            System.out.println("1:  Вывести дыни ");
            System.out.println("2:  Добавить  дыни ");
            System.out.println("3:  Получить колиечтво дынь на складе ");
            System.out.println("4:  Выход ");
            System.out.println("\n\t______________________________  ");


            System.out.println("\n\tВаш выбор: ");

            choice = input.nextInt();

            if (choice<1 || choice>4)
                System.out.println("\nНекорректный ввод, попробуйте снова ");

            else
                return choice;

        }
    }
}
