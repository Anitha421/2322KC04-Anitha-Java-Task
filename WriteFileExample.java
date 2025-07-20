import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {

public static void main(String[] args){

try {


FileWriter fw = new FileWriter("output.txt");
BufferedWriter bw = new BufferedWriter(fw);



bw.write("Hello, world!");
bw.newLine();

bw.write("This is a Java file writing example.");
bw.newLine();

bw.write("Each line is written separately.");
bw.newLine();

bw.close();

System.out.println("Strings written to file successfully.");


} catch (IOException e) {

System.out.println("Error writing to file: " + e.getMessage());


}

}

}