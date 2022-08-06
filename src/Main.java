public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    private static void task1() {
        byte count = 1;
        while (count <= 10) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        for (count = 10; count > 0; count--) {
            System.out.print(count + " ");
        }
        System.out.println();
    }

    private static void task2() {
        int fridayFirst = 7;
        int daysPerWeek = 7;
        int daysPerMonth = 31;
        for (int count = 1; count <= daysPerMonth; count++) {
            if (count == fridayFirst) {
                System.out.println("Сегодня пятница," + count + "-е число. Необходимо подготовить отчет.");
                fridayFirst = fridayFirst + daysPerWeek;
            }
        }
    }

    private static void task3() {
        int yearInitial = 1822;
        int yearFinal = 2122;
        int yearApproach = 0;
        while (yearApproach < yearFinal) {
            if (yearApproach >= yearInitial) {
                System.out.println(yearApproach);
            }
            yearApproach = yearApproach + 79;
        }
    }

    private static void task4() {
        for (int count = 1; count <= 30; count++) {
            System.out.print(count + ": ");
            if (count % 3 == 0 && count % 5 == 0) {
                System.out.print("ping pong");
            } else if (count % 5 == 0) {
                System.out.print("pong");
            } else if (count % 3 == 0) {
                System.out.print("ping");
            }
            System.out.println();

        }
    }

    private static void task5() {
        int valueFirst = 0;
        int valueSecond = 1;
        int count = 1;
        int valueSum;
        System.out.print(valueFirst + " " + valueSecond + " ");
        while (count < 9) {
            valueSum = valueFirst + valueSecond;
            valueFirst = valueSecond;
            valueSecond = valueSum;
            count++;
            System.out.print(valueSecond + " ");
        }
    }
}