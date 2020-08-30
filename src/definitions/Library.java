/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] availableBook;  //Field

    // Create a Constructor for Library class.
    public Library() {
        this.availableBook = new Book[6];
        for (int i = 0; i < availableBook.length; i++) {
            availableBook[i] = new Book();
        }
    }

    public Library(Book[] availableBook) {
        this.availableBook = availableBook;
    }

    // Create a getter method() for private fields.

    public Book[] getAvailableBook() {
        return availableBook.clone();
    }

    // Create a setter method()
    public void setAvailableBook(Book[] availableBook) {
        this.availableBook = availableBook;
    }
    // toString()

    @Override
    public String toString() {
        return Arrays.toString(availableBook);
    }

    // equals() and hashCode() method.

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o) {
            return false;
        }
        Library that = (Library) o;
        return Arrays.equals(getAvailableBook(), that.getAvailableBook());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getAvailableBook());
    }

}
