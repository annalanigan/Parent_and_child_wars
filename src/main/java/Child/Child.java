package Child;

public abstract class Child {

    private String name;
    private int tiredness;
    private int hunger;

    public Child(String name){
        this.name = name;
        this.tiredness = 0;
        this.hunger = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTiredness() {
        return tiredness;
    }

    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }


    public void increaseHunger(int value){
        this.hunger += value;
    }

    public void increaseTiredness(int value){
        this.tiredness += value;
    }

    public void feed(){
        setHunger(0);
    }
}
