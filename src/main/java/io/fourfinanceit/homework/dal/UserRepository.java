package io.fourfinanceit.homework.dal;

import io.fourfinanceit.homework.beans.User;
import org.springframework.data.repository.Repository;

/**
 * Created by azee on 25.04.16.
 */
public interface UserRepository extends Repository<User, String> {

    public User findBylastApi(String ip);

    public User save(User user);

    public User findById(String id);

    public User delete(String id);
}
