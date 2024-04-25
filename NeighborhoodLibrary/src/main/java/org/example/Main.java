package org.example;
import java.util.*;

public class Main {

    public static Books[] booksAvailable = new Books[20];

     public static void welcomeScreen(){
    System.out.println("""
            What would you like to do?
              1. Display all books
              2. Display Checked Out Books
              3. Check out book
              4. Check in book
              5. Exit Library
              """);
}
    public static void checkOutBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("To check out a book, please enter the title.");
        String bookTitle = scanner.nextLine();
        String borrower = "";
        for(Books bookRec: booksAvailable) {
           if(bookTitle.equals(bookRec.title) ){
               bookRec.setCheckedOut(true);
               bookRec.setIsCheckedOutTo(borrower);
           }

        }
        System.out.println("Please enter your name : ");
borrower = scanner.nextLine();

        System.out.println("This book is now checked out by: " +  borrower);

    }
    public static void createBooks(){
        booksAvailable[0] = new Books(21111, "3df455", "Hair Architecture", true, "z ");
        booksAvailable[1] = new Books(21112, "3df455", "Stokely Speaks", false, " ");
        booksAvailable[2] = new Books(21113, "3df455", "More than just a Tee Shirt", false, " ");
        booksAvailable[3] = new Books(21114, "3df455", "Outliers", false, " ");
        booksAvailable[4] = new Books(21115, "3df455", "Websters Dictionary", false, " ");
        booksAvailable[5] = new Books(21116, "3df455", "The Warriors", false, " ");
        booksAvailable[6] = new Books(21117, "3df455", "The Outsiders", false, " ");
        booksAvailable[7] = new Books(21118, "3df455", "Holes", false, " ");
        booksAvailable[8] = new Books(21119, "3df455", "Dancing Body, Thinking Mind", false, " ");
        booksAvailable[9] = new Books(21101, "3df455", "Paradise Lost and Regained", false, " ");
        booksAvailable[10] = new Books(21103, "3df455", "The Prince", false, " ");
        booksAvailable[11] = new Books(21103, "3df455", "The Autobiography of Malcolm X", false, " ");
        booksAvailable[12] = new Books(21104, "3df455", "Code: The Hidden Language of Computer Hardware and Software", false, " ");
        booksAvailable[13] = new Books(21105, "3df455", "iWoz", false, " ");
        booksAvailable[14] = new Books(21106, "3df455", "Psychology of the Unconcious", false, " ");
        booksAvailable[15] = new Books(21107, "3df455", "Divina Proportione", false, " ");
        booksAvailable[16] = new Books(21108, "3df455", "The Art of Living a Meaningless Life", false, " ");
        booksAvailable[17] = new Books(21109, "3df455", "Blink: The Power of Thinking Without Thinking", false, " ");
        booksAvailable[18] = new Books(211100, "3df455", "Not Without Laughter", false, " ");
        booksAvailable[19] = new Books(2111001, "3df455", "Never Die Alone", false, " ");


    }
    public static void checkInBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the title of the book you want to check in : ");
        String title = scanner.nextLine();
        for(Books books: booksAvailable){
            if(title.equals(books.title)){
                books.isCheckedOut = false;
            }
        }
        System.out.println("Thank you for checking in " + title + ".");

    }

    public static void displayAllBooks() {
        System.out.println("Available Books \n ---------------");
        for (Books book : booksAvailable) {
            if(!book.isCheckedOut()) {
                System.out.println("Title: " + book.title + "\n" + "ID number: " + book.idNumber + "\n" + "ISBN Number : " + book.isbnNumber + "\n-----------------------");
            }
        }
    }

    public static void displayCheckedOutBooks(){
        System.out.println("Checked Out Books \n ---------------");

        for (Books book : booksAvailable) {
    if(book.isCheckedOut){
        System.out.println("Title: " + book.title + "\n" + "ID number: " + book.idNumber + "\n" + "ISBN Number : " + book.isbnNumber + " \n Borrower : "  + book.isCheckedOutTo + "\n-----------------------");
    }
            }
    }

    public static void main(String[] args){
            createBooks();

            Scanner scanner = new Scanner(System.in);
do {
    System.out.println("""
            What would you like to do?
              1. Display all books
              2. Display Checked Out Books
              3. Check out book
              4. Check in book
              5. Exit Library
              """);
    int choice = scanner.nextInt();

    switch (choice) {
        case 1:
            displayAllBooks();
            welcomeScreen();
            break;


        case 2:
            displayCheckedOutBooks();
            welcomeScreen();
            break;


        case 3:
            checkOutBook();
            welcomeScreen();

            break;
        case 4:
            checkInBook();
            welcomeScreen();

            break;
        case 5:
            scanner.close();
            break;

        default:
            System.out.println("You did not follow one of the commands. ");
            welcomeScreen();


    }
} while (scanner.hasNext());


    }
}