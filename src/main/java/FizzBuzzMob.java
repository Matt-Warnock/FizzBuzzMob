public class FizzBuzzMob {
    public String convert(int i) {
        if (i % 3 == 0) { return "Fizz"; }
        if (i == 5) { return "Buzz"; }
        return String.valueOf(i);
    }
}

