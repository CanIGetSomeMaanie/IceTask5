public class Main {
    public static void main(String[] args) {

        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};

        int[] bathrooms = {8, 7, 5, 2, 7, 7};
        int[] kitchens = {2, 4, 5, 2, 7, 8};
        int[] garden = {5, 5, 2, 3, 9, 5};

        System.out.println("--------------------------------------------------------");
        System.out.println("\t\tHOME MAKEOVER REPORT");
        System.out.println("--------------------------------------------------------");

        System.out.printf("%-8s%-12s%-12s%-12s%n", "", "Bathrooms", "Kitchens", "Garden");

        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-8s%-12d%-12d%-12d%n",
                    months[i], bathrooms[i], kitchens[i], garden[i]);
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("\nMONTHLY TOTALS");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < months.length; i++) {
            int total = bathrooms[i] + kitchens[i] + garden[i];

            System.out.printf("%-8s%-5d", months[i], total);

            if (total >= 15) {
                System.out.print("\t***");
            }

            System.out.println();
        }

        System.out.println("--------------------------------------------------------");
    }
}