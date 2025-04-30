CSI142 GROUP ASSIGNMENT 
Domain and OOP Design
PROJECT: University library online system 
Group members:
Rethabile (202402341)
Emmanuel (202403199)
Ayesha (202403998)
Tshegofatso (202400081)
Wazha (202402992)

1. Minimal Domain Setup
● Rationale: Online system for a University Library in which book keeping data is manipulated and updated according to changes that would occur in the library.
● We decided to create 2 utility classes thus far: Book.java and Author.java
● Encapsulation: We have included necessary private fields, and methods such as getters and setters 
● Polymorphism: We plan to add subclasses to our "Book.java" class

2. GitHub setup
● Repository name: WATER
● Link: https://github.com/Vmachine23/WATER.git
● Each group member has made commits 

3. Next Steps (End Week 1)
•Add a selection sorter to sort by different Book field types (author, serialnumber and title), and either a linear search or binary search to search these book fields(to be decided).

WEEK 2

NB: We made changes to the week one utility classes by deleting author class and kept it as a field 

1 Selection and Insertion Sorter
● We made two insertion sorter methods and one selection sorter for serial number. They were placed in one class called UtilitySorter.java

2 Linear and Binary Searcher
● We made a class called UtilitySearcher.java
that holds one Binary search method for the serial number and three Linear search methods for title author first name and last name

3 Integration 
● We made a Library class which is an ArrayList  that stores the data for the book
● We added a switch which allows students using the system to search for books available by title, serialnumber or by author 
● Main App created has switch and declared objects structured to allow user to choose

4 Custom Exception


5 Next Steps (End of Week 2)
○ We are going to add arguments to create Admin mode as well as add final updates to the code

FINAL WEEK
CSI142 GROUP ASSIGNMENT 
Group members:
Rethabile Kevin Thabo (202402341) 
Emmanuel Tshegofatsho Dube (202403199)
Ayesha Asante Samoki (202403998)
Tshegofatsho Angela Gaolebe (202400081)
Wazha Karabo Vati (202402992)
Chosen Domain: University library online system 
Domain Scenario & Class Structure
•	Rationale: A library online system that allows student to look for available books in the library with ease.
•	Essentially the system has two modes for the student and administrator. The administrator adds books and monitors books in the library. The student searches for a book after looking at the list of books and checks out a book that they need.

Class Structure
1.	The first class is the Books.java class which contains the following fields 
•	Title
•	Serial number
•	Author first and last name
•	Age 
It also has a constructor with getters and setters for each field.
2.	Next is the Library.java class which contains a custom made, Array-List that stores books available in the library there. It has two method namely addBooks () which adds new books to the library and displayBooks() which shows books available in the library.  
3.	We have a UtilitySorter.java class which contains four sorter methods for both insertion and selection sorters.
4.	There is a UtilitySearcher.java class that also has four searcher methods with linear and binary searching methods.
5.	There is a InvalidInputException.java class that uses try and catch to locate errors.
6.	Lastly a MainTest.java class which contains a switch and argument for the student and administration mode test all the classes we have created.
Sorting & Searching Approach
1.	Sorting: There are three insertion sorter methods for the book title, author last name and first name in ascending order. Lastly a selection sorter for the serial number of the book. We decided to use insertion sorting for string data as it is much convenient while the selection sorter is for the serial number as it looks for minimum value.

2.	Searching: We used the binary searcher for the serial number as it is binary data and the linear searcher for the string type data being the book title and author last and first name.

Custom Exception Usage
The custom-made exception we made is called InvalidInputException.java which uses try and catch to return an error message when an invalid input choice is entered by user as well as one to return an error message when an invalid serial number is inputted by user.
Instructions for Running the MainTest.java App
1.	First compile using suitable app (Visual Studio code or Command Line Interface app available on your pc) type command javac Books.java Library.java UtilitySorter.java UtilitySearcher.java InvalidInputException.java or javac . * java to compile all file at once
2.	Next run the main app by typing java MainTest admin ( to access administrator mode) and  java MainTest to get to default student mode 
3.	Next follow prompts shown after the code runs by putting an integer or string.

That is the end of our code.










