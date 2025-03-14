package exercicios_propostos.s12_enums.ex01;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Worker worker = new Worker();
        System.out.print("Enter departament's name: ");
        worker.setDepartament(new Departament(sc.nextLine()));

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        worker.setName(sc.nextLine());

        System.out.print("Level: ");
        worker.setLevel(WorkerLevel.valueOf(sc.nextLine()));

        System.out.print("Base salary: ");
        worker.setBaseSalary(sc.nextDouble());

        System.out.print("How many contracts to this worker? ");
        int nContracts = sc.nextInt();

        for(int i =0; i<nContracts; i++){
            HourContract contract = new HourContract();

            System.out.println("Enter contract #" + (i+1) + " data:");
            System.out.println("Date (DD/MM/YYYY):" );
            contract.setDate(sdf.parse(sc.next()));

            System.out.print("Value per hour: ");
            contract.setValuePerHour(sc.nextDouble());

            System.out.print("Duration (hours): ");
            contract.setHours(sc.nextInt());

            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String[] date = sc.next().split("/");

        int month = Integer.parseInt(date[0]);
        int year = Integer.parseInt(date[1]);

        System.out.println(worker.toString(year, month));

        sc.close();
    }
}
