package com.example.projectt3.Service;

import com.example.projectt3.Api.ApiException;
import com.example.projectt3.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final MyUserDetailsService myUserDetailsService;
//    public void register(User user){
//        user.("CUSTOMER");
//        String hasPassword = new BCryptPasswordEncoder().encode(user.getPassword());
//        user.setpassword(hasPassword);
//        userRepository.save(user);
//
//    }
//    public List<User> getAllUser(){
//        return userRepository.findAll();
//    }
//
//    public void deleteUser(String username){
//        User user = userRepository.findUserByUsername(username);
//        if (user==null){
//            throw new ApiException("found");
//        }
//        userRepository.delete(user);
//    }


    public UserDetails login(String username, String password){
        UserDetails userDetails = myUserDetailsService.loadUserByUsername(username);
        if (new BCryptPasswordEncoder().matches(password, userDetails.getPassword())){
            return userDetails;
        } else {
            throw new ApiException("Invalid username or password");
        }
    }
    public void logout(){
    }

}
