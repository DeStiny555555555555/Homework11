public class Main {
    public static void printYear(int year) {
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год -  не високосный");
        }
    }

    public static void printDownloadCorrectApp(int clientDeviceYear, int phoneSystems) {
        if (phoneSystems == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
                }
        if (phoneSystems == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static int deliveryDistance (int km) {
        if (km <= 20) {
            return 1;
        } else if (km > 20 && km <= 60) {
            return 2;
        } else if (km > 60 && km <= 100) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2025;
        printYear(year);
        System.out.println("Задание 2");
        int clientDeviceYear = 2014;
        int phoneSystems = 0;
        printDownloadCorrectApp(clientDeviceYear, phoneSystems);
        System.out.println("Задание 3");
        int deliveryDistance1 = 100;
        int deliveryDay = deliveryDistance(deliveryDistance1);
        if (deliveryDay > 0) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Доставки нет");
        }
    }
}
