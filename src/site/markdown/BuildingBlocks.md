# Building Blocks

In this topic we will see about java basics and java data types

List of Topics we are going to see in Java basics are

1. Scope of variables 
2. Structure of Java Class
3. Import Java packages

List of topics we are going to see in Java data types are

1. Declare and initialize variables
2. Differentiate between object reference variables and primitive variables
3. How to read and write object fields
4. Object Life cycle

## Java Class Structure

A class are basic building blocks, you describe all the parts and characteristics of one of those building blocks.

An object is a runtime instance of a class in memory.

A Simple example of creating Class

```java
public class Thiru {
}
```

## Fields and Methods

Java classes have two primary elements

1. Fields - also knows as variables
2. Methods - often called as functions and procedures in other languages

Both are member of class.

Variables hold the state of that program, methods will operate on that state.

If you see below simple Java program, there a some keyword

1. `Public` -> means it can be used from other classes.
2. `class` -> means you are defining a class.

```java
public class Thiru {
}
```
so class name is -> `Thiru`

```java
public class Programmer {
    String name;
    public String getProgrammerName() {
        return name;
    }
    
    public void setProgrammerName(String newName) {
        name = newName;
    }
}
```

1. We declared a method `getProgrammerName()` with a public scope, so it can be called from other class.
2. There is another keyword `return` in method `getProgrammerName()` which return `String`, it means it return a string value stored in variable `name`
3. In method `setProgrammerName()` there is a special keyword `void` -> means no value at all is returned
4. In method `setProgrammerName()` there is a mandatory input parameter `newName` is required to call this method. This means the caller should pass in one String parameter and expect
   nothing to be returned.

```java
public int numberVisitors(int month)
```

Can you guess what is return type and parameter for this method?

## Comments

### Single Line Comment

```java
// comment until end of line
```

### Multiple Line Comment

```java
/* Multiple
* line comment
  */
```

```java
/**
* Javadoc multiple-line comment
* @author Thiru
  */
```
This comment is similar to a multiline comment except it starts with /**. This special syntax tells the Javadoc tool to pay attention to the comment.


### Classes

Class without `public` keyword by default it will be `default` in runtime i.e it can be used only in same package.

```java
class Thiru {
   String name;
}
```

Two Class in a single File is valid, most one of the classes in the file is allowed to be public. Later, we will discuss non-public access.

File name - Thiru
```java
public class Thiru {
    private String name;
}
class Thiru2 {
}
```

Below code is not possible with file name 
```java
public class Thiru {
    private String name;
}
public class Thiru2 {
}
```

## main() method

* It is a gateway between the startup of a Java process, which is managed by the Java Virtual Machine (JVM)
* Beginning of the programmer’s code

```java
public class Thiru {
   public static void main(String[] args) {
   }
}
```

## JVM - Java Virtual Machine

* After Compile, result is a file of bytecode
* Bytecode consists of instructions that the JVM knows how to execute
* JVM calls on the underlying system to allocate memory and CPU time

```java
public class Thiru {
   public static void main(String[] args) {
   }
}
```

`Strings[] args` -> is an array which is a fixed-size list of items that are all same type.

we can write String[] args, String args[] or String... args; the compiler accepts any of these. 
Once JVM started, it understands variable name args which contain list of values.

```java
public class Thiru {
   public static void main(String[] args) {
   System.out.println(args[0]);
   System.out.println(args[1]);
   } 
}
```

## Understanding Package Declarations and Imports

Java comes with thousands of built-in classes and all these classes are added in packages.

For example for source code listed below, java compiler will throw error that `Random cannot be resolved to a type`

```java
public class Thiru {
   public static void main(String[] args) {
   Random r = new Random(); // DOES NOT COMPILE
   System.out.println(r.nextInt(10));
   }
}
```
### import

Import statements tell Java which packages to look in for classes, we didnt tell which package `jdk` did not understand this class.

```java
import java.util.Random; // import tells us where to find Random
public class Thiru {
   public static void main(String[] args) {
   Random r = new Random(); // DOES NOT COMPILE
   System.out.println(r.nextInt(10));
   }
}
```

* Package names are hierarchical, like in a letter first we see from which country it arrives
* Package names are mostly letters or numbers separated by dots
* If it begins with java or javax, this means it came with the JDK

### Child packages

In java for more detailed packages we call as child packages

```java
import com.amazon.java8book;
import com.amazon.java8.my.name; //Child packages
```

### WildCards

Classes in the same package are often imported together.

```java
import java.util.*;
```

* In this example we imported pile of other classes, the * is a wildcard that matches all classes in the package
* Every class in the java.util package is available to this program when Java compiles it.
  * It doesn’t import child packages, fields, or methods; it imports only classes.
  * There is a special type of import called `static import` to import other types

### Static import

I can access the static members of a class directly without class name or any object. 
If you see below example I use sqrt() method of Math class by using Math class i.e. Math.sqrt(),

`Non-Static Import`
```java
public class Thiru {
    public static void main(String[] args)
      {
         System.out.println(Math.sqrt(4)); 
      } 
}
```

`Static Import`
```java
import static java.lang.Math.*;
public class Thiru {
    public static void main(String[] args)
      {
         System.out.println(sqrt(4)); 
      } 
}
```

#### Advantages

* Readability and enhance coding

#### Disadvantageous

* it will lead to confusion and not good for programming

### Note

* Importing many classes doesn't slow down your program, the 'jdk' compiler knows only what
is needed

### Redundant Imports

if you see example listed below, `System` without an import. One special package in the Java world called java.lang. 
which is automatically imported.

```java
import static java.lang.Math.*;
public class Thiru {
   public static void main(String[] args)
   {
   System.out.println(sqrt(4));
   }
}
```

You can find which are redundant from below example

```java
import java.lang.System;
import java.lang.*;
import java.util.Random;
import java.util.*;
public class ImportExample {
    public static void main(String[] args) {
    Random r = new Random();
    System.out.println(r.nextInt(10));
    }
}
```

* Lines 1 and 2 are redundant because everything in java.lang is automatically considered to be imported.
* Line 4 is also redundant in this example because Random is already imported from java.util.Random.

#### Question??

Can you tell what import will work for below code snippet?

```java
public class Thiru {
   public void read(Files files) {
      Paths.get("profileSpoolDirectory");
   }
}
```

`Answer - 1` Using Wild card

```java
import java.nio.file.*;
```

`Answer - 2` Explicit import class

```java
import java.nio.file.Files;
import java.nio.file.Paths;
```

`Answer - 3` will work?

```java
import java.nio.*;
```

It won't work because wildcard only matches class names

`Answer - 4` will work?

```java
import java.nio.*.*;
```

It won't work because you can only have one wildcard, and it must be at the end

`Answer - 5` will work?

```java
import java.nio.files.Paths.*;
```

It won't work because you cannot import methods only class names

### Naming Conflicts

#### Why we use package?

* Class names don’t have to be unique across all of Java

`Example`

```java
public class Conflicts {
   Date date;
   // some more code
}
```

In this example what import we need to use?

```java
import java.util.*; // OR
import java.util.Date;
```

What if we have import already in code as showed below

```java
import java.sql.*;
import java.util.*;
public class Conflicts {
   Date date;
}
```

Class `Date` is found in multiple packages `java.sql.*` and `java.util.*`, java will give compile error. `Date is ambiguous`

How to solve? in example stated above its easy by remove `import java.sql.*;` this issue will be solved, what if we 
need in both case?

```java
import java.sql.*;
import java.util.Date;
public class Thiru {
   Date date;
}
```

How to Solve? Use Two Classes with the Same Name. I need to use class `Date` from both packages `java.sql.Date`, 
`java.util.Date`

I will pick one from import and use the other’s fully qualified class name as showed in example below

```java
import java.util.Date;
public class Thiru {
   Date date;
   java.sql.Date sqlDate;
}
```

OR 

```java
public class Conflicts {
java.util.Date date;
java.sql.Date sqlDate;
}
```

### Creating a New Package

All example stated before in this documentation are in `default package` --> Special unnamed package.

#### How to create a new package

```java
package packagea;
public class ClassA {
}
```

```java
import packagea.ClassA;
public class ClassB {
public static void main(String[] args) {
   ClassA a;
   System.out.println("Got it");
   }
}
```

### Creating Objects

An object is an instance of a class. 

#### Constructors

To create an instance of a class.

```java
import java.util.Random;
public class Class {
   Random r = new Random();
}
```

As showed in above code snippet,
   * Declaring type `Random`
   * Giving variable name `r` to store a reference to the object
   * `new Random()` which actually create the object
   * `Random()` looks like a method since it is followed by parenthesis which called `Constructor`, which is a special
type of method that creates a new object

##### Defining a Constructor

```java
public class Thiru {
   public Thiru() {
   System.out.println("inside constructor");
   }
}
```
Two rules which concludes it's a constructor,
* Name of the constructor matches the name of the class
* There is no return type

`Is this a Constructor?`

```java
public class Thiru {
   public void Thiru() {
   System.out.println("inside constructor");
   }
}
```

Purpose of constructor is to initialize fields as showed in below example,

```java
public class CreditTransaction {
   int TransactionSequence = 0;
   String tranType;
   public CreditTransaction() {
       tranType = "Credit";
   } 
}
```

In most of the classes it's not mandatory to create a constructor, the compiler will supply a `do nothing` which is a default
constructor

### Reading and Writing Object Fields

```java
public class coreBank {
    String productName;                         // instance variable
    public static void main(String[] args) {
        coreBank bank = new coreBank();
        bank.productName = "Profile";            // set variable
        System.out.println(bank.productName);    // read variable
    }
}
```

### Instance Initializer Blocks

The code between the braces is called a `code block`. 
Code blocks appear outside a method is called `instance initializers`

```java
public class coreBank {
    String productName;                         // instance variable
    public static void main(String[] args) {
        coreBank bank = new coreBank();
        bank.productName = "Profile";           // set variable
        System.out.println(bank.productName);    // read variable
    }
    {System.out.println("instance initializers");}  // instance initializers
}
```

### Static Initializer Blocks

`static initializers` is a `code block` resembles a method with no name, no arguments, and no return type. 
The code in a `static initializer` block is executed by the java virtual machine when the class is loaded.

```java
public class Demo {
    static int[] numArray = new int[10];
    static {
        System.out.println("Running static initialization block.");
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (100.0 * Math.random());
        }
    }
}
```

### Order of Initialization

* Fields and instance initializer blocks are run in the order in which they appear in the file
* The constructor runs after all fields and instance initializer blocks have run.

[InstanceInitializer - Example 1](C://Users//$reference//javaExercise//src//main//java//InstanceInitializerWithObjInstance.java)

[InstanceInitializer - Example 2](C://Users//$reference//javaExercise//src//main//java//InstanceInitializerWithoutObjInstance.java)

Code order matters for the fields and blocks of code. 

```java
public class CodeOrderMatters {

    // Doesnot Compile
    {System.out.println( printVariable1);}
    {System.out.println( printVariable2);}

    // Short note - Single quotes for literal Char fields and double quotes for literal Strings
    char printVariable1 = 'a';
    String printVariable2 = "test1";
    public static void main(String args[]) {

    }
}
```

```java
public class CodeOrderMatters {
    
    {System.out.println( printVariable1);}
    {System.out.println( printVariable2);}

    // These fields are called static fields or class variables
    static char printVariable1 = 'a';
    static String printVariable2 = "test1";

    public static void main(String args[]) {

    }
}
```

Why ? Because `static` modifier (static fields or class variables) are associated with a class rather than any other
object. Every instance of a class shares a class variable which is one fixed location in memory.

### Distinguishing Between Object References and Primitives

Two type of Data

* Primitive types
* Reference types

### Primitive types

Eight built-in data types

| keyword | Type                        | Example |
|---------|-----------------------------|---------|
| boolean | true or false               | true    |
| byte    | 8-bit integral value        | 123     |
| short   | 16-bit integral value       | 123     |
| int     | 32-bit integral value       | 123     |
| long    | 64-bit integral value       | 123     |
| float   | 32-bit floating-point value | 123.45f |
| double  | 64-bit floating-point value | 123.456 |
| char    | 16-bit Unicode value        | 'a'     |

* float and double are used for floating-point (decimal) values.
* A float requires the letter f following the number so Java knows it is a float.
* byte, short, int, and long are used for numbers without decimal points.
* Each numeric type uses twice as many bits as the smaller similar type. For example, 
  short uses twice as many bits as byte does.

```java
double notAtStart = _1000.00; // DOES NOT COMPILE
double notAtEnd = 1000.00_; // DOES NOT COMPILE
double notByDecimal = 1000_.00; // DOES NOT COMPILE
double annoyingButLegal = 1_00_0.0_0; // this one compiles
```

### Reference Types

* A reference type refers to an object

```java
import java.util.Date;
public class ReferenceType {
    public static void main(String args[]) {
        java.util.Date today;
        String greeting;
        today = new java.util.Date();
        greeting = "How are you?";
    }
}
```

### Key difference between primitive and reference type

`Reference types can be assigned null`

```java
public class FIS {
    int value = null; // DOES NOT COMPILE
    String s = null;
}
```

`Primitive doesnot have methods`

```java
public class FIS {
    String reference = "hello";
    int len = reference.length();
    int bad = len.length(); // DOES NOT COMPILE
}
```

### Declaring and Initializing Variables

A `variable` is a name for a piece of memory that stores data.

#### Declaring a variable

```java
public class Thiru {
    int a1;
}
```

#### Initialize a variable

```java
public class Thiru {
    int a1 = 0;
}
```

### Declaring Multiple Variables

You can declare and initialize multiple variables in same statement.

```java
public class Thiru {
   String s1, s2;
   String s3 = "yes", s4 = "no";
   // i1, i2 are declared and i3 is initialized
   int i1, i2, i3 = 0;
   
   // Doesnot compile
   // int num, String value;
}
```

You can find what are possible allowed declaration

```java
public class Thiru {
    boolean b1, b2;
    String s1 = "1", s2;
    double d1, double d2;
    int i1; int i2;
    //int i3; i4; DOESNOT COMPILE
}
```

### Identifiers

Rules for identifiers apply to anything you are free to name, including variables,
methods, classes, and fields.

Three rules we need to follow
* Name should begin with letter or symbol $
* subsequent characters may also be numbers
* We cannot use same name as java reserve word

Java reserved work list

`abstract`
`assert`
`boolean`
`break`
`byte`
`case`
`catch`
`char`
`class`
`const*`
`continue`
`default`
`do`
`double`
`else`
`enum`
`extends`
`false`
`final`
`finally`
`float`
`for`
`goto*`
`if`
`implements`
`import`
`instanceof`
`int`
`interface`
`long`
`native`
`new`
`null`
`package`
`private`
`protected`
`public`
`return`
`short`
`static`
`strictfp`
`super`
`switch`
`synchronized`
`this`
`throw`
`throws`
`transient` 
`true`
`try`
`void`
`volatile`
`while`

[Example](C://Users//$reference//javaExercise//src//main//java//VariableTypes.java)

### Understanding Default Initialization of Variables

Now we will example of Local, instance, and class variables.

#### Local Variables

* A local variable is a variable defined within a method. 
* Local variables must be initialized before use.
* It does not have a default value, and contain garbage data until initialized, So compiler won't allow.

`Example`

```java
public class Thiru {
    public int check() {
        int y = 10;
        int x;
        int reply = x + y; // DOES NOT COMPILE
        return reply;
    }
}
```
`Compile is smart enough`

```java
public class Thiru {
    public int valid() {
        int y = 10;
        int x; // x is declared here
        x = 3; // and initialized here
        int reply = x + y;
        return reply;
    }
}
```

`Compiler will also identify initializations`

```java
public class Thiru {
    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }
}
```

#### Instance and Class Variables

##### Instance variable

* Variables that are defined without the STATIC keyword
* Outside any method declaration are Object-specific

`for example`

```java
class Page {
    public String pageName;
    // instance variable with public access
    private int pageNumber;
    // instance variable with private access
}
```
##### Static variable

You can tell a variable is a class variable because it has the keyword static before it.

`Example`

```java
public class Bicycle {
        
    private int cadence;
    private int gear;
    private int speed;
        
    // add an instance variable for the object ID
    private int id;
    
    // add a class variable for the
    // number of Bicycle objects instantiated
    private static int numberOfBicycles = 0;
}
```

* Local variables—in scope from declaration to end of block
* Instance variables—in scope from declaration until object garbage collected
* Class variables—in scope from declaration until program ends

| Variable Type                           | Default initialization value |
|-----------------------------------------|------------------------------|
| boolean                                 | false                        |
| byte, short, int, long                  | 0                            |
| float, double                           | 0.0                          |
| char                                    | '\u0000' (NUL)               |
| All object references (everything else) | null                         |

### Understanding Variable Scope

How many local variables in below example?

```java
public class Thiru {
    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
        } // bitesOfCheese goes out of scope here
        System.out.println(bitesOfCheese);// DOES NOT COMPILE
    }
}
```

`Example to understand variable scope `

```java
public class FIS {
    public void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            boolean timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }
}
```

### Ordering Elements in a Class

| Element             | Example                 | Required? | Where does it go?             |
|---------------------|-------------------------|-----------|-------------------------------|
| Package             | declaration package abc | No        | First line in the file        |
| Import statements   | import java.util.*      | No        | Immediately after the package |
| Class declaration   | public class C          | Yes       | Immediately after the import  |
| Field declarations  | int value               | No        | Anywhere inside a class       |
| Method declarations | void method()           | No        | Anywhere inside a class       |

```java
package structure; // package must be first non-comment
import java.util.*; // import must come after package
public class Thiru { // then comes the class
    double weight; // fields and methods can go in either order
    public double getWeight() {
        return weight; 
    }
    double height; // another field – they don't need to be together
}
```

In below example there are two issues.

`Issue 1` - package and import statements are reversed. Even though its optional field, package should be first.
`Issue 2` - field declaration is outside class. 

```java
import java.util.*;
package structure; // DOES NOT COMPILE
public class FIS {
    String name; // DOES NOT COMPILE
    public class Thiru { }
}
```

`Note` - We can remember a name `PIC` picture. i.e Package, Import and Class. 

### Destroying Objects

* All Java objects are stored in your program memory’s heap. The heap, which is also
referred to as the free store, represents a large pool of unused memory allocated to your
Java application.
* Java provides a garbage collector to automatically look for objects that aren’t needed anymore.
* The heap may be quite large, depending on your environment, but there is
  always a limit to its size. If your program keeps instantiating objects and leaving them on
  the heap, eventually it will run out of memory.

#### Garbage Collection

Garbage collection refers to the process of automatically freeing memory on the heap by
deleting objects that are no longer reachable in your program.

JVM specifications do not clearly define how to implement the garbage collector. Therefore, 
VMs from different manufacturers can implement the garbage collector in different ways.

There are many algorithms for garbage collection.

For Example:

Most Common garbage algorithm are

`mark-sweep algorithm`

  * Perform 2 Operations
    * Mark
    * Sweep
  * it has a disadvantage of memory fragmentation

[Diagram](C://Users//$reference//javaExercise//src//site//images//mark-Sweep.PNG)

To Solve memory fragmentation 

`Copying algorithm`

  * Available memory into two equally sized semi-spaces
    * Only one semi-space will be active, once semi-space is full then it will be copied to other semi-space
  * It has a disadvantage that only half of the memory can be actually used and cost is too high. 
  
[Diagram](C://Users//$reference//javaExercise//src//site//images//Copying.PNG)

`mark-compact algorithm`

* its same process as like mark-sweep algorithm, it solves disadvantages of mark-sweep and copying.
* This algorithm does not directly clear up the objects that can be garbage-collected. Instead, it moves all 
  living objects to one end, and then reclaims the memory space beyond the end boundary.

[Diagram](C://Users//$reference//javaExercise//src//site//images//mark-compact.PNG)

`Note` Java provides a method called System.gc(), this is only to kick off a garbage collection run, Java is 
fre to ignore the request.

'Important point to remember in garbage collection:'
* The object no longer has any references pointing to it.
* All references to the object have gone out of scope.

## Hands-On

### Build a new Class should print "Hello world"

### Build a new class which create object and do read and write on object fields

### Build a new class with static and instance initializers blocks

### Build a new Class with Local variable, class and static variable

### Build a new Class with package and import