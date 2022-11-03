class Section4 {
    static void addition16() {
        for (int number = 0; number <=16; number++) {
            int sum = number + 16;
            System.out.println("16 + " + number + " = " + sum);
        }
    }
    static void multiplication16() {
        for (int num = 1; num <= 16; num++) {
            int product = num*16;
            System.out.println("16 x " + num + " = " + product);
        }
    }
    public static void main(String[] args) {
        addition16();
        multiplication16();
    }

}