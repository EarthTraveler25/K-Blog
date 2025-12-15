package xyz.kblog.kblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.kblog.kblog.entity.User;
import xyz.kblog.kblog.mapper.UserMapper;

import java.util.List;


@RestController
public class TestController{
   private final UserMapper userMapper;

   public TestController(UserMapper userMapper){
         this.userMapper = userMapper;
   }

  @GetMapper("/test/users")
  public List<User> getUsers(){
   return userMapper.finaAll();

  }

}