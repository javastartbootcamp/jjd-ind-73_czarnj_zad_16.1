package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonManager {
    public void run(Scanner scanner) {
        showMenu();
        Season season = getSeasonFromUser(scanner);
        showMonths(season);
    }

    private void showMonths(Season season) {
        if (season == null) {
            System.out.println("Nie ma takiej pory roku");
        } else {
            System.out.println("W tej porze roku są następujące miesiące:");
            System.out.println(Arrays.toString(season.getMonths()));
        }
    }

    private Season getSeasonFromUser(Scanner scanner) {
        String input = scanner.nextLine().toLowerCase();
        for (Season season : Season.values()) {
            if (season.getPolishName().equals(input)) {
                return season;
            }
        }
        return null;
    }

    private void showMenu() {
        System.out.println("Podaj porę roku:");
        for(Season season : Season.values()) {
            System.out.println(season.getPolishName());
        }
    }

}
