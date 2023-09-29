public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int accumulation = 0;
        int salary = 15000;
        int month = 0;
        int years = 0;
        while (accumulation <= 2_459_000){
            accumulation = (accumulation + salary + accumulation / 100);
            month++;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей %n", month, accumulation);
//  Привет, Оль. В скрытой части кода я приделал более удобное и логичное отображение результата,
//  но нужно закомментировать первый вывод. Хочу разобраться как правильно было бы переключаться
//  между этими выводами, можешь разобрать на ближайшем вебинаре?
/*            if (month % 12 == 0) {
                years++;
                month = 0;
            }
            System.out.printf("Для накопления %d потребуется: %d лет и %d месяцев %n", 2459000, years, month);
 */
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println("");
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int year = 1;
        int born = population / 1000 * 17;
        int die = population / 1000 * 8;
        do {
            System.out.printf("%d год наблюдения. Численность составляет %d человек %n", year, population);
            population= population + born - die;
            year++;
        } while (year <= 10);
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int dep = 15000;
        int month = 1;
        while (dep < 12_000_000) {
            System.out.printf("%d-й месяц. На счету %d рублей %n", month, dep);
            dep = dep + (dep / 100 * 7);
            month++;
        }
        System.out.println("Что бы накопить 12.000.000 рублей нужно держать вклад " + month + " месяцев");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int dep = 15000;
        int month = 1;
        while (dep < 12_000_000) {
            dep = dep + (dep / 100 * 7);
            month++;
            if (month % 6 == 0) {
                System.out.printf("%d-й месяц. На счету %d рублей %n", month, dep);
            }
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int dep = 15000;
        int month = 1;
        while (month <= 108) {
            dep = dep + (dep / 100 * 7);
            month++;
            if (month % 6 == 0) {
                System.out.printf("%d месяцев. На счету %d рублей %n", month, dep);
            }
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int fridayData = 3;
        do {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет %n", fridayData);
            fridayData = fridayData + 7;
        } while (fridayData <= 31);
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int cometYear = 0;
        int startObserv = 1823;
        int finishObserv = 2123;
        while (cometYear <= finishObserv) {
            cometYear = cometYear + 79;
            if (cometYear >= startObserv && cometYear <= finishObserv) {
                System.out.println(cometYear);
            }
        }
    }
}