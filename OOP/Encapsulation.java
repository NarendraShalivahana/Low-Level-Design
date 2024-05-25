//Encapsulation
class plant{
    private int age;
    private int leaves;
    
    plant(int age,int leaves){
        this.age=age;
        this.leaves=leaves;
    }
    
    public void get_age(){
        System.out.print(this.age);
    }
    
    public void get_leaves(){
        System.out.print(this.leaves);
    }
}
// This defined for data binding for data memebers and member functions, to form into a single unit (object of a class), also provide certain layer of abstraction through restricting direct acess to attributes, and can be accessed by (setters and getters) so we can get control over data modification, security over data.
public class Main {
    public static void main(String[] args) {
        plant p=new plant(10,4);
        p.get_age();
        p.get_leaves();
        System.out.print(p.age);//24: error: age has private access in plant [in Main.java]System.out.print(p.age);
    }
}
