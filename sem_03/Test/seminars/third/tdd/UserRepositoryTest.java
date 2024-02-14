package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;

class UserRepositoryTest {
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
        userRepository.addUser(new User("admin", "123", true)); // добавляем администратора
        userRepository.addUser(new User("user1", "123", false)); // добавляем обычного пользователя
        userRepository.addUser(new User("user2", "123", false)); // добавляем еще одного обычного пользователя
    }

    @Test
    void logoutNonAdmins() {
        userRepository.logoutNonAdmins(); // разлогиниваем всех, кроме администраторов

        List<User> users = userRepository.data;
        assertEquals(1, users.size()); // ожидаем, что останется только один пользователь в списке
        assertTrue(users.get(0).isAdmin);
    }

}