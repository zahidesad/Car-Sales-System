# Car-Sales-System

1.	AIM OF THE PROJECT AND REQUIREMENTS 

The aim of this project is to develop a car sales tracking system that can be used to electronically transfer car sales. For the project to work properly, it is necessary to have the JDK (Java Development Kit) and the IDE named Apache NetBeans. In addition, 2 extra libraries (miglayout-4.0.jar / timingframework-0.54.jar) were used in the project. Thanks to these libraries, swing components such as JButton, JTable, JLabel have a more aesthetic appearance and some animation transitions are provided. These libraries must be imported into the project for the project to work properly. You can find the download links of the libraries below: 

miglayout-4.0.jar: http://www.java2s.com/Code/Jar/m/Downloadmiglayout40jar.htm#google_vignette

timingframework-0.54.jar: http://www.java2s.com/Code/Jar/t/Downloadtimingframework054jar.htm

2.	PROGRAM OBJECTS AND RELATIONSHIPS

         2.1) The main purpose of use of object User:
       
- The admin object, dealer objects and customer objects are all associated with the User object.
- Without User it can't be in any of these three types of objects.
- Polymorphism and inheritance are also used in object-oriented concepts thanks to the User object

      2.2) The main purpose of use of object Admin:
- Admin object can delete any car, customer, and dealer from the system.

      2.3) The main purpose of use of object Dealer: 
- Thanks to the Dealer object, cars can be sold.
- Dealer object is one of the most important objects of the project.

      2.4) The main purpose of use of object Customer:
- Thanks to the Customer object, a purchase request can be sent to cars that have been put up for sale.
- The Customer object is one of the indispensable building blocks of the project.

      2.5) The main purpose of use of object Car:
- The Car object contains the properties of the cars to be sold.

      2.6) The main purpose of use of object Database:
- As the name suggests, it is the place where ArrayLists used as database are kept.
- It includes some important methods.

      2.7) The main purpose of use of object ITrigerrer:
- It is an interface designed to notify the system that the panel has changed while making changes to the page. Thanks to this interface, when a new panel is opened, the system is informed.

3. RULES:

Initially, 1 admin, 2 customer and 2 dealer accounts are defined in the system by default. 
You can access the user information from the source codes of the MainFrame in the Main  
package.
      
    3.1) Login and Register Screen Rules:
 
1)	The terms and conditions must be accepted while registering, otherwise it will not be possible to register in the system.

2)	A warning is received if all the fields in the login and register screen are not filled.

3)	A username registered in the system cannot be taken by someone else.

4)	Regex code is written for username, password, name, e-mail, and phone no. So, there are some rules to fill these gaps.

        •	Username Validation Rules:

-The username consists of 6 to 30 characters inclusive.

-The username can only contain alphanumeric characters and underscores (_).

-The first character of the username must be alphabetic character."

       •	Password Validation Rules: 

  -It contains at least 8 characters and at most 20 characters.
  
  -It contains at least one digit.
  
  -It contains at least one upper case alphabet.
  
  -It contains at least one lower case alphabet.
  
  -It contains at least one special character which includes !@#$%&*()-+=^.
  
  -It doesn’t contain any white space.
   
      •	Name Validation Rules:

-It must start with a capital or lowercase letter.

-It must be 2-20 characters long.

-It must not contain any special characters

     •	E-mail Validation Rules:

-It cannot start special characters.

-It must contain @ symbol.

-It something must come after the @ symbol.

     •	Phone Number Validation Rules:

-It should be in the form xxx-xxx-xxxx

-It should not contain any letters

		3.2) Admin Rules:
 
 
5)	Admin can delete customer, dealer, and car.

6)	If the customer's account is deleted by the admin, if that customer has a car with the pending status (When a customer sends a purchase request to a dealer's car, that car becomes pending status, and no other customer can send a purchase request to that car until the dealer deny or accept the offer). The status of this car is changed to available. Thus, the car can be purchased again.

7)	If a dealer account is deleted by the admin, that dealer's cars are deleted from the system even if they are in pending status. The customer has been informed about this issue in the “CustomerMyOrdersPanel.”

8)	If a car is deleted by the admin, it will be deleted even if a purchase request (pending status) has been sent to that car by the customer. If a request has been sent to this car before and this request is denied by the dealer, even if the car is deleted, the customer can see that the purchase request was denied in the "Customer My Orders Panel". If the purchase request sent to the car has been accepted, this car cannot be deleted.

        3.3) Customer Rules:
       
9)	The customer can see all the tools in the system with the help of the filtering system. This filtering system is made with the help of JComboBox.

10)	The customer can see the information of the dealer he chooses from the table, but sometimes even if the dealer account is deleted from the system, it must appear in some tables (For example, if a dealer denied or accepted a purchase request before the dealer account is deleted, that dealer's information will be visible in the table in the customer's My Orders Panel). For this reason, if a dealer whose account has been deleted is selected from the table and clicked on the "dealer information" button, the customer will receive a warning that this account has been deleted.

11)	Customers can send purchase requests to cars, but there are some rules:
- A request cannot be sent to a car with a pending or accepted status.

- For a car to which a purchase request has been sent before, if the purchase request has been denied by the dealer, a second purchase request cannot be sent to that car.

- The car remains in pending status until the purchase request is answered.

12)	The customer can cancel the purchase request if the car to which he/she sent the purchase request is still in the pending status.

13)	Customer can delete their own account.

        3.4) Dealer Rules:
14)	Dealer can add cars.

15)	If a car is in available status, the dealer can delete that car.
	
16)	If the car is in pending status, when the dealer wants to delete the car, he/she gets a warning that he must first respond to the customer's purchase request. After the request is answered, the car can be deleted.
	
17)	If the car is in the accepted status, it cannot be deleted from the system because it has already been sold.
	
18)	The dealer can see the account information of the customer who sent the purchase request to his/her car.
	
19)	The Dealer can either deny or accept the customer's purchase request. If the request is accepted, the car will return to accepted status on all screens. If the request is denied, the car will be denied status on the customer's screen, and available status on other screens. 
	
20)	Dealer can delete his/her own account.

   4. UML DIAGRAM
   
![CarSalesSystemUmlDiagram](https://user-images.githubusercontent.com/116666407/234034651-7eec9b56-a0ef-4d28-870e-e2a300298594.png)


