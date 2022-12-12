import java.util.Date;
import java.util.Random;
import java.util.Scanner;
public class MedicalTreatment {
    private final String name;
    private final Date date;
    private final Random random;
    public MedicalTreatment(String name) {
        this.name = name;
        this.date = new Date();
        this.random = new Random();
    }
    public void startTreatment() {
        System.out.println("Treatment started for " + name + " on " + date);
        System.out.println("Enter your severity level: ");
        Scanner scanner = new Scanner(System.in);
        int severity=scanner.nextInt();
        if (severity <= 3) {
            givePainMedication();
        } else if (severity <= 7) {
            giveAntibiotics();
        } else {
            performSurgery();
        }
    }
    private void givePainMedication() {
        System.out.println("Prescribing pain medication to " + name);
    }
    private void giveAntibiotics() {
        System.out.println("Prescribing antibiotics to " + name);
    }
    private void performSurgery() {
        System.out.println("Scheduling surgery for " + name);
    }
}
