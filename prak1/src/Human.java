import java.lang.*;
public class Human {
    private String name;
    private int age;
    private String job;
    public Human(String n, int a,String j){
        name = n;
        age = a;
        job=j;
    }
    public Human(String n,int a){
        name = n;
        age = a;
    }
    public Human(String n){
        name = n;
        age = 0;
    }
    public Human(){
        name = "David";
        age = 0;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String getName(String name){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getJob() {
        return job;
    }
    public String toString(){
        return this.name+" "+this.age+" years old and he is a "+this.job;
    }
    public void worksStage(){
        System.out.println(name+"s works stage is "
                +(age-18)+" years");
    }
}