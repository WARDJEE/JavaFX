package week01.RetirementCalculator;

public class Retirement {
    private int birthYear;
    private final int RETIREMENT_AGE = 67;

    public String getRetirementYear() {
        return String.valueOf(birthYear + RETIREMENT_AGE);
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
