package com.spiritedtechie.user;

import javax.enterprise.inject.Default;

@Default
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(Long id) {
        return new User(1L, "John", "Smith", "john@smith.com");
    }
}
