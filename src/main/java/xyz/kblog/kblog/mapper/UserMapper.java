
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import xyz.kblog.kblog.entity.User;

@Mapper
public interface UserMapper{
     
    @Select("SELECT * FROM user")
    List<User> findAll();










    
 
}