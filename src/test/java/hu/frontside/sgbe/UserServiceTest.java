package hu.frontside.sgbe;

import hu.frontside.sgbe.models.LoginUser;
import hu.frontside.sgbe.models.UserModel;
import hu.frontside.sgbe.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    private UserService unit;

    @BeforeEach
    public void init(){
        unit = new UserService();
    }

    @Test
    public void userRetrieveTest(){
        List<UserModel> users = unit.getUsers();
        assertEquals(3, users.size());
    }

    @Test
    public void checkPasswordTest(){
        LoginUser loginUser = new LoginUser();
        loginUser.setUserId(1);
        loginUser.setPassword("asd123");
        assertTrue(unit.checkPassword(loginUser));
    }
}
