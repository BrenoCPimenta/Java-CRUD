# Java-CRUD                               
A simple tutorial, to a simple Java CRUD _(Create, Read, Update and Delete)_.

## We will use 

   * **Java**;
   * **Maven** to manage our dependencies;
   * **MariaDB** as DataBase;
   * **JDBC** as interface to connect to the DataBase;
   * **JUnit** for the tests.



## What you need:
	
  * MySQL/MariaDB installed and configured. If you want to use MySQL from Oracle,
  there's no problem, I will let comments on the code and here, saying where you need to change.

  * It will be used Eclipse, it is optional, but the tips on the steps will be directed to it.

  * Java up and running. I will use maven, just to keep with the best practicies, but isn't necessary.


 
## Step by Step:
  * Create a table called garden in a database called plants. I will let a **CreatingTable.txt** file with the comands.

  * Create a Maven Project on Eclipse.

  * Now go into maven repository site and search for MariaDB, it will be the
  "MariaDB java client" and add the dependency to the pom file.
  **HERE** if you are using MySQL you must search instead for "MySQL Connector/J".

  * Following the TDD (Test Driven Development) good practicies, first thing we will be adding into our package, will be a JUnit Test Case, I will call it *_StepByStep*.       **Why:**
    - So we can make methods and test our code as we create it, preventing a lot of Debugging later.
    - Will be in the same package as our main code, because of the protected  getConnection method.
    - It has a underscore in the name, so it gets above our other classes in our source package, a tip from James Shore.

  * Now lets create our first class **BaseDAO**, that will be responsible to connect to our DataBase using JDBC.
    - It consists on a Builder that activates the drivers and a method that uses the URL, the User and the password, to create a connection.

  * **TEST** In _StepByStep_ we will add our first method "testConnection" so we can test our connection first everytime we run the tests.

  * We will add a extra Class called _SimpleDate_, it will be responsile to get our date in Int and transform it into java.sql.Date, because the constructor with int numbers is Deprecated.

  * Our second class will be **Plant**, that will be responsible for the Getters and Setters
    - Will be Serializable.
    - Our variables and their types, must be coherent with the ones we created in the DataBase.
    - Notice in set date we will use the method from _SimpleDate_ Class.
    - We will finish overriding the method toString, so that it returns all of our information in a string that we formated.


  * **TEST** Lets add 2 tests on _StepByStep_, one for the Object and one for the DataBase.
      - Test our object Plant.
        - Add a Private Plant object in the _StepByStep_.
        - Than a method called "testPlantObject" to test getter and setters.
      - Test if we are connecting to the right table.
        - Insert a Plant to our DataBase manually (Query in the createTable file).
        - Now we verify with a connection if it returns correctly to what we ask.
        - I let 2 options on the code, so you can decide what type of query you want to use.

  * Our third class will be **PlantDAO**, that will inherit our method getConnection(), so we can create new methods that open connections and manipulate our data.
    - A Method 'createPlant' that gets a result of a executed query on the database and transforms into a object.
    - A Method 'getPlantById'
    - A Method 'findByName'
    - A Method 'getPlants'
    - A Method 'getGeneratedId' to see the ID of the recent added plant.
    - A Method 'savePlant' to add or update.
    - A Method 'deletePlant'.


  * Now will be the greater **TEST**, new method on _StepByStep_ called: testCreateUpdateDeletePlantDAO() 
    - We will create a plant object;
    - Save it in the table (DataBase);
    - Search for it on the DataBase, to see if it worked;
    - Verify the AutoIncremented id;
    - Then update this plant we added with another name and verify;
    - For last, we will delete the plant, and verify if it worked again;


  * Our last class will be **GardenService**, since its not a good practice to access directily the DAO layer, we will use this class.  


  * Now we will **TEST** a Final method on _StepByStep_: testSaveDeletePlant 
    - We will create a plant object;
    - Save it in the table (DataBase);
    - Search for it on the DataBase, to see if it worked;
    - Verify the AutoIncremented id;
    - Then update this plant we added withanother name and verify;
    - For last, we will delete the plant, and verify if it worked again;


------
### Now we have a _Create, Read, Update and Delete_ applicantion in Java!
 


	
