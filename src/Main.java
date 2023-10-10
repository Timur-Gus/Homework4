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
    }
}