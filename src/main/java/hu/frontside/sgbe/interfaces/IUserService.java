package hu.frontside.sgbe.interfaces;

import hu.frontside.sgbe.models.LoginUser;
import hu.frontside.sgbe.models.UserModel;

import java.util.List;

public interface IUserService {

    List<UserModel> getUsers();
    boolean checkPassword(LoginUser loginUser);
}
