import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";
        String line;
        StringBuilder output = new StringBuilder();
        DecimalFormat df = new DecimalFormat("$#.00");

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            output.append("EmpID,PayRate,HoursWorked,WeeklyPay\n");
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int empID = Integer.parseInt(values[0]);
                double payRate = Double.parseDouble(values[1]);
                double hoursWorked = Double.parseDouble(values[2]);
                double weeklyPay;

                if (hoursWorked > 40) {
                    weeklyPay = (40 * payRate) + ((hoursWorked - 40) * payRate * 1.5);
                } else {
                    weeklyPay = hoursWorked * payRate;
                }

                output.append(empID).append(",").append(payRate).append(",").append(hoursWorked)
                      .append(",").append(df.format(weeklyPay)).append("\n");
            }

            bw.write(output.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
