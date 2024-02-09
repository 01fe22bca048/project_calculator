public class arithemeticc {
     
    int cube(int a) {
        return a * a * a;
    }
    
    int square(int a) {
        return a * a;
    }
    
    int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return a % b;
    }

    int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
