import java.util.Arrays;

final public class  FightingDog extends Dog{
    private int victory;
    private int defeats;

    public FightingDog(ColorEnum color, Home home, String name, String breed, String commands, int victory, int defeats) {
        super(color, home, name, breed, commands);
        this.victory = victory;
        this.defeats = defeats;
    }


    public int getVictory(){
        return victory;
    }
    public int getDefeats(){
        return defeats;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nVictory: " + victory +
                "\nDefeats: " + defeats;
    }
}