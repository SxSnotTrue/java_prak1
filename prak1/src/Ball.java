import java.lang.*;
public class Ball {
    private String color;
    private String type;
    public Ball(String n, String a){
        color = n;
        type = a;
    }
    public Ball(String n){
        type = "For kids";
        color = n;
    }
    public Ball(){
        type = "For kids";
        color = "Orange";
    }
    public void setAge(String color) {
        this.color = color;
    }
    public void setName(String type) {
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public String getColor() {
        return color;
    }
    public String toString(){
        return "this ball "+this.type+" is "+this.color;
    }
}