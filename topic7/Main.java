package topic7;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileManager fileManager = new FileManager();

        fileManager.infoTextInFile("./topic7/test.txt","test");
        fileManager.addInfoInFile("./topic7/test.txt","test info in file ");
        fileManager.readFileInfo("./topic7/test.txt");
    }

    //test
}
