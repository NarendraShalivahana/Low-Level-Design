//Polymorphism
class Animal{
    int eyes;
    int legs;
    int tail;
    @Override
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
    @Override
    public void walk(){
        System.out.print("Walk's like Badass");
    }
}
// Two types of polymorphism are there

// Run time polymorphism -- Method overriding 
// """when child class implementing same methods of which already exists in parent class, when we call these types of methods that should decide at run time which class's method should be called also called Method overriding"""

class Human{
    
    public void walk(int hands){
        System.out.print("walking with"+hands+"hands");
    }
    
    public void walk(int hands,int legs){
        System.out.print("Walking with"+hands+"hands and "+legs+"legs");
    }
}

// Compile time polymorphism -- Method overloading
//"""When a class contains two or more same methods and defer by parameters, when we call these type of methods,this should be decided at compile time also called Method overriding"""

public class Main {
    public static void main(String[] args) {
        //Overriding
        Dog d=new Dog();
        d.walk();
        
        //Overloading
        Human h=new Human();
        h.walk(2);
        h.walk(2,2);
    }
}
