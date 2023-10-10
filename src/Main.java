public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println();
        int age = 27;
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
        System.out.println();
        System.out.println("Задача 4");
        System.out.println();
        System.out.print("Если возраст человека равен " + age + ", то ");
        if (age >= 2 && age <= 6){
            System.out.println("ему нужно ходить в детский сад.");
        }
        else if (age >= 7 && age <= 17){
            System.out.println("ему нужно ходить в школу.");
        }
        else if (age >= 18 && age <= 24){
            System.out.println("его место в университете.");
        }
        else if (age > 24){
            System.out.println("ему пора ходить на работу.");
        }
        System.out.println();
        System.out.println("Задача 5");
        System.out.println();
        int kidAge = 12;
        System.out.print("Если ребенку " + kidAge + " лет, то ");
        if (kidAge <= 5){
            System.out.println("он не может кататься на аттракционе.");
        }
        else if (kidAge > 5 && kidAge <= 14){
            System.out.println("он может кататься только в сопровождении взрослого." +
                    " Если взрослого нет, то кататься нельзя.");
        }
        else {
            System.out.println("он может кататься без сопровождения взрослого.");
        }
   }
}