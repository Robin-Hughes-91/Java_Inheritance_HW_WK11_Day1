import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Joe", 12345, 35000.00);

    }

    @Test
    public void canGetDeptName() {
        assertEquals("Joe", developer.getName());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(developer.getSalary());
        assertEquals(38500.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        Double result = developer.payBonus();
        assertEquals(350.00, result, 0.01);
    }
}
