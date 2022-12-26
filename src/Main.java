public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task6();
        task7();

    }

    public static void task1(){
        System.out.println("Задание №1");
        int age = 18;
        System.out.print("Если возраст человека равен " + age + ", то");
        if (age >=18)
            System.out.println(" он совершеннолетний");
        else
            System.out.println(" он не достиг совершеннолетия, нужно немного подождать");

    }
    public static void task2(){
        System.out.println("Задание №2");
        int temperature = 5;
        System.out.print("На улице " + temperature + " градусов,");
        if (temperature <= 5)
            System.out.println(" нужно надеть шапку");
        else
            System.out.println(" можно идти без шапки");
    }
    public static void task3(){
        System.out.println("Задание №3");
        int carSpeed = 60;
        System.out.print("Если скорость " + carSpeed + ", то");
        if (carSpeed > 60)
            System.out.println(" придется заплатить штраф");
        else
            System.out.println(" можно ездить спокойно");
    }
    public static void task4(){
        System.out.println("Задание №4");
        int age = 60;
        System.out.print("Если возраст человека равен " + age + ", то ему нужно ходить ");
        if(age >= 2 && age <= 6)
            System.out.println("в детский сад");
        else if(age >=7 && age <=18)
            System.out.println("ходить в школу");
        else if(age > 18 && age <=24)
            System.out.println("в университет");
        else if(age < 2 || age >= 60)
            System.out.println("отдыхать");
        else
            System.out.println("на работу");

    }
    public static void task5(){
        System.out.println("Задание №5");
        int age = 60;
        System.out.print("Если возраст ребенка равен " + age + ", то ему ");
        if(age <5)
            System.out.println("нельзя кататься на аттракционе");
        else if(age >=5 && age <=14)
            System.out.println("можно кататься на аттракционе в сопровождении");
        else if(age > 14)
            System.out.println("можно кататься на аттракционе без сопровождения взрослого");
    }
    public static void task6(){
        System.out.println("Задание №6");
        int vanCount  = 70;
        if(vanCount < 60)
            System.out.print("В вагоне есть места: " + (60-vanCount) + " сидячих и 42 стоячих" );
        else if(vanCount < 102)
            System.out.println("В вагоне есть места: 0 сидячих и " + (102 - vanCount - 60) + "стоячих");
        else
            System.out.println("Мест нет");
    }
    public static void task7(){
        System.out.println("Задание №7");
        int one = 70;
        int two = 532;
        int three = 21;
        if(one > two)
        {
            if(one> three)
                System.out.println("Число один большее");
            else
                System.out.println("Число три большее");
        }
        else
            System.out.println("Число два большее");

    }
}