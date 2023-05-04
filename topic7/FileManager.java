package topic7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileManager {
    String fileName;
    String data;
    String filePath;

    public void infoTextInFile(String filePath, String data) {
        File file = new File(filePath);
        try{
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(data);
            fileWriter.flush();
            fileWriter.close();
        }catch (Exception e){

        }
    }

    public void addInfoInFile(String filePath, String data) {
        File file = new File(filePath);
        try{
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
            bufferWriter.write(data);
            bufferWriter.close();
        }catch (Exception e){

        }
    }

    public void readFileInfo(String filePath) {
        File file = new File(filePath);
        try{
            FileReader fileReader = new FileReader(file);
            char [] a = new char[50];
            fileReader.read(a);
            for(char c: a){
                System.out.print(c);
            }
            fileReader.close();

        }catch (Exception e){

        }
    }
}
