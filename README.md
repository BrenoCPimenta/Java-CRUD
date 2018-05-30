# Java-CRUD
A simple tutorial to a simple Java CRUD (Create, Read, Update and Delete)

We will use Java; Eclipse IDE; Maven to manage our dependencies; MariaDB and JDBC for DataBase; JUnit for the tests.

#### What you need:
	> MariaDB installed and configured. If you want, you can use MySQL, makes no diference,I will let a MySQL.txt file that explains the basics on linux.
	> Java up and running. I will use maven, just to keep with the best practicies, but isn't necessary.
 
#### Step by Step:
	> Create a table called garden in a database called plants. I will let a CreatingTable.txt file with the comands.
	> Create a Maven Project on Eclipse.
	> Now go into maven repository site and search for the JDBC of MariaDB and add the dependency to the pom file.
	> Now lets create our first class BaseDAO, that will be responsible to connect to our DataBase using the JDBC.
			>It consists on a Builder that activates the drivers and a method that uses the URL to the DataBase, the User and the password, to create a connection.

	>Our second class will be Garden, that will be responsible for the Getters and Setters
			>Will be Serializable
			>Our variables and their types, must be coherent with the ones we created in the DataBase
			>We will finish overriding the method toString, so that it returns all of our information in a string that we formated

	>Our third class will be GardenDAO, that will inherit our method get connection, so we can create new methods that open connections and manipulate our data.
			>A Method 'createPlant' that gets a result of a executed query on the database and transforms into a object
			>A Method 'getPlantById'
			>A Method 'findByName'
			>A Method 'getPlnts'
			>A Method 'getGeneratedId' to see the ID of the recent added plant
			>A Method 'savePlant' to add or update
			>A Method 'deletePlant'

	>Our last class will be GardenService, since its not a good practice access directily the DAO layer, we will use this class.  
	>Now we will start the tests, first creating a new Source Folder called src-test, and inside it a JUnit Test Case Class.
	>Our first method of test will be testPlantList. We need to add a new plant called "Plant 1" in the table so we can find it by name, using the method. You can use the next query: INSERT INTO garden (plant) VALUES ("Plant1");

	>We can see if it works, if everything is right, we can now move on to our final and complet method.

	>Final method: testSaveDeletePlant 
			>We will create a plant object;
			>Save it in the table (DataBase);
			>Search for it on the DataBase, to see if it worked;
			>Verify the AutoIncremented id;
			>Then update this plant we added withanother name and verify;
			>For last, we will delete the plant, and verify if it worked again;



			## Now we have a Create, Read, Update and Delete aplicantio in Java!
 


	
