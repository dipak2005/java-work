
public class Oops {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("pink");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.print(p1.tip);
    }
}

class Pen {

    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class BankAccount {

    public String name;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
