package Child;

public class PrimaryKid extends Child implements IActions{

    private String favouriteGame;

    public PrimaryKid(String name, String game){
        super(name);
        this.favouriteGame = game;
    }

    public String getFavouriteGame() {
        return favouriteGame;
    }

    public String cry() {
        return "IT'S NOT FAIR!! *slams door*";
    }

    public void play(int duration) {
        increaseTiredness(duration/10);
        increaseHunger(1);
    }

    public void sleep(int duration) {
        setTiredness(0);
        increaseHunger(duration);
    }

    public String fight() {
        increaseHunger(2);
        increaseTiredness(4);
        return "IT WASNT MY FAULT!! *Storms upstairs*";
    }
}
