import java.io.*;

public class ResultProcessing {
    public static void main(String[] args) {
        String inputFile = "marks.txt";
        String outputFile = "result.txt";

        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            
            reader = new BufferedReader(new FileReader(inputFile));
            writer = new BufferedWriter(new FileWriter(outputFile));

            String line;

            while ((line = reader.readLine()) != null) {
                
                String[] parts = line.split("\\s+");
                if (parts.length != 2) {
                    System.out.println("Invalid line: " + line);
                    continue;
                }

                String name = parts[0];
                int marks;

                try {
                    marks = Integer.parseInt(parts[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid marks for " + name + ": " + parts[1]);
                    continue;
                }

                String result = marks >= 35 ? "Pass" : "Fail";

                
                writer.write(name + " " + marks + " " + result);
                writer.newLine();
            }

            System.out.println("Result processing completed. Check " + outputFile);

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFile);
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        } finally {
            
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
