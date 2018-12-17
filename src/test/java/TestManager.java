import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestManager {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Adam", 1234, 45000.00, "Testing");
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Testing", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(manager.getSalary());
        assertEquals(49500.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        Double result = manager.payBonus();
        assertEquals(450.00, result, 0.01);
    }



}
