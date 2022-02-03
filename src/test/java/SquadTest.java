import org.junit.*;
import static org.junit.Assert.*;

class SquadTest {

    @Test
    public void squad_instantiatesCorrectly_true() {
        Squad testSquad = new Squad("Marvel", "Fighting Evil", 12);
        assertEquals(true, testSquad instanceof Squad);
    }

    @Test
    public void getSquadName_squadInstantiatesWithSquadName_Marvel() {
        Squad testSquad = new Squad("Marvel", "Fighting Evil", 12);
        assertEquals("Marvel", testSquad.getName());
    }

    @Test
    public void getDescription_squadInstantiatesWithDescription_FightingEvil() {
        Squad testSquad = new Squad("Marvel", "Fighting Evil", 12);
        assertEquals("Fighting Evil", testSquad.getCause());
    }

    @Test
    public void all_returnsAllInstancesOfSquad_true() {
        Squad firstSquad = new Squad("Marvel", "Fighting Evil", 12);
        Squad secondSquad = new Squad("Lego", "Bringing Fun", 8);
        assertEquals(true, Squad.getInstances().contains(firstSquad));
        assertEquals(true, Squad.getInstances().contains(secondSquad));
    }


}