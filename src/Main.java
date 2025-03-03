public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int salaryMonth=15000;
        int saving=0;
        int month=0;
        while ( saving < 2_459_000) {
            month++;
            saving=saving+salaryMonth;
            System.out.println("Месяц " + month + " ,сумма накоплений равна " + saving + " рублей");
     }
        System.out.println("Задача 2");

        int j = 10;
        for (int i = 1;i <= 10;i++) {
            System.out.print(i+ " ");

        }
        System.out.println();
        while (j >= 1) {
            System.out.print(j + " ");
            j--;
        }
        System.out.println();
        System.out.println("Задача 3");
        long countryPopulation = 12_000_000L;
        int birthRate = 17;
        int death = 8;
        int year = 0;
        double growthRoy = (birthRate - death) / 1000.0;
        System.out.println("Начальное население : " + countryPopulation);

        while (year < 10) {
            year++;

            long growth = (long) (countryPopulation * growthRoy);
            countryPopulation = (countryPopulation + growth);

            System.out.println("Год " + year + ", численность населения составляет " + countryPopulation);
        }
        System.out.println("Задача 4");
        int intialAmount = 15000;
        int inMonth = 0;
        while (intialAmount <=12_000_000) {
            inMonth++;
            intialAmount = intialAmount + intialAmount * 7 / 100;
                System.out.println("Месяц " + inMonth + " ,сумма накоплений равна " + intialAmount + " рублей");
            }

        System.out.println("Задача 5");
        int intial = 15000;
        int onMonth = 0;
        while (intial <12_000_000) {
            onMonth++;
            intial = intial + intial * 7 / 100;
            if (onMonth % 6 == 0) {

                System.out.println("Месяц " + onMonth + " ,сумма накоплений равна " + intial + " рублей");
            }
        }
        System.out.println("Задача 6");
        int money =15000;
        int justMonth=0;
        while (justMonth <108) {        //9 лет это 108 месяцев
            justMonth++;
            money = money + money * 7 / 100*6;
            if (justMonth % 6 == 0) {

                System.out.println("Месяц " + justMonth + " ,сумма накоплений равна " + money + " рублей");
            }
             }
        System.out.println("Задача 7");
        int firstDay=1;//Первая пятница месяца
        for (int day=1;day<=31;day++){

            int dayWeek = ((day - firstDay) % 7) + 1;
            if (dayWeek == 5) {
                System.out.println("Сегодня пятница, " + day + " -е число " + "Необходимо подготовить отчет");
            }
        }
        System.out.println("Задача 8");
        int currentYear = 2025;
                                          // Определяем границы периода для проверки
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int yearAstro = startYear; yearAstro <= endYear; yearAstro++) {
            if ((yearAstro % 79) == 0) {
                System.out.println(yearAstro);
            }
        }

    }
    }


