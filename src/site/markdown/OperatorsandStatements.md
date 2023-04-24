# Operators and Statements

A Java operator is a special symbol that can be applied to a set of variables, values, or
literals

Three types of operators
* unary
* binary
* ternary

```java
public class FIS {
    int y = 4;
    double x = 3 + 2 * --y;
}
```

Can you calculate the result of variable x?

## Order of operator precedence

| Operator                        | Default initialization value                      |
|---------------------------------|---------------------------------------------------|
| Post-unary operators            | expression++, expression--                        |
| Pre-unary operators             | ++expression, --expression                        |
| Other unary operators           | +, -, !                                           |
| Multiplication/Division/Modulus | *, /, %                                           |
| Addition/Subtraction            | +, -                                              |
| Shift operators                 | <<, >>, >>>                                       |
| Relational operators            | <, >, <=, >=, instanceof                          |
| Equal to/not equal to           | ==, !=                                            |
| Logical operators               | &, ^,                                             |
| Short-circuit logical operators | &&                                                |
| Ternary operators               | boolean expression ? expression1 : expression2    |
| Assignment operators            | =, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>= |

## Arithmetic operators

* addition (+)
* subtraction (-)
* multiplication (*)
* division (/)
* modulus (%)

```java
public class FIS {
int x = 2 * 5 + 3 * 4 - 8;
}
```

Can you calculate the result of variable x?

### Note

`multiplicative operators (*, /, %) have a higher order of precedence than the additive operators (+, -)`

### With parentheses

```java
public class FIS {
    int x = 2 * ((5 + 3) * 4 – 8);
}
```

Can you calculate the result of variable x?

All Arithmetic operators can be applied to any java primitives.

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

Except Boolean and String, If you use addition (+) it will be like string concatenation. We will look back later...

### Modulus operator or Remainder Operator (%)

```java
public class FIS {
    public static void main(String args[]) {
        System.out.print(9 / 3); // Outputs 3
        System.out.print(9 % 3); // Outputs 0
        System.out.print(10 / 3); // Outputs 3
        System.out.print(10 % 3); // Outputs 1
    }
}
```

Modulus operation can be both positive integer and negative integer values.

`Example`

[ModulusOperator](C://Users//$reference//javaExercise//src//main//java//ModulusOperator.java)

## Numeric Promotion Rules

### Rule 1

* Two values have different data types, Java will automatically promote one of the values to the larger of the two data
types

```java
public class FIS {
    public static void main(String args[]) {
        int x = 1;
        long y = 33;
        //int z = x * y; It wont compile
    }
}
```

[NumericPromotionRule1](C://Users//$reference//javaExercise//src//main//java//NumericPromotionRule1.java)

### Rule 2

* If one of the values is integral and the other is floating-point, Java will automatically
promote the integral value to the floating-point value’s data type.

[NumericPromotionRule2](C://Users//$reference//javaExercise//src//main//java//NumericPromotionRule2.java)

### Rule 3

* Data types byte, short and char will be promoted to int anytime they are used with arithmetic operator even
both data types are not integer

[NumericPromotionRule3](C://Users//$reference//javaExercise//src//main//java//NumericPromotionRule3.java)

`Note` Unary operator are excluded from this rule

[NumericPromotionRuleAll](C://Users//$reference//javaExercise//src//main//java//NumericPromotionRuleAll.java)

## Unary Operators

| Unary Operator | Description                       |
|----------------|-----------------------------------|
| +              | Indicate number is +ve            |
| -              | Indicate number is -ve            |
| ++             | Increments a value by 1           |
| --             | Decrements a value by 1           |
| !              | Inverts a Boolean’s logical value |

## Logical Complement and Negation Operators

### Logical Complement operator ! flips the value of boolean expression

* Flips the value of a boolean expression

[LogicalComplementOperator](C://Users//$reference//javaExercise//src//main//java//LogicalOperator.java)

```java
public class FIS {
    public static void main(String args[]) {
        boolean x = false;
        System.out.println(x); // false
        x = !x;
        System.out.println(x); // true
    }
}
```
### Negation Operators

* Reverses the sign of a numeric expression

```java
public class FIS {
    public static void main(String args[]) {
        double x = 1.21;
        System.out.println(x); // 1.21
        x = -x;
        System.out.println(x); // -1.21
        x = -x;
        System.out.println(x); // 1.21
    }
}
```

`We cant use logical and negation operator as showed below`

```java
public class FIS {
    public static void main(String args[]) {
    int x = !5;         // DOES NOT COMPILE
    boolean y = -true;  // DOES NOT COMPILE
    boolean z = !0;     // DOES NOT COMPILE
    }
}
```

### Increment and Decrement Operators

* ++ Increment operator applied to numeric
* -- Decrement operator applied to numeric

```java
public class FIS {
    public static void main(String args[]) {
    int counter = 0;
    System.out.println(counter); // Outputs 0
    System.out.println(++counter); // Outputs 1 -> pre-increment operator
    System.out.println(counter); // Outputs 1
    System.out.println(counter--); // Outputs 1 -> post-decrement operator
    System.out.println(counter); // Outputs 0
    }
}
```

[IncrementDecrementOperator](C://Users//$reference//javaExercise//src//main//java//IncrementDecrementOperator.java)

## Using Additional Binary Operators

```java
public class FIS {
    public static void main(String args[]) {
    int x = 1.0; // DOES NOT COMPILE
    short y = 1921222; // DOES NOT COMPILE
    int z = 9f; // DOES NOT COMPILE
    long t = 192301398193810323; // DOES NOT COMPILE
    }
}
```
`How to fix this?`

### Casting primitive values

* Larger numerical data type to a smaller numerical data type
* Floating-point number to an integral value

```java
public class FIS {
    public static void main(String args[]) {
        int x = (int)1.0;
        short y = (short)1921222; // Stored as 20678
        int z = (int)9l;
        long t = 192301398193810323L;
    }
}
```

`System wraps around to the next lowest value and counts up from there`

[Casting](C://Users//$reference//javaExercise//src//main//java//Casting.java)

```java
public class FIS {
    public static void main(String args[]) {
    short x = 10;
    short y = 3;
    short z = x * y; // DOES NOT COMPILE
    }
}
```

`How to fix compile error ?`

```java
public class FIS {
    public static void main(String args[]) {
    short x = 10;
    short y = 3;
    short z = (short)(x * y);
    }
}
```

### Compound Assignment Operators

```java
public class FIS {
    public static void main(String args[]) {
        int x = 2, z = 3;
        x = x * z;   // Simple assignment operator
        System.out.println(x);
        x *= z;     // Compound assignment operator
        System.out.println(x);
    }
}
```

[CompoundAssignmentOperator](C://Users//$reference//javaExercise//src//main//java//CompoundAssignmentOperator.java)

### Relational operator

`compare two expressions and return a boolean value`

```java
public class FIS {
    public static void main(String args[]) {
        int x = 10, y = 20, z = 10;
        System.out.println(x < y); // Outputs true
        System.out.println(x <= y); // Outputs true
        System.out.println(x >= z); // Outputs true
        System.out.println(x > z); // Outputs false
    }
}
```

### Logical operator

* Logical operator or `&` `|`
* Conditional operator && (AND) and || (OR)

```java
public class FIS {
    public static void main(String args[]) {
        boolean x = true || (y < 4);
    }
}
```

```java
public class FIS {
    public static void main(String args[]) {
        if(x != null && x.getValue() < 5) {
            // Do something
        }
    }
}
```

```java
public class FIS {
    public static void main(String args[]) {
        if(x != null & x.getValue() < 5) { // Throws an exception if x is null
            // Do something
        }
    }
}
```

### Equality operator

Equality to determine
* Two Objects are same
* Two Objects are equivalent

`Equal operator ==`
`Not Equal operator !=`

We can use equal operator in three scenarios:
1. Compare two numeric types

```java
public class FIS {
    public static void main(String args[]) {
        System.out.println( 5 == 5.00);
    }
}
```

2. Comparing two boolean values

```java
public class FIS {
    public static void main(String args[]) {
        boolean y = false;
        boolean x = (y = true);
        if (y == x) System.out.println( true);
        System.out.println(x);
    }
}
```

3. Comparing two objects

```java
public class FIS {
    public static void main(String args[]) {
        File x = new File("myFile.txt");
        File y = new File("myFile.txt");
        File z = x;
        System.out.println(x == y); // Outputs false
        System.out.println(x == z); // Outputs true
    }
}
```

### Control flow Statements

Its used to break flow of execution by using

* decision making
* Looping
* Branching


#### if-then Statement

Execute particular block of code if and only if a boolean expression evaluates to true at runtime

```java
public class FIS {
    public static void main(String args[]) {
            if (booleanExpression) {
                // Execute if boolean is true
            }
        }
    }
}
```

Can you answer this question?

```java
public class FIS {
    public static void main(String args[]) {
        int numberOfEmployees = 10;    
        if (numberOfEmployees < 11)
                System.out.println("Good Morning");
            morningGreetingCount++;
        }
}
```

```java
public class FIS {
    public static void main(String args[]) {
            if (booleanExpression) {
                // Execute if boolean is true
            } else {
            }
        }
}
```

```java
public class FIS {
    public static void main(String args[]) {
        int numberOfEmployees = 10;
        if (numberOfEmployees < 11) {
            System.out.println("Good Morning");
        } else if (numberOfEmployees < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }
    }
}
```

Always watch indentation and Braces For example you can see below code

```java
public class FIS {
    public static void main(String args[]) {
        int numberOfEmployees = 10;
    if(numberOfEmployees < 11) {System.out.println("Good Morning");} else if (numberOfEmployees < 15) {System.out.println("Good Afternoon");} else { System.out.println("Good Evening");}
    }
}
```

Can you find what is wrong in below code?

```java
public class FIS {
    public static void main(String args[]) {
        int numberOfEmployees = 10;
        if (numberOfEmployees = 10) {
            System.out.println("Good Morning");
        }
    }
}
```

## Ternary Operator

`booleanExpression ? expression1 : expression2`

Ternary operator can be compressed for an if-then-else statement

```java
public class FIS {
    public static void main(String args[]) {
        int y = 10;
        final int x;
        if(y > 5) {
            x = 2 * y;
        } else {
            x = 3 * y;
        }
    }
}
```


```java
public class FIS {
    public static void main(String args[]) {
        int y = 10;
        int x = (y > 5) ? (2 * y) : (3 * y);
        }
}
```

Ternary operator use only one expression

[Ternary operator](/Users/$refrence/Developer/javaExercise/src/main/java/TernaryOperator.java)

## Switch Statement

```java
public class FIS {
    public static void main(String args[]) {
        switch (variableToTest) {
            case constantExpression1: // Branch for case1;
            case constantExpression2: // Branch for case2;
            default:                  // Branch for default
        }
    }
}
```

Data types supported by switch statements include the following:
* Integer
* Byte
* Short
* Character
* Integer
* String
* enum values

`Note` Boolean and Long is not supported 

* Case statement value must also be a literal, enum constant, or final constant variable
* Data type for case statements must all match the data type of the switch variable

[Switch](/Users/$refrence/Developer/javaExercise/src/main/java/Switch.java)

After checking above example, Can we identify which will not compile and why?

```java
public class FIS {
    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch (firstName) {
            case "Test":
                return 52;
            case middleName:
                id = 5;
                break;
            case suffix:
                id = 0;
                break;
            case lastName:
                id = 8;
                break;
            case 5:
                id = 7;
                break;
            case 'J':
                id = 10;
                break;
            case java.time.DayOfWeek.SUNDAY:
                id = 15;
                break;
        }
        return id;
    }
}
```

## While Statement

[While](/Users/$refrence/Developer/javaExercise/src/main/java/While.java)

Can you identify output of below code?

```java
public class FIS {
    public static void main(String args[]) {
        int x = 2;
        int y = 5;
        while (x < 10)
            y++;
    }
}
```

## Do-While Statement

```java
public class FIS {
    public static void main(String args[]) {
        int x = 0;
        do {
        x++;
        } while(false);
        System.out.println(x);
    }
}
```

[DoWhile](/Users/$refrence/Developer/javaExercise/src/main/java/DoWhile.java)

## for Statement

```java
public class FIS {
    public static void main(String args[]) {
        for(initialization; booleanExpression; updateStatement) {
        /*
                Step 1 - Intialization Statement Executes
                Step 2 - Boolean Expression is true continue else exit
                Step 3 - Execute body
                Step 4 - Execute update Statement
                Step 5 - Go to Step 2
         */
            
        }
    }
}
```

`Note` - Initialization statement should have same data type

[ForStatement](/Users/$refrence/Developer/javaExercise/src/main/java/ForStatement.java)

## for-each statement

Iterating over arrays and Collection objects

[ForEachStatement](/Users/$refrence/Developer/javaExercise/src/main/java/ForEachStatement.java)

## Hands - On

### Build a class with all examples and test