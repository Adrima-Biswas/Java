// Book class
class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    void display() {
        System.out.println("Book: " + title);
    }
}

// Library class contains reference to Book (Aggregation)
class Library {
    String name;
    Book[] books;

    Library(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    void showBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.display();
            
        }
        
    }
    
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");
        Book b2 = new Book("Data Structures");

        Book[] bookArray = {b1, b2};

        Library lib = new Library("City Library", bookArray);
        lib.showBooks();
        
    }
    
}

