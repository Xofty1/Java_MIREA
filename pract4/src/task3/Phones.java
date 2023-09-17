package task3;

public class Phones implements Name{
    private String name;
    private int cost;

    public String getName() {
        return "Название телефона: " + name  + ". Цена: " + cost;
    }

    public int getCost() {
        return cost;
    }

    public Phones(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}
