public abstract class Staff implements iStaff {

    private int staffNumber;
    private String staffLocation;

    public Staff(int staffNumber, String staffLocation) {
        this.staffNumber = staffNumber;
        this.staffLocation = staffLocation;
    }

    @Override
    public int getStaffNumber() {
        return staffNumber;
    }

    @Override
    public String getStaffLocation() {
        return staffLocation;
    }

    @Override
    public String getStaffHiringProcess() {
        if (staffNumber < 20) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public abstract void printStaffHiring();
}