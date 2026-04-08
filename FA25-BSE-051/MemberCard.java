public class MemberCard {

    // Static variables
    private static int counter = 0;
    private static final String PREFIX = "LIB-";

    // Instance variables
    private String cardNo;
    private String studentName;
    private String department;
    private int semester;
    private double feePaid;
    private boolean active;

    // Generate Card Number
    private static String generateCardNo() {
        counter++;
        return PREFIX + String.format("%04d", counter);
    }

    // Default Constructor
    public MemberCard() {
        this.cardNo = generateCardNo();
        this.studentName = "Unknown";
        this.department = "BSSE";
        this.semester = 1;
        this.feePaid = 0;
        this.active = true;
    }

    // Constructor with name
    public MemberCard(String studentName) {
        this.cardNo = generateCardNo();
        this.studentName = studentName;
        this.department = "BSSE";
        this.semester = 1;
        this.feePaid = 0;
        this.active = true;
    }

    // Constructor with name and department
    public MemberCard(String studentName, String department) {
        this.cardNo = generateCardNo();
        this.studentName = studentName;
        this.department = department;
        this.semester = 1;
        this.feePaid = 0;
        this.active = true;
    }

    // Full Constructor
    public MemberCard(String studentName, String department, int semester, double feePaid, boolean active) {
        this.cardNo = generateCardNo();
        this.studentName = studentName;
        this.department = department;
        this.semester = semester;
        this.feePaid = feePaid;
        this.active = active;
    }

    // Copy Constructor
    public MemberCard(MemberCard other) {
        this.cardNo = generateCardNo();
        this.studentName = other.studentName;
        this.department = other.department;
        this.semester = other.semester;
        this.feePaid = other.feePaid;
        this.active = other.active;
    }

    // Static method
    public static int getTotalCards() {
        return counter;
    }

    // Deactivate
    public void deactivateCard() {
        active = false;
    }

    // Activate
    public void activateCard() {
        active = true;
    }

    // Pay Fee
    public void payFee(double amount) {
        if (amount > 0) {
            feePaid += amount;
        } else {
            System.out.println("Invalid fee amount!");
        }
    }

    // toString
    public String toString() {
        return cardNo + " | " +
               studentName + " | " +
               department + " | Sem: " +
               semester + " | Fee: " +
               feePaid + " | Active: " +
               active;
    }
}