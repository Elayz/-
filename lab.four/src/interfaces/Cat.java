package interfaces;

public class Cat implements Nameable{
    private String name;
    public Cat(String n){
        name = n;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(String name){
        return name;
    }
    public void getName(){System.out.println("The name is: "+this.name);}

}
