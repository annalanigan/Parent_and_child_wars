package Child;

public class PreSchool extends Child implements IActions{

    private String favTeddy;

    public PreSchool(String name, String favTeddy) {
        super(name);
        this.favTeddy = favTeddy;
    }

    public String getFavTeddy() {
        return favTeddy;
    }

    public String cry() {
        return "WaaaaWaaaaa";
    }

    public void sleep(int duration) {
        setTiredness(0);
        increaseHunger(duration + 2);
    }

    public void play(int duration) {
        increaseTiredness((duration/10)+2);
        increaseHunger(4);
    }

    public String fight() {
        increaseTiredness(5);
        increaseHunger(3);
        return this.cry();
    }
}
