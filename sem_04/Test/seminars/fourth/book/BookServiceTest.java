package seminars.fourth.book;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookServiceTest {

    private BookRepository bookRepository;
    private BookService bookService;

    @Test
    public void testFindBookById() {
        // Создание мок-объекта BookRepository
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);

        // Устанавливаем поведение мок-объекта: при вызове метода findById("1") должен вернуться определенный объект Book
        when(bookRepository.findById("1")).thenReturn(new Book("1", "Book1", "Author1"));

        // Вызываем метод findBookById и проверяем, что он возвращает ожидаемую книгу
        Book foundBook = bookService.findBookById("1");
        assertNotNull(foundBook);
        assertEquals("1", foundBook.getId());
        assertEquals("Book1", foundBook.getTitle());
        assertEquals("Author1", foundBook.getAuthor());
    }

    @Test
    public void testFindAllBooks() {
        // Создание мок-объекта BookRepository
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);

        // Устанавливаем поведение мок-объекта: при вызове метода findAll() должен вернуться список книг
        when(bookRepository.findAll()).thenReturn(Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        ));

        // Вызываем метод findAllBooks и проверяем, что он возвращает ожидаемый список книг
        List<Book> allBooks = bookService.findAllBooks();
        assertNotNull(allBooks);
        assertEquals(2, allBooks.size());
        assertEquals("Book1", allBooks.get(0).getTitle());
        assertEquals("Author1", allBooks.get(0).getAuthor());
        assertEquals("Book2", allBooks.get(1).getTitle());
        assertEquals("Author2", allBooks.get(1).getAuthor());
    }
}
