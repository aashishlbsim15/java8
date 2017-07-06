import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * Created by ashish on 20/6/17.
 */
class ques1
{
    public static void main(String[] args) {
        ques1 myobj = new ques1();
        myobj.moveTheFile();
    }

    public void moveTheFile () {
        try {
            File destDir = new File("/home/ashish/jquery");
            File srcFile = new File("/home/ashish/output.txt");
            FileUtils.copyFileToDirectory(srcFile, destDir);
            System.out.println("file copied");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

