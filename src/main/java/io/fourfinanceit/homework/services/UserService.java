package io.fourfinanceit.homework.services;

import io.fourfinanceit.homework.beans.User;
import io.fourfinanceit.homework.dal.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by azee on 25.04.16.
 */
@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getByIp(String lastApi){
        return userRepository.findBylastApi(lastApi);
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public User findOne(String id){
        return userRepository.findById(id);
    }

    public void delete(String id){
        userRepository.delete(id);
    }
}
