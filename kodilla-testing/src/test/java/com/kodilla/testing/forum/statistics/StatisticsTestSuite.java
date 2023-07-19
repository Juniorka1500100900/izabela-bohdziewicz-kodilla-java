package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    private Statistics statisticsMock;
    private ForumStatistics forumStatistics;


    @BeforeEach
    public void beforeTest(){
        statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<11; i++){
            listMock.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(40);
        forumStatistics = new ForumStatistics();
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroPosts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getPostsQty());
        assertEquals(0, forumStatistics.getPostsAvgPerUser(),0.01);
        assertEquals(0, forumStatistics.getCommentsAvgPerPost(),0.01);

    }

    @Test
    public void testCalculateAdvStatisticsWithThousandPosts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, forumStatistics.getPostsQty());
        assertEquals(91, forumStatistics.getPostsAvgPerUser(), 0.1);
        assertEquals(0.04, forumStatistics.getCommentsAvgPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroComments(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getCommentsQty());
        assertEquals(0, forumStatistics.getCommentsAvgPerUser());
        assertEquals(0, forumStatistics.getCommentsAvgPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(8);
        when(statisticsMock.postsCount()).thenReturn(10);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(10, forumStatistics.getPostsQty());
        assertEquals(8, forumStatistics.getCommentsQty());
        assertEquals(1, forumStatistics.getPostsAvgPerUser(),0.1);
        assertEquals(0.8, forumStatistics.getCommentsAvgPerUser(),0.1);
        assertEquals(0.8, forumStatistics.getCommentsAvgPerPost(),0.1);
    }

    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts(){
        //Given

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(20, forumStatistics.getPostsQty());
        assertEquals(40, forumStatistics.getCommentsQty());
        assertEquals(1.8, forumStatistics.getPostsAvgPerUser(),0.1);
        assertEquals(3.7, forumStatistics.getCommentsAvgPerUser(),0.1);
        assertEquals(2, forumStatistics.getCommentsAvgPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroUsers(){
        //Given
        List<String>listMock = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0.0, forumStatistics.getUsersQty());
        assertEquals(0.0, forumStatistics.getPostsAvgPerUser());
        assertEquals(0.0, forumStatistics.getCommentsAvgPerUser());

    }

    @Test
    public void testCalculateAdvStatisticsWithHundredUsers(){
        //Given
        List<String> listMock = new ArrayList<>();
        for(int i=0; i<100; i++){
            listMock.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getUsersQty());
        assertEquals(0.2, forumStatistics.getPostsAvgPerUser());
        assertEquals(0.4, forumStatistics.getCommentsAvgPerUser());
    }
}
