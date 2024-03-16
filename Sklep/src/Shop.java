public class Shop {
    TaxStrategy taxStrategy;

    void setTax(TaxStrategy TS) {
        taxStrategy = TS;
    }

    double getTax(){
        return taxStrategy.getTax();
    }
}
