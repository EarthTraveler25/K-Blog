
@Data
@TableName("comment")
public class Comment{
  @TableId(type = IdType.AUTO)  
  private Long id;
  @NotNull(message = "文章ID不能为空")
  private Long articleId;
  private Long parentId;
  private Long userId;
  @NotBlank(message = "昵称不能为空")
  @Size(max = 64, message = "昵称最多64字符")
  private String nickname;
  @Size(max = 255, message = "头像URL最多255字符")
  private String avatar;
  @NotBlank(message = "评论内容不能为空")
  @Size(max = 1023, message = "评论内容最多1023字符")
  private String content;
    /**
     * 状态：1-正常 0-隐藏
     */
  private Integer status;     
     /**
     * 是否管理员：1-是 0-否
     */ 
  private Integer isAdmin; 
  @TableField(fill = FieldFill.INSERT)
  private LocalDateTime createTime;
  @TableField(fill = FieldFill.INSERT_UPDATE)
  private LocalDateTime updateTime;

}