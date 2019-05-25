# NaiveTicket

The second Objects lab, from the BlueJ book's second chapter.

Look for the [Chapter 2 file](./doc/BlueJ-objects-first-ch2.pdf) you need in the [doc](./doc) folder.
There is 35 pages of reading and exercises in the chapter.

Work through all these exercises. You edit this file with your answers for these exercises.

### Exercise 2.1
* Create a TicketMachine object on the object bench.
* Upon viewing its methods, `getBalance`, `getPrice`, `insertMoney`, `printTicket`.
* Use `getPrice` method to view the value of the price of the tickets that was set when this object was created.
* Use `insertMoney` method to simulate inserting an amount of money into the machine.
* Use `getBalance` to check that the machine has a record of the amount inserted.
	* You can insert several separate amounts of money into the machine, just like you might insert multiple coins or notes into a real machine. Try inserting the exact amount required for a ticket. As this is a simple machine, a ticket will not be issued automatically, so once you have inserted enough money, call the `printTicket` method. A facsimile ticket should be printed in the BlueJ terminal window.

### Exercise 2.2
* What value is returned if you check the machine’s balance after it has printed a ticket?

**Answer:** *The balance was 0.*

### Exercise 2.3
* Experiment with inserting different amounts of money before printing tickets.
	* Do you notice anything strange about the machine’s behavior?

	**Answer:** *A ticket is always printed and the balance always printed no matter how much money is inserted.*

	* What happens if you insert too much money into the machine – do you receive any refund?

	**Answer:** *No, you do not receive a refund.*

	* What happens if you do not insert enough and then try to print a ticket?

	**Answer:** *A ticket is printed anyway and the balance is reset to 0.*

### Exercise 2.4
* Try to obtain a good understanding of a ticket machine’s behavior by interacting with it on the object bench before we start looking at how the `TicketMachine` class is implemented in the next section.

### Exercise 2.5
* Create another ticket machine for tickets of a different price.
	* Buy a ticket from that machine.
	* Does the printed ticket look different?

	**Answer:** *Yes, the ticket prints with a different price.*

### Exercise 2.6
* Write out what you think the outer wrappers of the `Student` and `LabClass` classes might look like – do not worry about the inner part.

**Answer:**
```java
public class Student {
	// statements
}

public class LabClass {
	// statements
}
```

### Exercise 2.7
Does it matter whether we write<br>
`public class TicketMachine`<br>
or<br>
`class public TicketMachine`<br>
in the outer wrapper of a class?

* Edit the source of the `TicketMachine` class to make the change and then close the editor window.
	* Do you notice a change in the class diagram?

	**Answer:** *Yes, the **TicketMachine** class fails to compile.*

	* What error message do you get when you now press the compile button?

	**Answer:** Identifier Expected

	* Do you think this message clearly explains what is wrong?

	**Answer:** *A little. I believe public describes the how the declarition type is accessed, but since it is after the class it become the class name which it can't be since it is a reserved word.*

### Exercise 2.8
* Check whether or not it is possible to leave out the word `public` from the outer wrapper of the `TicketMachine` class.

**Answer:** *It is possible.*

### Exercise 2.9
* From your earlier experimentation with the ticket machine objects within BlueJ you can probably remember the names of some of the methods – `printTicket`, for instance.
	* Look at the class definition in Code 2.1 and use this knowledge, along with the additional information about ordering we have given you, to try to make a list of the names of the fields, constructors, and methods in the `TicketMachine` class.
	* Hint: There is only one constructor in the class.

	**Answer:**
		***Fields:** price, balance, total*
		***Constructors:** TicketMachine(int ticketCost)*
		***Methods:** getPrice(), getBalance(), insertMoney(int amount), printTicket()*

### Exercise 2.10
* Do you notice any features of the constructor that make it significantly different from the other methods of the class?

**Answer:** *The constructor initial sets the fields for the object and begins with a capital.*

### Exercise 2.11
* What do you think is the type of each of the following fields?

**Answer in comments**

```java
private int count;              // This is a primative integer
private Student representative; // This is a Student object
private Server host;            // This is a Server object
```

### Exercise 2.12
* What are the names of the following fields?

**Answer in comments**

```java
private boolean alive; // This field is named alive
private Person tutor;  // This field is named tutor
private Game game;     // This field is named game
```
### Exercise 2.13

In the following field declaration from the TicketMachine class<br>

```java
private int price;
```
does it matter which order the three words appear in?

**Answer:** *Yes.*

* Edit the `TicketMachine` class to try different orderings. After each change, close the editor.
	* Does the appearance of the class diagram after each change give you a clue as to whether or not other orderings are
possible?
	
	**Answer:** *If the `int` is in front of private, private becomes a field and it can't compile due to it being reserved word.*

	* Check by pressing the compile button to see if there is an error message.

	**Answer:** *Can't compile since private is a reserved word.*

	* Make sure that you reinstantiate the original version after your experiments!

### Exercise 2.14
* Is it always necessary to have a semicolon at the end of a field declaration?

**Answer:** *Yes, BlueJ won't compile it without a semicolon.*

* Once again, experiment via the editor.
* The rule you will learn here is an important one, so be sure to remember it.


### Exercise 2.15
* Write in full the declaration for a field of type `int` whose name is `status`.

### Exercise 2.16
* To what class does the following constructor belong?
```
public Student(String name)
```

**Answer:** *It belongs to the class Student.*

### Exercise 2.17
* How many parameters does the following constructor have and what are their types?
```
public Book(String title, double price)
```

**Answer:** *There are 2 parameters and their types are String and double respectively.*

### Exercise 2.18
* Can you guess what types some of the `Book` class’s fields might be?

**Answer:** *Some of Book's class types could be String or double.*

* Can you assume anything about the names of its fields?

**Answer:** *There is probably a field dealing with the Title of the book and the cost or price of it.*

Work all Exercises from 2.19 to 2.58 that are **NOT** marked *Challenge exercise*.
READ upto and INCLUDING section 2.15 of this chapter.

### Exercise 2.19
```java
public Pet(String petsName){
	String name = petsName;
}
```

### Exercise 2.21
`getBalance()` and `getPrice()` return different fields from the ticketMachine object.

### Exercise 2.22
`getBalance()` can be characterized as the total money that has been inserted into the machine.

### Exercise 2.23
No, if getBalance is changed to getAmount the return statment in the body does not need to be changed.

### Exercise 2.25
A "No return statement" error

### Exercise 2.26
getPrice uses a return statement while printTicket doesn't return anything. Instead it just prints out a ticket through System.out.println() methods.

### Exercise 2.27
insertMoney and print Ticket do not have return statements. This is because the void keyword specifies a method should not have a return statement.

### Exercise 2.29
setPrice is not a constructor because it has a void return type and it starts with a lowercase

### Exercise 2.30
```java
public void setPrice(int ticketCost){
	price = ticketCost;
}
```

### Exercise 2.31
```java
/**
   * Increase score by the given number of points.
   */
public void increase(int points)
{
	score += points;
}
```

### Exercise 2.32
```java
public void discout(int amount) {
	price -= amount;
}
```

### Exercise 2.35
Each object shows a different price because each ticketMachine is its own instance with its own instance variables.

### Exercise 2.36
changing price to `"price"` will make printTicket print the string price

### Exercise 2.37
The same thing will be printed as the previous exercise.

### Exercise 2.38
No, since everthing is in quotation marks the field price is never called to print the value.

### Exercise 2.39
Objects are created with a fixed price of 1000.

### Exercise 2.40
No, the empty method does not require parameters. empty is a mutator method.

### Exercise 2.41
Yes, setPrice is a mutator

### Exercise 2.43
If inserting the parameter less than 0 into insert money the ticketMachine prints an error message requesting a positive value.

### Exercise 2.44
If the operater is changed to >=, inserting 0 into the ticketMachine will not print an error message.

### Exercise 2.45
the field was called isVisible. This is perfet for a boolean type since visiblity only has two states.

### Exercise 2.46
the Naive Ticket Machine updated the total by the balance which could be a different value than the price of the ticket. It also zeroed out the balance value.

In the Better Ticket Machine, the total and balance are mutated by the price to accurately repersent purchasing a ticket.

### Exercise 2.47
No, due to the if statement, the price can only be subracted from the balance if the balance is larger than the price.

### Exercise 2.48
Artithmetic operators include +, -, *, /, and %

### Exercise 2.49
```java
public void setSaving() {
	saving = discout * price;
}
```

### Exercise 2.50
```java
public void setMean() {
	mean = total / count;
}
```

### Exercise 2.51
```java
public void isWithinBudget() {
	if (price > budget) {
		System.out.println("Too expensive.")
		System.out.println("Takasugimas");
	}
	else {
		System.out.println("Just right");
		System.out.println("Juubun desu");
	}
}
```

### Exercise 2.52
```java
public void isWithinBudget() {
	if (price > budget) {
		System.out.println("Too expensive. Your budget is: " + budget);
		System.out.println("Takasugimas. Yosan wa: " + budget);
	}
	else {
		System.out.println("Just right");
		System.out.println("Juubun desu");
	}
}
```

### Exercise 2.53
This version of the method sets balance to 0 before returning. No matter what the original balance is, it was always be changed before returning.

### Exercise 2.54
The `balance = 0;` statment is unreachable and won't compile. The return statment breaks out of the methods code block so the `balance = 0;` statement is never reached.

### Exercise 2.56
It is both a accessor and a mutator.