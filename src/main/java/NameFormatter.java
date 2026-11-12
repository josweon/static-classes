public class NameFormatter {
    private NameFormatter(){
    }

    public static String format(String firstName, String lastName) {
        String nameFormatted = String.format("%s %s", firstName,lastName);
        return nameFormatted;
    }

    public static String format(String prefix,
                                String firstName,
                                String middleName,
                                String lastName,
                                String suffix) {
        return "";
    }

    public static String format(String fullName) {
        return "";
    }
}
