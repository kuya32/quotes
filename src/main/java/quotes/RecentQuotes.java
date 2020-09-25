package quotes;

public class RecentQuotes {
    public static String numQuotes;
    String author;
    String text;

    public RecentQuotes(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String stringify(int index, RecentQuotes[] array) {
        String rowling = this.toString(array[index].author, array[index].text.replace('\u201C', ' ').replace('\u201D', ' ').trim());
        return rowling;
    }

    public String toString(String text, String author) {
        return text + " - " + author;
    }

    public String getText() {
        return this.text;
    }


}
