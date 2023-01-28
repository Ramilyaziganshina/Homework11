import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static boolean testForLeap (int currentYear) {
        return currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0;
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int currentYear = 2021;
        if (testForLeap(currentYear)) {
            System.out.println(currentYear + " год является високосным");
        } else {
            System.out.println(currentYear + " год не является високосным");
        }
    }
    public static int determineTheVersion (int operatingSystem, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear >= currentYear) {
            switch (operatingSystem) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                default:
                    return 4;
            }
        } else switch (operatingSystem) {
            case 0:
                return 2;
            case 1:
                return 3;
            default:
                return 4;
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int operatingSystem = 1;
        int clientDeviceYear = 2015;
        if (determineTheVersion(operatingSystem, clientDeviceYear) == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (determineTheVersion(operatingSystem, clientDeviceYear) == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (determineTheVersion(operatingSystem, clientDeviceYear) == 2) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (determineTheVersion(operatingSystem, clientDeviceYear) == 3) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Операционная система не распознана");
        }
    }
    public static int calculateDeliveryTime (int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 100) {
            deliveryDays++;
        }
        return deliveryDays;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        if (calculateDeliveryTime(deliveryDistance)>3) {
            System.out.println("Доставки нет");
        }else {
            System.out.println("Потребуется дней " + calculateDeliveryTime(deliveryDistance));
        }
    }
}