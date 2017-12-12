package Parent;

public class Mum extends Parent implements IReactions{

    public Mum(String name, String style) {
        super(name, style);
    }

    public void refereeFight() {
        decreasePatience(3);
    }

    public String explode() {
        String response = null;
        switch (getPatience()) {
            case 10:
            case 9:
                response = "You really are Mummy's little angels!";
                break;
            case 8:
            case 7:
                response = "ok, does anyone want a biscuit?";
                break;
            case 6:
            case 5:
                response = "come on... Just eat what you've been given.";
                break;
            case 4:
            case 3:
                response = "You leave your sister alone, and you stop antagonising your brother!!";
                break;
            case 2:
            case 1:
                response = "ENOUGH! I'm warning you!";
            case 0:
                response = "NO SWEETS FOR A WEEK!";
        }return response;
    }

//    // how to call a method on the child class
//     public void feedKid(Child  child){
//        ;
//    }


}
