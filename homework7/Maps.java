package homework7;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

    public void addToReportBook() {
        Map<LocalDate, String> reportBook = new TreeMap<>();

        reportBook.put(LocalDate.of(2019, 5, 29), "Kritik der reinen Vernunft");
        reportBook.put(LocalDate.of(2019, 10, 17), "Kolobok");
        reportBook.put(LocalDate.of(2019, 11, 25), "Robinson Crusoe");
        reportBook.put(LocalDate.of(2019, 22, 11), "Hypnos");
    }

    public void printDateOfReadingBooks(Map<LocalDate, String> reportBook) {
        System.out.println("The days of read books are " + reportBook.keySet());
    }

    public void printTitlesOfBooks(Map<LocalDate, String> reportBook) {
        System.out.println("The titles of read books are" + reportBook.values());
    }
}















