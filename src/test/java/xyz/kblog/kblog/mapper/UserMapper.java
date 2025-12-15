
// UserMapper.java
package com.yourname.kblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yourname.kblog.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    // BaseMapper<User> 已经自动提供了：
    // - insert(User user)
    // - deleteById(Long id)
    // - updateById(User user)
    // - selectById(Long id)
    // - selectList(Wrapper<User> queryWrapper)
    // 等常用方法
    
    // 如果需要自定义SQL查询，在这里添加方法
    // 例如：User selectByUsername(String username);
}



