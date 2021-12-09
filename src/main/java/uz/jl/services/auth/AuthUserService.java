package uz.jl.services.auth;

import uz.jl.configs.Session;
import uz.jl.mapper.auth.AuthUserMapper;
import uz.jl.models.auth.AuthUser;
import uz.jl.repository.auth.AuthUserRepository;
import uz.jl.response.ResponseEntity;
import uz.jl.response.Status;
import uz.jl.services.BaseAbstractService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Elmurodov Javohir, Mon 6:23 PM. 11/29/2021
 */

public class AuthUserService extends BaseAbstractService<AuthUser, AuthUserRepository, AuthUserMapper> {
    private static AuthUserService authUserService;

    private AuthUserService(AuthUserRepository repository, AuthUserMapper mapper) {
        super(repository, mapper);
    }

    public static AuthUserService getInstance() {
        if (authUserService == null) {
            authUserService = new AuthUserService(AuthUserRepository.getInstance(), AuthUserMapper.getInstance());
        }
        return authUserService;
    }

    @Override
    public ResponseEntity<List<AuthUser>> getAll() {
        List<AuthUser> users = new ArrayList<>();
        return new ResponseEntity<>(users, Status.HTTP_NOT_FOUND);
    }

    @Override
    public ResponseEntity<AuthUser> get(String id) {
        return new ResponseEntity<>(new AuthUser());
    }

    public ResponseEntity<String> login(String username, String password) {
        AuthUser user = repository.findByUserName(username);
        if (Objects.isNull(user) || !user.getPassword().equals(password)) {
            return new ResponseEntity<>("Bad Credentials", Status.HTTP_FORBIDDEN);
        }
        Session.getInstance().setUser(user);
        return new ResponseEntity<>("Successfully");
    }

}
