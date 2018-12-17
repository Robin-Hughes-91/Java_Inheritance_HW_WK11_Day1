import Management.Director;
import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDirector {
    Director director;

    @Before
    public void before(){
        director = new Director("Robin", 123456, 55_000.00, "Board", 200_000.00);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Board", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(director.getSalary());
        assertEquals(60500.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        Double result = director.payBonus();
        assertEquals(1100.00, result, 0.01);
    }

    @Test
    public void canGetBudget() {
        assertEquals(200_000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canChangeName() {
        director.setName("Robin1");
        assertEquals("Robin1", director.getName());
    }
}
