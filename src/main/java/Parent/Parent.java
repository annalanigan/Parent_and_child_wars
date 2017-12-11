package Parent;

public class Parent {

    private String name;
    private String style;
    private int patience;

    public Parent(String name, String style){
        this.name = name;
        this.style = style;
        this.patience = 10;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public int getPatience() {
        return patience;
    }

    public void setPatience(int patience) {
        this.patience = patience;
    }

    public void decreasePatience(int value){
        patience -= value;
    }
}
