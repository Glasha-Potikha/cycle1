public class Main {
    public static void main(String[] args) {
        //Задача №1
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //Задача №2
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        //Задача №3
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        //Задача №4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //Задача №5
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i);
        }
        //Задача №6
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        //Задача №7
        for (int i = 1; i <= 512; i += i) {
            System.out.println(i);
        }
        //Задача №8
        int savings = 0;
        for (int i = 0; i <= 12; i++) {
            savings += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
        }
        //Задача №9
        int savingsInTheBank = 0;
        for (int i = 0; i <= 12; i++) {
            savingsInTheBank = savingsInTheBank + (savingsInTheBank / 100);
            savingsInTheBank += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savingsInTheBank + " рублей");
        }
        //Задача №10
        for (int i = 0; i <= 10; i++) {
            System.out.println("2*" + i + "=" + i * 2);
        }
    }
}