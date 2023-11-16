package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {

    private final Statistics statistics;

    public MedianAdaptee(Statistics statistics) {
        this.statistics = statistics;
    }

    @Override
    public int averagePublicationYear(Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> books) {
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> books) {
        return statistics.medianPublicationYear(books);
    }
}