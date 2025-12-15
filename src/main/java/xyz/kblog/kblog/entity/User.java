
import lombok.Data;
import java.time.LocalDateTime;

@Data
@TableName("user")
public class User {
@TableId(type = IdType.AUTO)  
  private Long userId;
  @NotBlank(message = "用户名不能为空")
  @Size(min = 3, max = 50, message = "用户名长度3-50字符")
  private String username;

  @NotBlank(message = "密码不能为空")
  @Size(min = 6, message = "密码至少6位")
  @JsonIgnore
  @TableField(select = false)
  private String password;
  @Size(max = 50, message = "昵称最多50字符")
  private String nickname;
  @Email(message = "邮箱格式不正确")
  @Size(max = 100, message = "邮箱最多100字符")
  private String email;
  @Size(max = 255, message = "头像URL最多255字符")
  private String avatar;
  @TableField(fill = FieldFill.INSERT)
  private LocalDateTime createTime;
  @TableField(fill = FieldFill.INSERT)
  private LocalDateTime updateTime;
}

