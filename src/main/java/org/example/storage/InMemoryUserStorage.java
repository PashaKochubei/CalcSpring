package org.example.storage;

import org.example.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryUserStorage implements UserStorage {
    List<User> users = new ArrayList<>();

    @Override
    public boolean save(User user) {
        if (users.add(user)) {
            return true;
        }
        return false;
    }

    @Override
    public User remove(long id) {
        User user = null;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                user = users.get(i);
                users.remove(i);
            }
        }
        return user;
    }

    @Override
    public User remove(String login) {
        User user = null;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getLogin().equals(login)) {
                user = users.get(i);
                users.remove(i);
            }
        }
        return user;
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public List<User> getByName(String name) {
        List<User> byName = new ArrayList<>();
        for (User user : users) {
            if (user.getName().equals(name)) {
                byName.add(user);
            }
        }
        return byName;
    }

    @Override
    public User getById(long id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User getByLogin(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public String updateName(String name, long id) {
        for (User user : users) {
            if (user.getId() == id) {
                user.setName(name);
            }
        }
        return null;
    }

    @Override
    public String updateLogin(String login, long id) {
        for (User user : users) {
            if (user.getId() == (id)) {
                user.setLogin(login);
            }
        }
        return login;
    }

    @Override
    public String updatePassword(String password, long id) {
        for (User user : users) {
            if (user.getId() == id) {
                user.setPassword(password);
            }
        }
        return password;
    }

    @Override
    public boolean contains(long id) {
        for (User user : users) {
            if (user.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(User user) {
        for (User value : users) {
            if (value.equals(user)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }
}
