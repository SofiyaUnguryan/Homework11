import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2024;
        checkIfLeap(year);
        System.out.println("Задача 2");
        int clientDeviceYear = 2023;
        int clientOs = 0;
        chooseVersion(clientOs, clientDeviceYear);
        System.out.println("Задача 3");
        int deliveryDistance = 8;
        if (deliverTimeCount(deliveryDistance) == 0) {
            System.out.println("Доставка невозможна");
        } else {
            System.out.println("Потребуется дней для доставки - " + deliverTimeCount(deliveryDistance));
        }
    }

    public static void checkIfLeap(int year) {
        if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
            System.out.println(year + " - год невисокосный год");
        } else {
            System.out.println(year + " - високосный год");
        }
    }

    public static void chooseVersion(int clientOS, int clientDeviceYear) {
        int checkYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < checkYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < checkYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка в определении Вашей ОС");
        }
    }

    public static int deliverTimeCount(int deliveryDistance) {
        int minTime = 1;
        if (deliveryDistance < 20) {
            return minTime;
        } else if (deliveryDistance <= 60) {
            return minTime * 2;
        } else if (deliveryDistance <= 100) {
            return minTime * 3;
        } else {
            return 0;
        }
    }
}