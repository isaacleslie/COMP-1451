
/**
 * Abstract class Employee
 * 
 * @author IsaacL
 * @version 29-02-2016
 */
public abstract class Employee implements Employable
{
    private String  name;
    
    //public static final double NO_OVERTIME_PAY_RATE = 0.0;
    //public static final double NEGATIVE_OVERTIME_PAY_RATE = -2.0;
    //public static final double LOW_OVERTIME_PAY_RATE = 1.5;
    //public static final double HIGH_OVERTIME_PAY_RATE = 2.0;
    
    public Employee(String name) {
        this.name = name;
    }
    
    public abstract double getOvertimePayRate();
    
    public String getName() {
        return name;
    }
}
