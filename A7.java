interface printable{
    void print();
    
}
interface showable{
    void show();
}
class A7 implements printable,showable{
    public void print()
    {
        System.out.println("hello");
        
    }
    public void show()
    {
        System.out.print("welcome");
        
    }
    public static void main(String[] args)
    {
        A7 obj=new A7();
        obj.print();
        obj.show();
    }
}