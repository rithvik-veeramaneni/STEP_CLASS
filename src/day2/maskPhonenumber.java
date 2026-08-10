public class maskPhonenumber {
    public static String maskNumber(String number) {
        if (number == null) {
            return "Invalid number";
        }

        String digits = number.replaceAll("\\D", "");
        if (digits.length() != 10) {
            return "Invalid number";
        }

        return "XXXX-XXXX-" + digits.substring(6);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter phone number: ");
        String input = scanner.nextLine();
        System.out.println(maskNumber(input));
        scanner.close();
    }
}
