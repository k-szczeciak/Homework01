package pl.coderslab.collection;



import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class Main1 {


    public static void main(String[] args) {

        Path path = Paths.get("pl/coderslab/collection/earnings.txt");
        //String path1 = getServletContext().getRealPath("/earnings.txt");
        //todo zapytac o powyzsze



        try {
            List<String> resultStr = new ArrayList<String>();



            for (String line : Files.readAllLines(path)) {
                String[] lineSplit = line.split(";|,");
                if (!line.toLowerCase().contains("kowalski".toLowerCase())
                && !line.toLowerCase().contains("kowalska".toLowerCase())
                        && line.toLowerCase().contains("zł".toLowerCase())
                ){
                    double amount = Double.valueOf(lineSplit[2].replaceAll("\\s+|zł",""));
                    String lineP = String.valueOf(amount) + "_" + line;
                    resultStr.add(lineP);
                }
            }
            Collections.sort(resultStr);

            for (int i = resultStr.size(); i > resultStr.size() - 3; i--) {
                String[] line = resultStr.get(i-1).split("_");
                System.out.println(line[1]);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
