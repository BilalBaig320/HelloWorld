public class Library {
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books=0;
    }
    void addBook(String add_Book){
        this.books[no_of_books]=add_Book;
        no_of_books++;
        System.out.println(add_Book+" has been added!");
    }
    void showAvailableBooks(){

        for(int i=0;i<this.books.length;i++){
            if(this.books[i] == null){
                continue;
            }
                System.out.println("* "+books[i]);

        }
    }
    void returnBook(String book){
        addBook(book);
    }
    void issueBook(String book){

        for (int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
            else {
                System.out.println("This book does not exist");
            }
        }
        System.out.println("This book does not exist");
    }
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
        Library collegeLibrary = new Library();
        collegeLibrary.addBook("Think and grow rich");
        collegeLibrary.addBook("Data Structure");
        collegeLibrary.addBook("C++");
        collegeLibrary.showAvailableBooks();
        collegeLibrary.issueBook("C++");
        collegeLibrary.showAvailableBooks();
    }
}
