import java.util.Scanner;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке " + food + " единиц еды");
    }

    public void decreaseFood (int n){
        food -= n;
    }

    public void addFood (){ 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько единиц корма вы хотите добавить: ");
        int amount = scanner.nextInt();
        food += amount;
        scanner.close();
    }
}
