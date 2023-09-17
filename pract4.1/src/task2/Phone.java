package task2;

public class Phone {
    private String number;
    private String model;
    private double weight;

    @Override
    public String toString() {
        return "Phone: " +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, double weight) {
        this(number,model);
        this.weight = weight;
    }
    public Phone(){}
    public String receiveCall(String name) {
        return "Звонит " + name;
    }

    public String receiveCall(String name, String number) {
        return "Звонит " + name + ". Номер телефона: "+ number;
    }
    public void sendMessage(String... phNum)
    {
        for (String ph : phNum)
            System.out.println("Сообщение отправлено на номер:" + ph);
    }

}
