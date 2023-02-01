package lk.artech.backend.service.custom;

import lk.artech.backend.dto.UserDTO;
import lk.artech.backend.service.SuperService;

public interface UserService extends SuperService {
    void createNewUserAccount(UserDTO userDTO);

    UserDTO getUserAccountDetails(String username);

    void updateUserAccountDetails(UserDTO userDTO);
    void deleteUserAccount(String username);
}
