package com.paimon.lumine;

public class mathTest {
    public static void main(String[] args) {
        int[] exponent = {1, 2, 3, 4};
        //shifts the bits of the number to the left by 1
        int base = 1 << exponent.length;

        /*
         
         The `<<` operator in Java is the left shift bitwise operator. It shifts the bits of the left-hand operand to the left by the number of positions specified by the right-hand operand. Each shift to the left effectively multiplies the number by 2.

        In your code:
        ```java
        int base = 1 << exponent.length;
        ```

        Here's what happens:
        - `exponent.length` is 3 (since the array `exponent` has 3 elements).
        - `1 << 3` shifts the bits of the number 1 to the left by 3 positions.

        In binary, this looks like:
        - `1` in binary is `0001`.
        - Shifting `0001` to the left by 3 positions results in `1000`, which is `8` in decimal.

        So, `base` will be `8`.

        The output of the program will be:
        ```
        Base: 8
        ```
        
        
         */

        System.out.println("Base: " + base);
    }
    
}
