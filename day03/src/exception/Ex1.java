package exception;

import java.io.*;

public class Ex1 {
    public static void main(String[] args) {
        File file = null;
        file = new File("C:\\Javaprogram\\sm25java\\day03\\src\\a.txt");

//        System.out.println("File exists: " + file.getName());
//        System.out.println("File: " + file.isFile());

        Reader reader = null;

        try {
            reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line = null;

            while (true) {
                line = br.readLine();
                if (line == null) break;
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
            return;
        }


//        catch (FileNotFoundException e) {
//            System.out.println("File not found");
//            return;
//        } catch (IOException e) {
//            System.out.println("I/O Error");
//            return;
//        }

//        BufferedReader br = new BufferedReader(reader);
//        String line = null;
//
//        while (true) {
//
//            try {
//                line = br.readLine();
//            } catch (IOException e) {
//                System.out.println("Error reading file");
//                break;
//            }
//
//            if (line == null) break;
//            System.out.println(line);
//        }
    }
}
