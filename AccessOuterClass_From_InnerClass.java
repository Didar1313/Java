class OuterClass{
    int x=4;
    class InnerClass{
        int y=9;
        int display(){
            return x;
        }
    }
}
public class AccessOuterClass_From_InnerClass {
    public static void main(String[] args) {
        OuterClass outterClass=new OuterClass();
        OuterClass.InnerClass innerClass=outterClass.new InnerClass();
        System.out.println(outterClass.x);
        System.out.println(innerClass.display());
        System.out.println(innerClass.y);
    }
}
