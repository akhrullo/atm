package uz.jl.dtos.auth;

import lombok.Getter;
import lombok.Setter;
import uz.jl.dtos.BaseGenericDto;
import uz.jl.models.auth.AuthUser;

import java.util.List;

/**
 * @author Elmurodov Javohir, Mon 6:24 PM. 12/6/2021
 */


@Getter
@Setter
public class AuthUserDto extends BaseGenericDto {
    private String username;
    private String phoneNumber;

    //    private List<Cards> cards;
    // add some other fields
    public static void main(String[] args) {
        AuthUser authUser = new AuthUser();
        AuthUserDto authUserDto = new AuthUserDto();
        authUserDto.setId(authUser.getId());
        authUserDto.setUsername(authUser.getUsername());
        authUserDto.setPhoneNumber(authUser.getPhoneNumber());

    }
}
