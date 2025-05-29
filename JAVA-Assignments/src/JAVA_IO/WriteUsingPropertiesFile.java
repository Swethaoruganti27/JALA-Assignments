package JAVA_IO;
import java.io.FileOutputStream;
import java.util.Properties;

public class WriteUsingPropertiesFile {
    public static void main(String args[]) {

        try {
            Properties props = new Properties();
            props.put("Name", "Swetha");
            props.put("E.no", "215");
            props.put("College", "VEC");
            FileOutputStream outputStrem = new FileOutputStream("pf.txt");
            props.store(outputStrem, "This is a sample properties file");
            System.out.println("Properties file created");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
