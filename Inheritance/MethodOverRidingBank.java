package Inheritance;

class Bank {
    double getInterestRateOnPersonalLoan() {
        return 0.0;
    }
}
class SBI extends Bank  {
    @Override
    double getInterestRateOnPersonalLoan() {
        return 7.7;
    }
}
class Canara extends Bank {
    @Override
    double getInterestRateOnPersonalLoan() {
        return 6.7;
    }
}
class Fino extends Bank {
    @Override
    double getInterestRateOnPersonalLoan() {
        return 5.6;
    }
}
public class MethodOverRidingBank {
    public static void main(String[] args) {
        SBI s1 = new SBI();
        System.out.println(s1.getInterestRateOnPersonalLoan());
        Canara c1 = new Canara();
        System.out.println(c1.getInterestRateOnPersonalLoan());
        Fino f1 = new Fino();
        System.out.println(f1.getInterestRateOnPersonalLoan());
    }
}

