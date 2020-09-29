package org.example.storage;

import org.example.domain.User;
import java.util.List;

public interface UserStorage {
    boolean save(User user);
    User remove(long id);
    User remove(String login);
    List<User> getAll();
    List<User> getByName(String name);
    User getById(long id);
    User getByLogin(String login);
    String updateName(String name, long id);
    String updateLogin(String login, long id);
    String updatePassword(String password, long id);
    boolean contains(long id);
    boolean contains (User user);
    boolean contains (String login);

}
