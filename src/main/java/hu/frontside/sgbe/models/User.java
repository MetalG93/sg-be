package hu.frontside.sgbe.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {
    private Integer userId;
    private String userName;
    private String password;
}
