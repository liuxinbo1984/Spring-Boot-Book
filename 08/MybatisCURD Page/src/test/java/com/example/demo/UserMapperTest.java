package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.jupiter.api.Assertions;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback(value = false)
public class UserMapperTest {

    @Autowired
    private UserMapper mapper;

    @Test
    public void testInitUsers() {
        for (int i = 0; i < 11; i++) {
            User u = new User();
            u.setName("user" + i);
            u.setAge(10 + i);
            int result = mapper.add(u);
        }
    }
}

