import ro.mpp2025.model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerRepairRequestTest {
    @Test
    @DisplayName("Test ID Getter and Setter")
    public void testIDGetterSetter() {
        ComputerRepairRequest ccr = new ComputerRepairRequest();
        ccr.setID(123);
        assertEquals(123, ccr.getID());
    }

    @Test
    @DisplayName("Test Owner Name Getter and Setter")
    public void testOwnerNameGetterSetter() {
        ComputerRepairRequest ccr = new ComputerRepairRequest();
        ccr.setOwnerName("John Doe");
        assertEquals("John Doe", ccr.getOwnerName());
    }

    @Test
    @DisplayName("Test Owner Address Getter and Setter")
    public void testOwnerAddressGetterSetter() {
        ComputerRepairRequest ccr = new ComputerRepairRequest();
        ccr.setOwnerAddress("123 Main St");
        assertEquals("123 Main St", ccr.getOwnerAddress());
    }

    @Test
    @DisplayName("Test Phone Number Getter and Setter")
    public void testPhoneNumberGetterSetter() {
        ComputerRepairRequest ccr = new ComputerRepairRequest();
        ccr.setPhoneNumber("555-1234");
        assertEquals("555-1234", ccr.getPhoneNumber());
    }

    @Test
    @DisplayName("Test Model Getter and Setter")
    public void testModelGetterSetter() {
        ComputerRepairRequest ccr = new ComputerRepairRequest();
        ccr.setModel("Dell XPS");
        assertEquals("Dell XPS", ccr.getModel());
    }

    @Test
    @DisplayName("Test Date Getter and Setter")
    public void testDateGetterSetter() {
        ComputerRepairRequest ccr = new ComputerRepairRequest();
        ccr.setDate("01/01/2021");
        assertEquals("01/01/2021", ccr.getDate());
    }

    @Test
    @DisplayName("Test Problem Description Getter and Setter")
    public void testProblemDescriptionGetterSetter() {
        ComputerRepairRequest ccr = new ComputerRepairRequest();
        ccr.setProblemDescription("Battery issue");
        assertEquals("Battery issue", ccr.getProblemDescription());
    }

    @Test
    @DisplayName("Test ToString Method")
    public void testToString() {
        ComputerRepairRequest ccr = new ComputerRepairRequest(1, "John Doe", "123 Main St", "555-1234", "Dell XPS", "01/01/2021", "Battery issue");
        String expected = "ID=1, ownerName='John Doe', model='Dell XPS', date='01/01/2021', problemDescription='Battery issue'";
        assertEquals(expected, ccr.toString());
    }

    @Test
    @DisplayName("Test Default Constructor")
    public void testDefaultConstructor() {
        ComputerRepairRequest ccr = new ComputerRepairRequest();
        assertEquals(0, ccr.getID());
        assertEquals("", ccr.getOwnerName());
        assertEquals("", ccr.getOwnerAddress());
        assertEquals("", ccr.getPhoneNumber());
        assertEquals("", ccr.getModel());
        assertEquals("", ccr.getDate());
        assertEquals("", ccr.getProblemDescription());
    }

    @Test
    @DisplayName("Test Parameterized Constructor")
    public void testParameterizedConstructor() {
        ComputerRepairRequest ccr = new ComputerRepairRequest(1, "John Doe", "123 Main St", "555-1234", "Dell XPS", "01/01/2021", "Battery issue");
        assertEquals(1, ccr.getID());
        assertEquals("John Doe", ccr.getOwnerName());
        assertEquals("123 Main St", ccr.getOwnerAddress());
        assertEquals("555-1234", ccr.getPhoneNumber());
        assertEquals("Dell XPS", ccr.getModel());
        assertEquals("01/01/2021", ccr.getDate());
        assertEquals("Battery issue", ccr.getProblemDescription());
    }
}