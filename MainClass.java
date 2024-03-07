import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = { 
        new Cat("Цири", 12, false),
        new Cat("Митя", 5, false),
        new Cat("Буся", 7, false),
        new Cat("Персик", 3, false),
        new Cat("Бэтмэн", 9, false)
        };

        Plate plate = new Plate(22);
        plate.info();

        for(Cat cat : cats){
            if (cat.getFullness() == false && cat.getAppetite() <= plate.getFood()){
                cat.setFullness(true);
                System.out.println("Ваш котик " + cat.getName() + " покушал");
                cat.eat(plate);
                plate.info();

            }
            else if (plate.getFood() < cat.getAppetite()){
                System.out.println("Вашему котику мало еды =(. Бедняжка " + cat.getName() + " не может покушать");
            }

        }

        System.out.println();

        plate.addFood();
        plate.info();

    }
}
