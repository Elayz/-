package interfaces;

public class Doode implements Nameable{
    private String name;
    public Doode(String n){
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
