public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");

        int clientOS = 0;
        {
            System.out.println("У пользователя операционная система IOS.");
        }
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }


        System.out.println("Задача 2.");


        int clientDeviceYear = 2015;

            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }

            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }

            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }

        System.out.println("Задача 3.");

        int year = 1996;


        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");

        } else {
            System.out.println(year + " Год не является високосным.");
        }

        System.out.println("Задача 4.");

        int deliveryDistance = 95;
        {
            System.out.println("Дистанция до клиента = " + deliveryDistance + " км.");
        }
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        }
        {
            System.out.println("Для доставки потребуется - " + deliveryDays + "-ое суток.");
        }

        System.out.println(" Задача 5.");

        int monthNumber = 5;
        {

            switch (monthNumber) {
                case 1:
                case 2:
                    System.out.println("Зима.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень.");
                    break;
                case 12:
                    System.out.println("Зима.");
                    break;
                default:
                    System.out.println("Такого сезона не существует.");
            }
        }
    }
}



