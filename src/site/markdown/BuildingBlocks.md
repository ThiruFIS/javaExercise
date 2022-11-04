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

## JVM - Java Virtual Machine

```java
public class Thiru {
   public static void main(String[] args) {
   System.out.println(args[0]);
   System.out.println(args[1]);
   } 
}
```