public class Main {
    public static void main(String[] args) {


        //task 1

        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Не удается идентифицировать операцинную систему");
        }


        //task 2
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientDeviceYear >= 2015) {
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Не удается идентифицировать операционную систему");}
        }


//task 3

        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }

//task 4

        int deliveryDistance = 10;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + "1 сутки");
        } if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + "2 суток");
        } if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + "3 суток");
        }

//task 5

        int monthNumber = 12;
                switch (monthNumber) {
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                case 12:
                    System.out.println("Зима");
            break;
                    default:
            System.out.println("Такого месяца не существует");

        }
    }
}

