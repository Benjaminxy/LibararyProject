package model;

import java.util.Objects;

public class Book {
    private  String title;
    private String writerName;
    private int quantity;

    public Book(String title, String writerName , int quantity) {
        this.title = title;
        this.writerName = writerName;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }





    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Book otherBook = (Book) obj;

        return Objects.equals(title, otherBook.title)
                && Objects.equals(writerName, otherBook.writerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, writerName);
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", writerName='" + writerName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
