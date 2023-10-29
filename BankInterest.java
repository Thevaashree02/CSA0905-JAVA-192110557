class Bank {
    double getRateOfInterest() {
        return 0.0;
    }
}

class SBI extends Bank {
    double getRateOfInterest() {
        return 8.4;
    }
}

class ICICI extends Bank {
    double getRateOfInterest() {
        return 7.3;
    }
}

class AXIS extends Bank {
    double getRateOfInterest() {
        return 9.7;
    }
}

public class BankInterest {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        System.out.println("SBI Bank Interest Rate: " + sbi.getRateOfInterest() + "%");
        System.out.println("ICICI Bank Interest Rate: " + icici.getRateOfInterest() + "%");
        System.out.println("AXIS Bank Interest Rate: " + axis.getRateOfInterest() + "%");
    }
}