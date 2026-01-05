package LLDProblems.ATM.enums;

public enum Denomination {
    BILL_10(10),
    BILL_20(20),
    BILL_50(50);

    public final int value;

    Denomination(int value){
        this.value = value;
    }
}
