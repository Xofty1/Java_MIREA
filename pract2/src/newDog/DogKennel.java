package newDog;


import java.util.Scanner;

public class DogKennel {

    public static void addDogs(Dog[] dogs, int mx)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mx; i++) {
            String name = sc.nextLine();
//            sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            Dog dog = new Dog(name, age);
            dogs[i] = dog;
        }

    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        addDogs(dogs,3);


        System.out.println(dogs[2].toString());
        System.out.println(dogs[1].toString());
        System.out.println(dogs[1].dogAgeToHuman() + "возраст 2ой собаки на человеческий");
    }


}
