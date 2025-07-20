public class Library {

String[] books = new String[5];
boolean[] issued = new boolean[5];
int count = 0;

public void addBook(String bookName) {

if(count < books.length) {

books[count] = bookName;
issued[count] = false;
System.out.println("Book added: "+ bookName);
count++;

}
else {

System.out.println("Library is full");

}
}

public void issueBook(String bookName) {


for(int i=0;i<count;i++){

if(books[i].equalsIgnoreCase(bookName)) {


if(!issued[i]){

issued[i] = true;
System.out.println("Book issued: " +bookName);

}

else {

System.out.println("Book not found: "+ bookName);
}

return;

}

}


System.out.println("Book not found: "+bookName);


}

public void removeBook(String bookName) {

for(int i=0;i<count;i++){

if(books[i].equalsIgnoreCase(bookName)) {

System.out.println("Book removed: " + bookName);

for(int j=i;j<count-1;j++){

books[j] = books[j+1];
issued[j] = issued[j+1];


}


books[count - 1] = null;
issued[count - 1] = false;
count--;
return;

}

}

System.out.println("Book not found: " + bookName);

}



public void showBooks() {


System.out.println("\nLibrary Books:");
for(int i=0;i<count;i++){

String status = issued[i] ? "(Issued)" : "(Available)";
System.out.println("- " + books[i] + " " + status);


}

}



public static void main(String[] args) {


Library lib = new Library();

lib.addBook("Java");
lib.addBook("Python");
lib.addBook("C++");


lib.showBooks();

lib.issueBook("Java");
lib.showBooks();


lib.removeBook("Python");
lib.showBooks();

}

}