import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {

public static void main(String[] args){


try{

File file = new File("Sample.txt");
Scanner reader = new Scanner(file);

System.out.println("File content:\n");

while(reader.hasNextLine()) {

String line = reader.nextLine();
System.out.println(line);


}

reader.close();

}
catch (FileNotFoundException e){

System.out.println("File not found!");
System.out.println("Error: " + e.getMessage());


}



}



}