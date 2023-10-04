package task2;

public class Person {
    private String name;
    private String surname;
    private String patronymic;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (surname==null && patronymic == null)
            return name;
        else
            return name + " " + surname + " " + patronymic;
    }

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
