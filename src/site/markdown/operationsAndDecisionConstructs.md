# String

A string is basically a sequence of characters;

```java
public class FIS {
    String name = "Fluffy";
}
```

Two Ways to create a String

```java
public class FIS {
    String name = "Fluffy";
    String name = new String("Fluffy");
}
```

String is not Primitive type, but String is handled specially in Java and doesn't need to be instantiated
with new.

## Concatenation

As you already know how to add two numbers in java.

```java
public class FIS {
    public static void main(String args[]) {
        int a = 0;
        int b = 0;
        int c = 0;
        a = b + c;
    }
}
```

In String it will be considered as Concatenation.

```java
public class FIS {
    public static void main(String args[]) {
        String a;
        a = "1" + " 2";
    }
}
```

There are 3 Main rules to remember for concatenation
* Both operands are numeric `1` it will be considered as numeric addition
* if either operand is String it means concatenation

`For Example;`
```java
public class FIS {
    public static void main(String args[]) {
        System.out.println("a" + "b" + 3); // ab3
    }
}
```

* Expression is evaluated from left to Right

`For Example;`
```java
public class FIS {
    public static void main(String args[]) {
        System.out.println(1 + 2 + "c"); // 3c
    }
}
```


### Can you tell me answer for this based on 3 Rules?

```java
public class FIS {
    public static void main(String args[]) {
    int three = 3;
    String four = "4";
    System.out.println(1 + 2 + three + four);
    }
}
```

### Can you tell me answer for this based on 3 Rules?

```java
public class FIS {
    public static void main(String args[]) {
        String s = "1";  
        s += "2";
        s += 3;
        System.out.println(s);
    }
}
```

## Immutability

* Once a String object is created, it is not allowed to change.
  * We cant change smaller or larger and we cant change one charachter in middle
* An Object cannot be changed once its created

### Can you tell me answer for below code?

```java
public class FIS {
    public static void main(String args[]) {
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);
    }
}
```

[ImmutableString](/Users/QQ18PR/Developer/javaExercise/src/main/java/ImmutableString.java)

### How to create mutable class for string

[MutableString](/Users/QQ18PR/Developer/javaExercise/src/main/java/MutableString.java)

## The String Pool

### Why we go to String pool ?

* String all over in java and they use up a lot of memory
* They use 25-40 percent of memory in entire application

Decided to reuse common ones. 

`Note` String pool is also called as Intern pool which is a location in JVM that collects all these Strings

```java
public class FIS {
    public static void main(String args[]) {
      String name = "Thiru"; // Statement 1
      String name = new String("FIS"); // Statement 2
    }
}
```

* `Statement 1` - Goes to String pool why ? because it's a literal
* `Statement 2` - No JVM. No String pool. Go to Garbage Collection

## String Methods

* There are many method in Java to use all those methods we need to understand how string is indexed

| F | I | S |
|---|---|---|
| 0 | 1 | 2 |

### Length()

* Returns number of characters in a String

```java
public class FIS {
    public static void main(String args[]) {
      String name = "FIS";
      System.out.println(name.length());
    }
}
```

Can you guess what is the output ?

Zero counting will happen only when using index or position within a list

### CharAt()

```java
public class FIS {
    public static void main(String args[]) {
      String name = "FIS";
      System.out.println(name.charAt(0)); // Statement 1
      System.out.println(name.charAt(2)); // Statement 2
      System.out.println(name.charAt(3)); // Statement 3
    }
}
```

Can you guess what is the output ?

[StringMethods](/Users/QQ18PR/Developer/javaExercise/src/main/java/StringMethods.java)

### indexOf()

Possible options are mentioned below

```java
public class FIS {
    int indexOf(char ch);
    int indexOf(char ch, index fromIndex);
    int indexOf(String str);
    int indexOf(String str, index fromIndex);
}
```

[StringMethods](/Users/QQ18PR/Developer/javaExercise/src/main/java/StringMethods.java)

### subString()

Looks for characters in a String and returns part of the String

Possible options are mentioned below

```java
public class FIS {
  int substring(int beginIndex);
  int substring(int beginIndex, int endIndex);
}
```
beginIndex --> Starting position
endIndex --> StopAt Index `Note` its not included

[StringMethods](/Users/QQ18PR/Developer/javaExercise/src/main/java/StringMethods.java)

### toLowerCase() and toUpperCase()

You already understand what it does :)

[StringMethods](/Users/QQ18PR/Developer/javaExercise/src/main/java/StringMethods.java)

### equals() and equalsIgnoreCase()

#### equals()
Check Whether two string objects contains exactly same character in same order

#### equalsIgnoreCase()
Check whether two string objects contains same characters with exception that will convert characters case if needed

Possible options are mentioned below

```java
public class FIS {
  boolean equals(String str);
  boolean equalsIgnoreCase(String str);
}
```

[StringMethods](/Users/QQ18PR/Developer/javaExercise/src/main/java/StringMethods.java)

### startsWith() and endsWith()

#### startsWith()
Check whether value matches at start of the String

#### endsWith()
Check whether value matches at end of the String

Possible options are mentioned below

```java
public class FIS {
  boolean startsWith(String prefix);
  boolean endsWith(String suffix);
}
```

[StringMethods](/Users/QQ18PR/Developer/javaExercise/src/main/java/StringMethods.java)

### contains()

Looks for matches in the String

Possible options are mentioned below

```java
public class FIS {
  boolean contains(String str);
}
```

[StringMethods](/Users/QQ18PR/Developer/javaExercise/src/main/java/StringMethods.java)

### replace()

Search and Replace specific String

Possible options are mentioned below

```java
public class FIS {
  String replace(char oldChar, char newChar);
  String replace(CharSequence oldChar, CharSequence newChar);
}
```

[StringMethods](/Users/QQ18PR/Developer/javaExercise/src/main/java/StringMethods.java)

### trim()

Remove whiteSpace from beginning and end of a String

Possible options are mentioned below

```java
public class FIS {
  public String trim();
}
```

[StringMethods](/Users/QQ18PR/Developer/javaExercise/src/main/java/StringMethods.java)

### Method Chaining

We can call multiple methods on the same String

```java
public class FIS {
  String result = " Thiru ".trim().toLowerCase().replace('h', 'H');
}
```

Each time one is called returned value is added a new variable and used for next methods.

#### How to evaluate method chaining ?

Start at Left and evaluate first method and then call next method and keep continue till get semicolon

[StringMethods](/Users/QQ18PR/Developer/javaExercise/src/main/java/StringMethods.java)

## StringBuilder

Can you find how many string objects created here ?

```java
public class FIS { 
    public static void main(String args[]) {
        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++)
            alpha += current;
        System.out.println(alpha);
    }
}
```

27 Objects created here
* 26 Loop
* 1 in initialize

In final loop object which created before 26 of it will be considered for garbage collection. This is inefficient.

`StringBuilder` Class will create a String without Storing all interim String values. StringBuilder is not immutable.

```java
public class FIS { 
    public static void main(String args[]) {
        StringBuilder alpha = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++) 
            alpha.append(current);
        System.out.println(alpha);
    }
}
```

This code will stop creating interim String Values.

[StringBuilderTest](/Users/QQ18PR/Developer/javaExercise/src/main/java/StringBuilderTest.java)

### How to Create StringBuilder

#### We can construct in 3 ways

```java
public class FIS { 
    public static void main(String args[]) {
      StringBuilder sb1 = new StringBuilder(); // Create reference and assign to sb1
      StringBuilder sb2 = new StringBuilder("thiru"); // create reference with value thiru and assign to sb2
      StringBuilder sb3 = new StringBuilder(10); // Statement 3
    }
}
```

Statement 3 - Tell StringBuilder how big value will be to reserve

[StringBuilderTest](/Users/QQ18PR/Developer/javaExercise/src/main/java/StringBuilderTest.java)

### StringBuildMethods

#### charAt()

Similar to same as String Class

#### indexOf()

Similar to same as String Class

#### length()

Similar to same as String Class

#### subString()

Similar to same as String Class

[StringBuilderMethods](/Users/QQ18PR/Developer/javaExercise/src/main/java/StringBuilderMethods.java)

#### append()

Add parameter to StringBuilder and returns a reference to the current StringBuilder.

Possible options are mentioned below

```java
public class FIS {
  StringBuilder append(String str);
}
```

[StringBuilderMethods](/Users/QQ18PR/Developer/javaExercise/src/main/java/StringBuilderMethods.java)
