package hu.frontside.sgbe.controllers;

import hu.frontside.sgbe.interfaces.IUserService;
import hu.frontside.sgbe.models.LoginUser;
import hu.frontside.sgbe.models.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final IUserService userService;

    @GetMapping("/users")
    public List<UserModel> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/users/check")
    public boolean passwordChecker(@RequestBody LoginUser loginUser) {
        return userService.checkPassword(loginUser);
    }
}
