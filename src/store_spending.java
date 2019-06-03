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
            FileWriter fw = new FileWriter("/Users/ericlin/Desktop/spending_tracker/spending.csv");
            fw.append("Purpose \n");
            fw.append("Amount ");
            fw.append(date.toString());
            fw.close();
        }catch (Exception e){System.out.println("Error writing file");}


    }
}
