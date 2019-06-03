import java.util.*;
import java.io.*;
import com.opencsv.CSVWriter;


public class store_spending {
    Date date; // time money is spent
    String purpose;
    int amount;

    public store_spending(int amount, String purpose){
        this.date = new Date();
        this.purpose = purpose;
        this.amount = amount;
    }

    protected void writeFile(){
        try {
            FileWriter outputFile = new FileWriter("/Users/ericlin/Desktop/spending_tracker/spending.csv");
            CSVWriter csvWriter = new CSVWriter(outputFile);
            
            outputFile.append("Purpose \n");
            outputFile.append("Amount ");
            outputFile.append(date.toString());
            outputFile.close();
        }catch (Exception e){System.out.println("Error writing file");}


    }
}
