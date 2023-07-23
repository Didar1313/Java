 abstract class Teachers{
    public abstract void teacherMatrialStatus();
    public void display(){
        System.out.println("Hello,This is your fav teacher");
    }
}
class Teacher extends Teachers{
    public void teacherMatrialStatus(){
        System.out.println("Professor");
    }
}

class AbstractAccess {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.display();
        teacher.teacherMatrialStatus();
    }
}
