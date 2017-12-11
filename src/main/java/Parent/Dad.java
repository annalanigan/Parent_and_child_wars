package Parent;

import Child.PrimaryKid;

public class Dad extends Parent implements IReactions {

    public Dad(String name, String style) {
        super(name, style);
    }

    public void referee(){
        decreasePatience(5);
    }

    public String explode() {
        String response = null;
        switch (getPatience()) {
            case 10:
                response = "What excellent Children you both are.";
                break;
            case 9:
            case 8:
                response = "Carry on!";
                break;
            case 7:
            case 6:
            case 5:
                response = "Right - just behave yourself.. or else!";
                break;
            case 4:
            case 3:
                response = "That's it. No telly for a week!";
                break;
            case 2:
            case 1:
                response = "Go to your room!!!";
            case 0:
                response = "GET UPSTAIRS NOW!";
        }return response;
    }


    public void readStory(){
        setPatience(10);
    }

}
