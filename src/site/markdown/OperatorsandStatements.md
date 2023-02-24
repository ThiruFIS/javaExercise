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

### Logical operator ! flips the value of boolean expression

[LogicalOperator](C://Users//$reference//javaExercise//src//main//java//LogicalOperator.java)

