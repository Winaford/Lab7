public class LifelineSite {
    public int getBillableAmount() {
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_Rate * 0.2;
        return base + tax;
    }
}
