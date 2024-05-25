// Abstraction
abstract class Dog{
    abstract void bark();
}
class labDog extends Dog{
    void bark(){
        System.out.print("BOO BOO");
    }
}
class ratWeeler extends Dog{
    void bark(){
        System.out.print("No bark direct attack");
    }
}
// Defined for hiding implementation details and provides data security and easier for developers that they can focus on how to use them rather than understanding implementation details and gives clear picture over what the system does rather how it does.
public class Main {
    public static void main(String[] args) {
        Dog d=new labDog();
        d.bark();
        Dog e=new ratWeeler();
        e.bark();
    
    }
}
