public class ConditionalParameterTest {

    public static void main(String args[]) {

        boolean apples = true;
        boolean bananas = false;
        boolean oranges = true;

        /*
        + (Addition)	Adds values on either side of the operator.	A + B will give 30
        - (Subtraction)	Subtracts right-hand operand from left-hand operand.	A - B will give -10
        * (Multiplication)	Multiplies values on either side of the operator.	A * B will give 200
        / (Division)	Divides left-hand operand by right-hand operand.	B / A will give 2
        % (Modulus)	Divides left-hand operand by right-hand operand and returns remainder.	B % A will give 0
        ++ (Increment)	Increases the value of operand by 1.	B++ gives 21
        -- (Decrement)	Decreases the value of operand by 1.	B-- gives 19

        Operator	Description	Example
        == (equal to)	Checks if the values of two operands are equal or not, if yes then condition becomes true.	(A == B) is not true.
        != (not equal to)	Checks if the values of two operands are equal or not, if values are not equal then condition becomes true.	(A != B) is true.
        > (greater than)	Checks if the value of left operand is greater than the value of right operand, if yes then condition becomes true.	(A > B) is not true.
        < (less than)	Checks if the value of left operand is less than the value of right operand, if yes then condition becomes true.	(A < B) is true.
        >= (greater than or equal to)	Checks if the value of left operand is greater than or equal to the value of right operand, if yes then condition becomes true.	(A >= B) is not true.
        <= (less than or equal to)	Checks if the value of left operand is less than or equal to the value of right operand, if yes then condition becomes true.	(A <= B) is true.
        */

        System.out.println(apples && oranges && !bananas);
        System.out.println(oranges || (oranges && !bananas));
        System.out.println((apples || bananas) && oranges);
        System.out.println((apples || oranges) && !bananas);
        System.out.println(apples ^ oranges);
    }
}