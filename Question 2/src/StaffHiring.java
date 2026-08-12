public class StaffHiring extends Staff {

    public StaffHiring(int staffNumber, String staffLocation) {
        super(staffNumber, staffLocation);
    }

    @Override
    public void printStaffHiring() {
        System.out.println();
        System.out.println("STAFF HIRING REPORT");
        System.out.println("===================");
        System.out.println("LOCATION: " + getStaffLocation());
        System.out.println("STAFF NUMBER: " + getStaffNumber());
        System.out.println("HIRE STAFF: " + getStaffHiringProcess());
    }
}