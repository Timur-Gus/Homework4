public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println();
        int age = 11;
        System.out.print("Если возраст человека равен " + age + ", то ");
        if (age > 18) {
            System.out.println("он совершеннолетний");
        }
        else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();
        System.out.println("Задача 2");
        System.out.println();
        int temp = 20;
        System.out.print("На улице " + temp + " градусов, ");
        if (temp > 5) {
            System.out.println("можно идти без шапки");
        }
        else {
            System.out.println("нужно надеть шапку");
        }
        System.out.println();
        System.out.println("Задача 3");
        System.out.println();
        int speed = 120;
        System.out.print("Если скорость " + speed + ", то ");
        if (speed > 60) {
            System.out.println("придется заплатить штраф");
        }
        else {
            System.out.println("можно ездить спокойно");
        }
    }
}