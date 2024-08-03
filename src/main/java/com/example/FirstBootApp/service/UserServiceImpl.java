package com.example.FirstBootApp.service
        ;
import com.example.FirstBootApp.model.User;
import com.example.FirstBootApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Transactional
    public User findById(Long id){
        return userRepository.getOne(id);
    }
    @Transactional
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Transactional
    public User saveUser(User user){
        return userRepository.save(user);
    }
    @Transactional
    public void deleteById(Long id){
        userRepository.deleteById(id);
    }
}