import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void printLeapYear(int year3) {
        System.out.println(year3 + " год является високосным.");
    }

    public static void printNotLeapYear(int year3) {
        System.out.println(year3 + " год не является високосным.");
    }

    public static void result(int year3,int a, int b, int c) {

        if (year3 % b == 0 || year3 % c < 0) {
            printLeapYear(year3);
        } else {
            printNotLeapYear(year3);
        }
    }

    public static void shellAndYear(int clientOS, int android, int clientDeviceYear, int yearOfTransition, int ios) {

        if (clientOS == android && clientDeviceYear >= yearOfTransition) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } else if (clientOS == android && clientDeviceYear <= yearOfTransition) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        } else if (clientOS == ios && clientDeviceYear >= yearOfTransition) {
            System.out.println("Установите версию приложения для IOS по ссылке ");
        } else if (clientOS == ios && clientDeviceYear <= yearOfTransition) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке ");
        } else {
            System.out.println("У Вас скорее всего Windows Phone");
        }
    }

    public static void calculationOfDistanceAndTimeDependence(int deliveryDistance, int deliveryTime, int distance, int distance2, int distance3, int deliveryTime2, int deliveryTime3) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime );
        }else if(deliveryDistance >=distance && deliveryDistance < distance2){
            System.out.println("Потребуется дней: " + deliveryTime2 );
        } else if (deliveryDistance <= distance2 || deliveryDistance <= distance3){
            System.out.println( "Потребуется дней: " + deliveryTime3);
        } else {
            System.out. println("Обратитесь в ближайшее отделение банка, слишком большое расстояние))");
        }
    }
    public static void main(String[] args) {
        System.out.println("Задание 1");
// Задание 1
        int year3 = 2001;
        int a = 100;
        int b = 4;
        int c = 400;
        result(year3, a,b,c);
        System.out.println( "Задание 2");

        // Задание 2

        int clientOS = 1;
        int ios = 0, android = 1;
        int clientDeviceYear = 2001 ;
        int yearOfTransition = 2015;
        shellAndYear(clientOS, android, clientDeviceYear, yearOfTransition, ios);

        System.out.println("Задание 3");

        //Задание 3

        int deliveryDistance = 70 ;
        int distance = 20, distance2 = 60, distance3 = 100;
        int deliveryTime = 1, deliveryTime2 = 2, deliveryTime3 = 3;
        calculationOfDistanceAndTimeDependence(deliveryDistance, deliveryTime, distance, distance2, distance3, deliveryTime2, deliveryTime3);

    }
}