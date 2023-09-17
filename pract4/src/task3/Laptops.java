package task3;

public class Laptops implements Name {
    private String name;
    private int cost;

    public String getName() {
        return "Название ноутбука: " + name  + ". Цена: " + cost;
    }

    public int getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Laptops(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

}
