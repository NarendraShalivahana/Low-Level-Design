//Inheritance
class Animal{
    int eyes;
    int legs;
    int tail;
    
    public void walk(){
        System.out.print("Walking");
    }
    
    public void eat(){
        System.out.print("eating");
    }
}
class Dog extends Animal{
    Dog(){
        this.eyes=2;
        this.legs=4;
        this.tail=1;
    }
    
    public void Bark(){
        System.out.print("Bow Bow");
    }
}
// Here Dog inheriting attributes and methods of parent class animal, Dog can utilize those parent class methods without defining or implementing in it's own class.

public class Main {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.Bark();
        d.eat();
        System.out.print(d.tail); 
    }
}
