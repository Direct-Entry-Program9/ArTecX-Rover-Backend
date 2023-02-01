package lk.artech.backend.service.custom.impl;

import lk.artech.backend.dto.UserDTO;
import lk.artech.backend.service.custom.UserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class UserServiceImpl implements UserService {
    @Override
    public void createNewUserAccount(UserDTO userDTO) {

    }

    @Override
    public UserDTO getUserAccountDetails(String username) {
        return null;
    }

    @Override
    public void updateUserAccountDetails(UserDTO userDTO) {

    }

    @Override
    public void deleteUserAccount(String username) {

    }
}
