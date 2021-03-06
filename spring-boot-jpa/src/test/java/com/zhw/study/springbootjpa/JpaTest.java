package com.zhw.study.springbootjpa;

import com.zhw.study.springbootjpa.pojo.IdCard;
import com.zhw.study.springbootjpa.pojo.User;
import com.zhw.study.springbootjpa.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

/**
 * @author innerpeacez
 * @since 2019/1/23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableJpaRepositories(basePackages = "com")
public class JpaTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSave() {
        IdCard idCard = new IdCard(1L, "123456");
        User user = new User(4L, "innerpeacez", "coding", idCard);
        User save = userRepository.save(user);
        System.out.println(save);
    }

    @Test
    public void testUpdate() {
        Optional<User> save = userRepository.findById(2L);
        System.out.println(save);
    }

    @Test
    public void testGet() {
        Optional<User> save = userRepository.findById(2L);
        System.out.println(save);
    }

    @Test
    public void testFindOne() {

    }

    @Test
    public void testMultiEntity() {

    }

    @Test
    public void testFindBy() {
        List<User> innerpeacez = userRepository.findByName("innerpeacez");
        System.out.println(innerpeacez);
    }

    @Test
    public void testDelete() {
        userRepository.deleteById(1L);
    }

    @Test
    public void testGetAll() {
        List<User> save = userRepository.findAll();
        System.out.println(save);
    }
}
