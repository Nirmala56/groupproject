import java.util.Date;
import java.util.Random;
import java.util.Scanner;
public class GeneralMed {
    private static final int ANTIBIOTIC = 1;
    private static final int ANTIVIRAL = 2;
    private static final int ANTIDEPRESSANT = 3;
    private static final int ANALGESIC = 4;
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private static int prescriptionCount = 0;
    static int prescribeMedication(String symptoms) {
        int medication;
        switch (symptoms) {
            case "stomachache":
                medication = ANTIBIOTIC;
                break;
            case "fever":
                medication = ANTIVIRAL;
                break;
            case "sadness":
                medication = ANTIDEPRESSANT;
                break;
            case "headache":
                medication = ANALGESIC;
                break;
            default:
                medication = 0;
        }
        if (medication > 0) {
            prescriptionCount++;
        }
        return medication;
    }
    static void printPrescription(int medication) {
        Date date = new Date();
        System.out.println("Prescription date: " + date.toString());
        switch (medication) {
            case ANTIBIOTIC:
                System.out.println("Prescribed medication: Antibiotic");
                break;
            case ANTIVIRAL:
                System.out.println("Prescribed medication: Antiviral");
                break;
            case ANTIDEPRESSANT:
                System.out.println("Prescribed medication: Antidepressant");
                break;
            case ANALGESIC:
                System.out.println("Prescribed medication: Analgesic");
                break;
            default:
                System.out.println("No medication prescribed.");
        }
        System.out.println("Total number of prescriptions: " + prescriptionCount);
    }
}