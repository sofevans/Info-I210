public class TestMyInteger {
    private int value;
    private int MyInteger;
    private boolean isEven;
    private boolean isOdd;
    private boolean isPrime;
    private boolean equals;

    public static char[] parseInt(char[] chars) {
         if (chars == null) {
        return null;
         }
         int[] ints = new int[chars.length];
         for (int i = 0; i < chars.length; i++) {
            ints[i] = Character.getNumericValue(chars[i]);
    }
    public static int parseInt(String s) {      // confused here
        int i = Integer.parseInt(String s);     // static method string to int
    }
    public TestMyInteger() {
        this.value = value;
        this.MyInteger = MyInteger;
       
    }
    public TestMyInteger(int Value, int MyInteger) {
        this.value = value;
        this.MyInteger = MyInteger;
        this.isEven = isEven;
        this.isOdd = isOdd;
        this.isPrime = isPrime;
        this.equals = equals;
        
    }
    public int getValue(){
        int value = MyInteger;
        return MyInteger;
    }
    public static void isEven(int MyInteger) {
        boolean a;
        if (MyInteger % 2 == 0){
            a = true;
        }
        else {
            a = false;
        }
   }
    public static void isOdd(int MyInteger) {
        boolean b;
        if (MyInteger % 2 == 0){
            b = false;
        }
        else {
            b = true;
        }
    }
    public static void isPrime(int MyInteger) {
        boolean c;
        if (MyInteger <= 1) {
            c = false;
        }
        else {
            for (int i = 2; i <= MyInteger / 2; i++){
                if(MyInteger % i == 0) {
                    c = false;
                }
                else {
                    c = true;        
                }
            }
        }
            c = true;
    }
}
