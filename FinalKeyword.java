public class FinalKeyword {
    int x=10;
    final int y=20;
    public static void main(String[] args) {
        FinalKeyword obj=new FinalKeyword();
        System.out.println(obj.x);
        System.out.println(obj.y);
        /*
           obj.y=54;
           System.out.println(obj.y);

           it dosen't work cause y var declare as a final,that means it dosen't 
           changeable.
         */
        

    }
    
}
