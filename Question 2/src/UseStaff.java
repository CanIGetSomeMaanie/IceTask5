import java.util.Scanner;

public class UseStaff {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current staff number: ");
        int staffNumber = input.nextInt();

        input.nextLine();

        System.out.print("Enter the staff hiring location: ");
        String staffLocation = input.nextLine();

        StaffHiring staff = new StaffHiring(staffNumber, staffLocation);

        staff.printStaffHiring();

        input.close();
    }
}