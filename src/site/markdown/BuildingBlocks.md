# Building Blocks

In this topic we will see about java basics and java data types

List of Topics we are going to see in Java basics are

1. Scope of variables 
2. Structure of Java Class
3. Import Java packages
4. components of Java such as platform independence, object orientation, encapsulation, etc

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

Class without `public` keyword by default it will be `public`

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
```

* Lines 1 and 2 are redundant because everything in java.lang is automatically considered to be imported.
* Line 4 is also redundant in this example because Random is already imported from java.util.Random.


#### Question??

Can you tell what import will work for below code snippet?

```java
public class Thiru {
   public void read(Files files) {
      Paths .get("profileSpoolDirectory");
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

```

### Order of Initialization

* Fields and instance initializer blocks are run in the order in which they appear in the file
* The constructor runs after all fields and instance initializer blocks have run.

[InstanceInitializer - Example 1](C:\Users\$reference\javaExercise\src\main\java\InstanceInitializerWithObjInstance.java)

[InstanceInitializer - Example 2](C:\Users\$reference\javaExercise\src\main\java\InstanceInitializerWithoutObjInstance.java)

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

#### Example to use `static` modifier:

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
        ...
}
```

### Hands-On

Create a number of schoolbag objects and assign each a serial number using variable ID, beginning with 1 for 
the first object. This ID number is unique to each object and is therefore an instance variable.
At the same time, you need a field to keep track of how many schoolbag objects have been created so that you know 
what ID to assign to the next one. Such a field is not related to any individual object, but to the class as a whole. 

[numberOfSchoolBags - Example 1](C:\Users\$reference\javaExercise\src\main\java\NumberOfSchoolBags.java)

A common use for static methods is to access static fields. For example, we could add a static method to the schoolBag
class to access the numberOfSchoolBag static field:

```java
public class NumberOfSchoolBags {
    // Highlight Code ---
    public static int getNumberOfSchoolBags() {
        return numberOfSchoolBags;
    }
}
```

### Distinguishing Between Object References and Primitives

Two type of Data

* Primitive types
* Reference types

### Primitive types

Eight built-in data types 




### Reference Types

### Declaring and Initializing Variables

### Declaring Multiple Variables

### Identifiers

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

### Understanding Default Initialization of Variables

#### Local Variables

#### Instance and Class Variables

### Understanding Variable Scope

### Ordering Elements in a Class

### Destroying Objects

* All Java objects are stored in your program memory’s heap. The heap, which is also
referred to as the free store, represents a large pool of unused memory allocated to your
Java application.
* Java provides a garbage collector to automatically look for objects that aren’t needed anymore.
* The heap may be quite large, depending on your environment, but there is
  always a limit to its size. If your program keeps instantiating objects and leaving them on
  the heap, eventually it will run out of memory.

#### Garbage Collection

#### finalize()