public class FizzBuzzMob {
    public String convert(int i) {
        if (i == 15) { return "Fizz Buzz";}
        if (i % 3 == 0) { return "Fizz"; }
        if (i % 5 == 0) { return "Buzz"; }

        return String.valueOf(i);
    }
}

