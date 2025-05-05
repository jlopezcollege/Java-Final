package javafinal2;

import java.io.FileWriter;
import java.io.IOException;
public class FileCreator {
    private FileWriter MyFile;
    
    FileCreator(String name) {
        try {
            this.MyFile = new FileWriter(name); // (name, true) to append
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    void HeaderWriter() {
        try {
            MyFile.write("Name, Age, City\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    void LineWriter(String name, int age, String city) {
        try {
            MyFile.write(name + "," + age + "," + city + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    void CloseFile() {
        try {
            MyFile.close();
        } catch (IOException e) {
            e.printStackTrace();  // Now properly handled
        }
    }
}
