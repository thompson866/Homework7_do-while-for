public class Main {
    public static void main(String[] args) {
        //Task 1//
        System.out.println("Задание 1");
        int salary = 15000;
        int total = 0;
        int money = 2459000;
        int mouth = 0;
        while (total < money) {
            total = total + salary;
            mouth++;
            System.out.println("Месяц " + mouth + ", сумма накоплений равна " + total + " рублей");
        }

        //Task 2 //
        System.out.println("Задание 2");
        int numUp = 10;
        int numDown = 0;
        while (numDown < numUp) {
            numDown++;
            System.out.print(numDown + " ");
        }
        System.out.println();
        for (numDown = numUp; numDown > 0; numDown--) {
            System.out.print(numDown + " ");
        }
        System.out.println();

        //Task 3//
        System.out.println("Задание 3");
        int popular = 12_000_000;
        int birth = 17;
        int dead = 8;
        int factor = 1000;
        int defference = birth - dead;
        int time = 10;
        for (int year = 1; year <= time; year++) {
            popular = popular + popular * defference / factor;
            System.out.println("Год " + year + " численность населения составляет " + popular);
        }

        //Task 4//
        System.out.println("Задание 4");
        int box = 15_000;
        int totalBox = 12_000_000;
        double percentMouth = 7 / 100D;
        int mouthBox = 0;
        for (; box < totalBox; ) {
            box = (int) (box + box * percentMouth);
            mouthBox++;
            System.out.println("В месяце " + mouthBox + " накоплений " + box);
        ////???del

        //Task 5//


            if (mouthBox % 6 == 0)////???
                System.out.println("В месяце " + mouthBox + " накоплений " + box);
        }

        //Task 6//
        System.out.println("Задание 6");
        money = 15000;
        time = 9 * 12;
        for (int month = 1; month <= time; month++) {
            money = money + (int) (money * percentMouth);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " накоплений " + money);
            }
        }

        //Task 7//
        System.out.println("Задание 7");
        int day = 1;
        for (int friday = day; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет");
        }

        //task 8//
        System.out.println("Задание 8");
        int now = 2023;
        int start = now - 200;
        int finish = now + 100;
        int period = 79;
        for (int years = start; years <= finish; years++) {
            if (years % period == 0) {
                System.out.println(years);
            }
        }


    }


}
