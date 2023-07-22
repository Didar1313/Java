class PhysicsTeacher {
    String designation="Teacher";
    String collegeName="Ideal college";
    void display(){
        System.out.println("The teacher is already married");
    }
    
}
 class Teacher extends PhysicsTeacher{
    String mainSubject="Physics";
    public static void main(String[] args) {
        Teacher obj=new Teacher();
        System.out.println("College Name :"+obj.collegeName);
        System.out.println("Designation :"+obj.designation);
        System.out.println(obj.mainSubject);
        obj.display();;
    }
}