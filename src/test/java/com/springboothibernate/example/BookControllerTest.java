package com.springboothibernate.example;

import com.springboothibernate.example.controllers.BookController;
import com.springboothibernate.example.models.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookControllerTest {

    @Autowired
    private BookController bookController;

    @Test
    public void test() {
        List<Book> books = bookController.list();

        Assert.assertEquals(books.size(), 3);
    }
}
