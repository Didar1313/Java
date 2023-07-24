
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try{
        File write=new File("myFile.txt");
        Scanner obj=new Scanner(write);  
        while(obj.hasNextLine()){
            String data=obj.nextLine();
            System.out.println(data);
        }
        obj.close();          
        }catch(FileNotFoundException e){
            System.out.println("An error occurred");
        }


    }
}
