package com.assignment.base;

import com.assignment.base.repository.UserRepository;
import com.assignment.base.vo.UserVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryTest extends BaseApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {

        UserVO user = new UserVO();

        user.setUser_id("testId");
        user.setUser_nm("testNm");

        UserVO newUser = userRepository.save(user);
    }
}
