package libraryItems.factory;

import libraryPatrons.IPatron;
import libraryPatrons.Patron;
import libraryPatrons.Sex;

public final class PersonBuilder {
    public static IPatron createPatron(String firstName, String lastName, Sex sex, int age, String email) {
        return new Patron(firstName, lastName, sex, age, createLibraryId(firstName, lastName), email);
    }

    private static String createLibraryId(String firstName, String lastName) {
        return String.format("%s%s%s", firstName.substring(0, 1), lastName, Math.random());
    }
}
