package hu.frontside.sgbe.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class UserModel {

    private Integer userId;
    private String userName;
}
