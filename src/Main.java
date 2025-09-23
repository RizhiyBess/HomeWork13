//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Гарри Поттер и филосовский камень", new Author("Джоан", "Роулинг"), 1997);
        System.out.println("book = " + book.getTitleBook() + " " + book.getAuthor() + " " + book.getYearPublication());

        Book book1 = new Book("Властелин колец", new Author("Джон", "Толкин"), 1954);
        System.out.println("book1 = " + book1.getTitleBook() + " " + book1.getAuthor() + " " + book1.getYearPublication());
        book1.setYearPublication(1960);
        System.out.println("book1 = " + book1.getTitleBook() + " " + book1.getAuthor() + " " + book1.getYearPublication());
        System.out.println(book1);
        System.out.println(book);
    }
}