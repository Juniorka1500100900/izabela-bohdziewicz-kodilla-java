import com.kodilla.patterns2.adapter.bookclassifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Statistics;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        // given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author1", "Title1", 2000, "Signature1"));
        bookSet.add(new Book("Author2", "Title2", 1995, "Signature2"));
        bookSet.add(new Book("Author3", "Title3", 2010, "Signature3"));

        Statistics statistics = new Statistics();
        MedianAdapter medianAdapter = new MedianAdapter(statistics);

        // when
        int medianYear = medianAdapter.publicationYearMedian(bookSet);

        // then
        assertEquals(2000, medianYear);
    }
}