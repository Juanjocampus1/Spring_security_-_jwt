package com.empresa.Apiauthjwt.Controller.Request;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateUserDTO {
    private String email;
    private String password;
    private String username;
    private Set<String> roles;
}
