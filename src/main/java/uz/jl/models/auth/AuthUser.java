package uz.jl.models.auth;

import lombok.*;
import uz.jl.enums.Status;
import uz.jl.enums.auth.Role;
import uz.jl.models.Auditable;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Elmurodov Javohir, Mon 6:18 PM. 11/29/2021
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@Builder(builderMethodName = "childBuilder")
public class AuthUser extends Auditable {
    private String username;
    private String password;
    private Status status;
    private Role role;
    private String phoneNumber;
}
