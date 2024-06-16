package CIP;

import java.io.*;

public class class1io {

    public static void main(String[] args) throws IOException {
        File f = new File("MyCode.txt");
        f.createNewFile();
        File dir = new File("NewChapter");
        dir.mkdir();

        if (dir.isDirectory())
        {
        String [] dirContents = dir.list(); 
        for (int i =0; i < dirContents.length; ++i)
         {
        System.out.println(dirContents[i]);
         }
        }
        System.out.println(dir.getAbsolutePath());
        FileReader fileReader = new FileReader(f);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = null;
        while ((line = reader.readLine()) != null)
        { 
            System.out.println(line);
        }
         writer.close();

    }
}
