import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddressTest {
    private Address address;

    @BeforeEach
    public void setUp() {
        address = new Address("123 Main St", "Anytown", "CA", "90210");
    }

    @Test
    public void testConstructor() {
        assertEquals("123 Main St", address.getStreet());
        assertEquals("Anytown", address.getCity());
        assertEquals("CA", address.getState());
        assertEquals("90210", address.getZipCode());
    }

    @Test
    public void testGetters() {
        assertEquals("123 Main St", address.getStreet());
        assertEquals("Anytown", address.getCity());
        assertEquals("CA", address.getState());
        assertEquals("90210", address.getZipCode());
    }

    @Test
    public void testSetters() {
        address.setStreet("456 Elm St");
        address.setCity("Othertown");
        address.setState("NY");
        address.setZipCode("10001");

        assertEquals("456 Elm St", address.getStreet());
        assertEquals("Othertown", address.getCity());
        assertEquals("NY", address.getState());
        assertEquals("10001", address.getZipCode());
    }

    @Test
    public void testToString() {
        // Test the toString() method
        assertEquals("123 Main St, Anytown CA 90210", address.toString());
    }
}
