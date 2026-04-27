package com.maxim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Utility {
    public static void sortReposByStars(ArrayList<Repository> repos) {
        Collections.sort(repos, new Comparator<Repository>() {
            @Override
            public int compare(Repository r1, Repository r2) {
                return Integer.compare(r2.getStars(), r1.getStars());
            }
        });
    }
}
