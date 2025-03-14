class parent{
    public void add(){
        System.out.println("hello world");
    }
}
class Child extends parent{
    void display(){
        add();
    }
}
public class Third{
    public static void main(String arg[]){
    Child obj = new Child();
    obj.display();
}
}