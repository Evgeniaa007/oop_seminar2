public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;
    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }
    
    public String getName() {
        return name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }
    
    public boolean getFullness(){
        return fullness;
    }

    public void setFullness(boolean fullness){
        this.fullness = fullness;
    }

    public void eat(Plate bowl) { 
        bowl.decreaseFood(appetite);
    }
}