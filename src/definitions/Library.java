/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

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
}
