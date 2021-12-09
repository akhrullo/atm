package uz.jl.ui;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import uz.jl.response.ResponseEntity;
import uz.jl.services.auth.AuthUserService;
import uz.jl.utils.BaseUtils;
import uz.jl.utils.Color;
import uz.jl.utils.Input;
import uz.jl.utils.Print;

import java.util.Objects;
import java.util.StringTokenizer;

/**
 * @author Elmurodov Javohir, Wed 4:52 PM. 12/8/2021
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AuthUI extends BaseAbstractUI /*implements BaseUI*/ {
    private AuthUserService authUserService = AuthUserService.getInstance();
    private static AuthUI authUI;

    public static AuthUI getInstance() {
        if (Objects.isNull(authUI)) {
            return authUI = new AuthUI();
        }
        return authUI;
    }


    public void login() {
        String username = Input.getStr("Username : ");
        String password = Input.getStr("Password : ");
        ResponseEntity<String> response = authUserService.login(username, password);
        show(response);
    }

    public void logout() {
    }

    public void profile() {
    }

    public void quit() {
    }
}
