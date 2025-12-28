// package com.example.demo.service;

// import com.example.demo.entity.User;
// import java.util.List;

// public interface UserService {

//     User registerUser(User user);

//     // ✅ ADD THESE TWO
//     List<User> getAllUsers();

//     User getUser(Long id);
// }
package com.example.demo.service;

import com.example.demo.entity.User;
import java.util.List;

public interface UserService {

    User registerUser(User user);

    User getUser(Long id);

    List<User> getAllUsers();

    User getByEmail(String email);
}
