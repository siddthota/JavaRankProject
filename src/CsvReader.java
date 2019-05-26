
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvReader {

    //Delimiters used in the CSV file
    private static final String COMMA_DELIMITER = ",";

    public static void main(String args[]) {

        List<Student> studentRecords = readStudentsFromCSV();

        //Lets print the Students List
        List<RankSolver> output = solveRank(studentRecords);

        System.out.println("Final List " + output.toString());

    }

    public static List<RankSolver> solveRank(List<Student> records) {
        List<RankSolver> resultList = new ArrayList<RankSolver>();
        Map<String, Student> studentMap = new HashMap<String, Student>();

        for(Student record: records) {
            String key = record.getCaste() + record.getGender();
            if(!studentMap.containsKey(key)) {
                studentMap.put(key, record);
            } else {
                if(studentMap.get(key).getRank() < record.getRank()) {
                    studentMap.remove(key);
                    studentMap.put(key, record);
                }
            }
        }

        for(Map.Entry<String, Student> student: studentMap.entrySet()) {
            RankSolver temp = new RankSolver("CSE", student.getValue().getRank(),
                    student.getValue().getGender(), student.getValue().getCaste(), student.getValue().getRegion());
            resultList.add(temp);
        }
        return resultList;
    }


    public static List<Student> readStudentsFromCSV() {
        List<Student> studentList = new ArrayList<Student>();
        BufferedReader read = null;
        try
        {
//            File myFile = new File("VRSE_CSE.csv");
//            System.out.println("Attempting to read from file in: "+myFile.getCanonicalPath());

            //Reading the csv file
            read = new BufferedReader(new FileReader("VRSE_CSE.csv"));

            //Create List for holding Student objects


            String line = "";
            //Read to skip the header
            read.readLine();
            //Reading from the second line
            while ((line = read.readLine()) != null)
            {
                String[] studentDetails = line.split(COMMA_DELIMITER);

                if(studentDetails.length > 0 )
                {
                    //Save the employee details in Employee object
                    Student student = new Student(
                            Integer.parseInt(studentDetails[0]),
                            studentDetails[1],
                            Float.parseFloat(studentDetails[2]),
                            studentDetails[3], studentDetails[4],
                            studentDetails[5], studentDetails[6],
                            studentDetails[7]);
                    studentList.add(student);
                }
            }

        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
        finally
        {
            try
            {
                read.close();
            }
            catch(IOException ie)
            {
                System.out.println("Error occured while closing the BufferedReader");
                ie.printStackTrace();
            }
        }

        return studentList;
    }
}