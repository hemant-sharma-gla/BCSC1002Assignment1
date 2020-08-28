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
}
