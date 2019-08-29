package com.x.redis.dao;

import com.x.redis.obj.User;

/**
 * Created by Roro on 2018/8/26.
 */
public interface UserDAO {
    void saveUser(final User user);
    User getUser(final long id);
}
