package enigma;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotorTest {

    final int modu = 26;
    String tab = "N Z J H G R C X M Y S W B O U F A I V L P E K Q D T";
    
    @Test
    public void testForward() {
    Rotor rotor5 = Rotor.rotorFactory(tab, "Z");
    int p=12;
    int actual = rotor5.convertForward(p);
    assertTrue(actual<modu);
    assertTrue(actual>=0);
}

    @Test
    public void testBackward() {
    Rotor rotor5 = Rotor.rotorFactory(tab, "Z");
    int e=12;
    int actual = rotor5.convertBackward(e);
    assertTrue(actual<modu);
    assertTrue(actual>=0);
    }

}
