package Parent;

import Child.PrimaryKid;

public class Dad extends Parent implements IReactions {

    public Dad(String name, String style) {
        super(name, style);
    }

    public void referee(){
        decreasePatience(5);
    }

    public void explode() {
        switch (getPatience()) {
            case 10:
                System.out.println("What excellent Children you both are.");
                break;
            case 9:
            case 8:
                System.out.println("Carry on!");
                break;
            case 7:
            case 6:
            case 5:
                System.out.println("Right - just behave yourself.. or else!");
                break;
            case 4:
            case 3:
                System.out.println("That's it. No telly for a week!");
                break;
            case 2:
            case 1:
                System.out.println("Go to your room!!!");
            case 0:
                System.out.println("GET UPSTAIRS NOW!");
        }
    }


    public void readStory(){
        setPatience(10);
    }

}
