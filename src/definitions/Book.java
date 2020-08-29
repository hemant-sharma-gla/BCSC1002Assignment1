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
}
