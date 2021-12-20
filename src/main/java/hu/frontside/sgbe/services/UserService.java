package hu.frontside.sgbe.services;

import hu.frontside.sgbe.interfaces.IUserService;
import hu.frontside.sgbe.models.LoginUser;
import hu.frontside.sgbe.models.User;
import hu.frontside.sgbe.models.UserModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {
    private static List<User> users = new ArrayList<>();

    static{
        users.add(User.builder()
                .userId(1)
                .userName("Teszt Elek")
                .password("asd123")
                .build());
        users.add(User.builder()
                .userId(2)
                .userName("Alma Virág")
                .password("asd123")
                .build());
        users.add(User.builder()
                .userId(3)
                .userName("Tejes B. Ödön")
                .password("asd123")
                .build());
    }

    @Override
    public List<UserModel> getUsers() {
        return users.stream().map(this::mapUserToModel).collect(Collectors.toList());
    }

    private UserModel mapUserToModel(User user){
        return UserModel.builder()
                .userId(user.getUserId())
                .userName(user.getUserName())
                .build();
    }

    @Override
    public boolean checkPassword(LoginUser loginUser) {
        return users.stream()
                .filter(userModel -> userModel.getUserId().equals(loginUser.getUserId()))
                .findFirst().orElse(User.builder().build()).getPassword().contentEquals(loginUser.getPassword());
    }
}
