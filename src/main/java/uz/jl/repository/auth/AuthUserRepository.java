package uz.jl.repository.auth;

import uz.jl.models.auth.AuthUser;
import uz.jl.repository.BaseRepository;
import uz.jl.services.filesystems.DB;

import java.util.Objects;

/**
 * @author Elmurodov Javohir, Mon 6:19 PM. 11/29/2021
 */
public class AuthUserRepository extends BaseRepository<AuthUser> {
    private static AuthUserRepository instance;
    public static AuthUserRepository getInstance() {
        if (instance == null) {
            instance = new AuthUserRepository();
        }
        return instance;
    }

    @Override
    protected void save(AuthUser user) {

    }

    public AuthUser findByUserName(String username) {
        for (AuthUser user : DB.getUsers()) {
            if (user.getUsername().equals(username)) return user;
        }
        return null;
    }
}
