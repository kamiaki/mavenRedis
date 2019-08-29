package com;

import com.x.redis.dao.UserDAO;
import com.x.redis.obj.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        System.out.println( "Hello World!" );

        ApplicationContext ac =  new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
        UserDAO userDAO = (UserDAO)ac.getBean("userDAO");
//        User user1 = new User();
//        user1.setId(1);
//        user1.setName("obama");
//        userDAO.saveUser(user1);
        User user2 = userDAO.getUser(1);
        System.out.println(user2.getId());
        System.out.println(user2.getName());

    }
}
