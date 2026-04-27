package com.maxim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Utility {
    public static void sortReposByStars(ArrayList<Repository> repos) {
        Collections.sort(repos, new Comparator<Repository>() {
            @Override
            public int compare(Repository r1, Repository r2) {
                return Integer.compare(r2.getStars(), r1.getStars());
            }
        });
    }

    public class SafeInput {
        public static int getInt(Scanner sc) {
            while (true) {
                try {
                    String input = sc.nextLine();
                    return Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Try again: ");
                }
            }
        }

    }

    public class InputValidator {
        public static boolean isValidUsername(String username) {
            if (username == null || username.isEmpty()) {
                return false;
            }

            return username.matches("^[a-zA-Z0-9-]{1,39}$")
                    && !username.startsWith("-")
                    && !username.endsWith("-");

        }
    }
}
