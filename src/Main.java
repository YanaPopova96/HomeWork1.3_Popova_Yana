public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // Задание 2
        int clientDeviceYear = 2010;
        if (clientDeviceYear < 2015) {
            System.out.print("Установите облегченную версию приложения для ");
        } else {
            System.out.print("Установите версию приложения для ");
        }
        if (clientOS == 1) {
            System.out.println("Android по ссылке");
        } else {
            System.out.println("iOS по ссылке");
        }

        // Задание 3
        int year = 2022;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}