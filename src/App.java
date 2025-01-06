public class App {
    public static void main(String[] args) {
        System.out.println("Классы");
        Author one = new Author("Евгений", "Замятин");
        Author two = new Author("Джордж", "Оруэлл");
        Book first = new Book("1984", two, 1934);
        Book second = new Book("МЫ", one, 1924);
        System.out.println("Первая книга на полке: '" + first.getName() + "', " +
                first.getAuthor().getSurname() + ". Год издания, " + first.getYear());
        System.out.println("Вторая книга на полке: '" + second.getName() + "', " +
                second.getAuthor().getSurname() + ". Год издания, " + second.getYear());
        second.setYear(1991);
        System.out.println("Третья книга на полке: '" + second.getName() + "', " +
                second.getAuthor().getSurname() + ". Год издания, " + second.getYear());
    }
}