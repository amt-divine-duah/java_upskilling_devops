package vcs_tutorial;

public class VcsTutorial {
    private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public VcsTutorial(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public int subtractTwoNumbers(int a, int b) {
        return a - b;
    }


    public static void main(String[] args) {
        VcsTutorial vcsTutorial = new VcsTutorial(100, 30);

        // call the addTwoNumbers method
        int result = vcsTutorial.addTwoNumbers(vcsTutorial.getNumber1(), vcsTutorial.getNumber2());
        System.out.println(result);

        // call the subtractTwoNumbers method
        result = vcsTutorial.subtractTwoNumbers(vcsTutorial.getNumber1(), vcsTutorial.getNumber2());
        System.out.println(result);
    }
}
