import java.util.Random;

public class Animal {
    private int age = generateAge();
    private ColorEnum color;
    private Home home;

    public Animal(ColorEnum color, Home home){
        this.color = color;
        this.home = home;
    }

    public int getAge() {
        return age;
    }

    public ColorEnum getColor(){
        return color;
    }

    public Home getHome(){
        return home;
    }

    private int generateAge(){
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public String getInfo(){
        return "Age: " + age +
                "\nColor: " + color +
                "\nHome name: " + home.getName() +
                "\nHome address: " + home.getAddress();
    }
}