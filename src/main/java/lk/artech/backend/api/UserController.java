package lk.artech.backend.api;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @PostMapping
    public void createUserAccount(){

    }

    @PatchMapping
    public void updateUser(){

    }

    @DeleteMapping
    public void deleteUser(){

    }

}
