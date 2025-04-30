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







