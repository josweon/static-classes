package com.pluralsight;

public class NameFormatter {

    private NameFormatter(){
    }

    public static String format(String firstName, String lastName) {
        String nameFormatted = String.format("%s, %s", lastName, firstName);
        return nameFormatted;
    }

    public static String format(String prefix,
                                String firstName,
                                String middleName,
                                String lastName,
                                String suffix) {
        String nameFormatted = String.format("%s, %s %s %s, %s",
                                                lastName,
                                                prefix,
                                                firstName,
                                                middleName,
                                                suffix);
        return nameFormatted;
    }

    public static String format(String fullName) {
        String prefix = null;
        String firstName;
        String middleName;
        String lastName;
        String suffix = null;


        boolean hasPrefix = false;
        String[] tokens = fullName.split(" ");
        if (tokens[0].contains(".")) {
            prefix = tokens[0];
            hasPrefix = true;
        }

        boolean hasSuffix = false;
        int len = tokens.length;

        for (int i = 0; i < len ; i++) {
            if(tokens[i].contains(",")){
                suffix = tokens[len - 1];
                hasSuffix = true;
            }
        }

        String formatted = "";

        if (hasPrefix && hasSuffix) {
            firstName = tokens[1];
            middleName = tokens[2];
            lastName = tokens[3];

            formatted = String.format("%s %s %s %s, %s",
                    lastName,
                    prefix,
                    firstName,
                    middleName,
                    suffix);
        }

        if (hasSuffix && !hasPrefix) {
            firstName = tokens[0];
            middleName = tokens[1];
            lastName = tokens[2];

            formatted = String.format("%s %s %s, %s",
                    lastName,
                    firstName,
                    middleName,
                    suffix);
        }

        if (len == 3) {
            firstName = tokens[0];
            middleName = tokens[1];
            lastName = tokens[2];

            formatted = String.format("%s, %s %s",
                    lastName,
                    firstName,
                    middleName);
        }

        if (len == 2) {
            formatted = format(tokens[0], tokens[1]);
        }

        return formatted;
    }
}