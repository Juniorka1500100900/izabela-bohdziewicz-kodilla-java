package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();
    public Forum(){
        theForumUserList.add(new ForumUser(666, "Iza Boh", 'K', LocalDate.of(1990, Month.MAY, 15),
                14));
        theForumUserList.add(new ForumUser(875, "Kamil Kupa", 'M', LocalDate.of(1971, Month.JANUARY, 19),
                145));
        theForumUserList.add(new ForumUser(421, "Marek Ogarek", 'M', LocalDate.of(2010, Month.JUNE, 5),
                4));
    }

    public List<ForumUser>getList(){
        return new ArrayList<>(theForumUserList);
    }

}
