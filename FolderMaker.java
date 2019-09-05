import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FolderMaker {
    public static void main(String[] args) throws IOException {
        String row;
        int index = 0;
        List<String> dirset = new LinkedList<>();
        File baseDir = new File("output");
        baseDir.mkdir();

        BufferedReader reader1 = new BufferedReader(new FileReader("folderlist.txt"));
        while ((row = reader1.readLine()) != null) {
            dirset.add("output\\"+row);
            index++;
        }

        File[] dirArray = new File[index];
        for (int i = 0; i < index; i++){
            dirArray[i] = new File(dirset.get(i));
            dirArray[i].mkdir();
        }

    }
}
