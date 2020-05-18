package Repl_Practices;

public class GasTank {
    double amount = 0.0;
    double capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }

    public GasTank() {
        amount = 0.0;
    }

    public void addGas(double gasadd) {
        amount += gasadd;
        if (amount > capacity) {
            amount = capacity;
        }
    }
        public boolean isEmpty () {
            if (amount < 0.1)
                return true;
            else
                return false;
        }
        public double getGasLevel(){
        return amount;
    }
    public double fillUp(){
        return capacity-amount;

    }
    public boolean isFull(){
        return amount>(capacity-0.1)?true:false;
    }
}