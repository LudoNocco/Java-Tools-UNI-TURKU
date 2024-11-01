public class Calculator {
    private int result;

    public Calculator() {
        reset();
    }

    public void reset() {
        this.result = 0;
    }

    public int getResult() {
        return this.result;
    }

    public void add(int value) {
        this.result += value;
    }

    public void subtract(int value) {
        this.result -= value;  // Corrected to subtract
    }

    public void multiply(int value) {
        this.result *= value;  // Corrected multiplication
    }

    public void exponent(int value) {
        int initial = this.result;
        for (int i = 1; i < value; i++) {
            this.result *= initial;
        }
    }
}
