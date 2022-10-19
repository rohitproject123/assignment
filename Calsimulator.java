class CountryNotValidException extends Exception { 
    public CountryNotValidException(String msg) { 
        super(msg); // passing msg to super class
    }
}

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String msg) {
        super(msg);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String msg) {
        super(msg);
    }
}

class TaxCal { 
    public void calculateTax(String empName, boolean isIndian, double empSal) throws Exception {
        if (isIndian == false) { 
            try { 
                throw new CountryNotValidException("The employee Out of Country");
            } catch (CountryNotValidException ex) { 
                System.out.println(ex.getMessage());
            }
        } else if (empName == null) {
            try {
                throw new EmployeeNameInvalidException("The employee name is empty");
            } catch (EmployeeNameInvalidException ex) {
                System.out.println(ex.getMessage());
            }
        } else if (empSal > 100000 && isIndian == true) {
            System.out.println(empSal * 8 / 100);
        } else if (empSal > 50000 && empSal < 100000 && isIndian == true) {
            System.out.println((empSal * 6) / 100);
        } else if (empSal > 30000 && empSal < 50000 && isIndian == true) {
            System.out.println((empSal * 5) / 100);
        } else if (empSal > 10000 && empSal < 300000 && isIndian == true) {
            System.out.println((empSal * 4) / 100);
        } else {
            try {
                throw new TaxNotEligibleException("The employee not need to pay tax :)");
            } catch (TaxNotEligibleException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

public class CalSimulator { 
    public static void main(String[] args) throws Exception { 
        TaxCal tax = new TaxCalculator(); 
        tax.calculateTax("Rohit", false, 3400); 
        tax.calculateTax("Raj", true, 1000);
        tax.calculateTax("Rony", true, 55000);
        tax.calculateTax(null, true, 30000);
    }
}