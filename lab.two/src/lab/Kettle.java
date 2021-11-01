package lab;

public class Kettle extends Dish {
    @Override
    public void bePlastic(){
        System.out.println("only lid is plastic");
    }
    @Override
    public void crush(){
        System.out.println("crush but not really ;)");
    }
}
