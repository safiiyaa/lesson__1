public class Dog extends Animal{
    private String name;
    private String breed;
    private String commands;

    public Dog(ColorEnum color, Home home, String name, String breed, String commands) {
        super(color, home);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public String getBreed() {
        return breed;
    }

    public String getName(){
        return name;
    }
    public String getCommands(){
        return commands;
    }

    final public void makeVoice(){
        System.out.println("Gav Gav");
    }
    public void makeVoice(String voice){
        System.out.println("Dog " + voice);
    }
    public void hide(){
        System.out.println("Dog hide a bone");
    }
    public void hide(String hide){
        System.out.println("Dpg hide " + hide);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName: " + name +
                "\nBreed: " + breed +
                "\nCommands: " + commands;
    }
}