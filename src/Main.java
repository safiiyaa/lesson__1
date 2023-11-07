public class Main {
    public static void main(String[] args) {
        Home home = new Home("Peace", "Lenina 5");
        Dog dog = new Dog(ColorEnum.WHITE, home, "Rex", "Sheep-dog", "Sid, Lia");
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Giv Giv");
        System.out.println("----------");

        Home home1 = new Home("Fight club", "Gogolya 3");
        FightingDog dog1 = new FightingDog(ColorEnum.BLEAK, home1, "Guts", "Doberman", "Fight, Next to", 9, 0);
        System.out.println(dog1.getInfo());
        dog1.makeVoice();
        dog1.makeVoice("Guv Guv");
        System.out.println("----------");

        FightingDog dog2 = new FightingDog(ColorEnum.BLEAK, home1, "Rudi", "Pitbull", "Fight, Sid", 7, 3);
        System.out.println(dog2.getInfo());
        dog2.makeVoice();
        dog2.makeVoice("Gov Gov");
    }
}