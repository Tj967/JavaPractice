package Test;

public class TestBook {
        public static void main(String[] args) {
            Book book = new Book();
            book.setIsbnid(5);
            book.setAuthorName("author1");
            book.setBookName("test book");
            System.out.println(book);
        }

}
