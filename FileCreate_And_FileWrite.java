import java.io.File;
import java.io.FileWriter;

public class FileCreate_And_FileWrite {
    public static void main(String[] args) {
        try{
            FileWriter writer=new FileWriter("myFile.txt");
            writer.write("My first java file write in a folder");
            writer.close();
            System.out.println("Successfully done");
        }catch(Exception e){
            System.out.println("An error occurred");
        }
    }
    
}
