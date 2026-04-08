public class MemberCardDemo {

    public static void main(String[] args) {

        // 1 Default
        MemberCard m1 = new MemberCard();

        // 2 Overloaded
        MemberCard m2 = new MemberCard("Ali");
        MemberCard m3 = new MemberCard("Sana", "BBA");

        // 2 Full constructor
        MemberCard m4 = new MemberCard("Ahmed", "BSCS", 3, 500, true);
        MemberCard m5 = new MemberCard("Ayesha", "BSSE", 2, 1000, false);

        // 1 Copy constructor
        MemberCard m6 = new MemberCard(m4);

        // Method calls
        m2.payFee(700);
        m3.deactivateCard();
        m5.activateCard();

        // Print all
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);

        // Print total
        System.out.println("Total Cards Created: " + MemberCard.getTotalCards());
    }
}