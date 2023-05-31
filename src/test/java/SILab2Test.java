import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


public class SILab2Test {
    @Test
    public void testFunction_EveryBranch() {
        User user = new User("username", "password", "email@example.com");
        List<User> allUsers = new ArrayList<>();

        boolean result = SILab2.function(user, allUsers);

        assertFalse(result);
    }
    @Test
    public void testFunction_MultipleCondition() {
        // Test case 1
        User user1 = null;
        List<User> allUsers1 = new ArrayList<>();
        assertThrows(RuntimeException.class, () -> SILab2.function(user1, allUsers1));

        // Test case 2
        User user2 = null;
        String email2 = "email@example.com";
        User finalUser2 = new User("username", null, email2);
        assertThrows(RuntimeException.class, () -> SILab2.function(finalUser2, allUsers1));

        // Test case 3
        User user3 = null;
        String password3 = "password";
        User finalUser3 = new User("username", password3, null);
        assertThrows(RuntimeException.class, () -> SILab2.function(finalUser3, allUsers1));

        // Test case 4
        User user4 = new User("username", null, null);
        assertThrows(RuntimeException.class, () -> SILab2.function(user4, allUsers1));

        // Test case 5
        User user5 = new User("username", "password", "email@example.com");
        List<User> allUsers2 = new ArrayList<>();
        assertFalse(SILab2.function(user5, allUsers2));
    }
}
