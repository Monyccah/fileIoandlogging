import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Visitor {

   Logger VisitorLog = LogManager.getLogger(Visitor.class);

    public String name;
    public int age;
    public String date;
    public String time;
    public String comment;
    public String assist;

    public void save(){
        StringBuilder builder = new StringBuilder();
        builder.append("full names: "+name + "\n")
                .append(" ")
                .append("Age: "+age+"\n")
                .append(" ")
                .append("Date: "+date+"\n")
                .append(" ")
                .append("Time: "+time+"\n")
                .append(" ")
                .append("Assisted by:"+assist+" ");
        String full_Name = name.replace(" ", "_");
        String fileName = "visitor_{"+full_Name+"}.txt";

        File file = null;
        try {
            file = new File(fileName);
            if(file.createNewFile()) {
                Files.write(Paths.get(fileName),String.valueOf(builder).getBytes());
                VisitorLog.info("Successfully created!");
            }
            else {
                VisitorLog.warn("File already exist");
                throw new IOException("File already exist");

            }

        } catch (IOException e) {
            e.printStackTrace();
            VisitorLog.error(String.valueOf(e));
            System.out.println("I am running");
        }
    }
}