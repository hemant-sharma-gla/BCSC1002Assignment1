/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String nameOfTheBook;
    private String nameOfTheAuthor;
    private String ISBNNumber;

    //create a Constructor Method tp initialize the fields of an object.

    public Book() {
        this.nameOfTheBook = "Core Java";
        this.nameOfTheAuthor = "N. Rao";
        this.ISBNNumber = "9788177228366";
    }

    public Book(String nameOfTheBook, String nameOfTheAuthor, String ISBNNumber) {
        this.nameOfTheBook = nameOfTheBook;
        this.nameOfTheAuthor = nameOfTheAuthor;
        this.ISBNNumber = ISBNNumber;
    }
    //public Book(String nameOfTheBook) {
    //  this.nameOfTheBook = nameOfTheBook;
    //  this.nameOfTheAuthor = "N P Bali";
    //  this.ISBNNumber = "1234567891234";
    //}

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public String getNameOfTheAuthor() {
        return nameOfTheAuthor;
    }

    public void setNameOfTheAuthor(String nameOfTheAuthor) {
        this.nameOfTheAuthor = nameOfTheAuthor;
    }

    public String getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    //create toString() method to convert the Object to a String.

    public String toString() {
        return "Name of the book: " + getNameOfTheBook() + ", " +
                "Name of the author of the book: " + getNameOfTheAuthor() + ", " +
                "ISBN number of the book: " + getISBNNumber() + ".";
    }

    /**
     * create the equals() method.
     * book1.equals(book2).
     * book1 : English, book2 : null
     * book1===> this
     * book2===> o
     **/
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
