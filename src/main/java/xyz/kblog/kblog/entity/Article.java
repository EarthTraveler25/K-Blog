

@Data
@TableName("article")
public class Article{
  @TableId(type = IdType.AUTO)  
  private Long articleId;
  @NotBlank(message = "文章标题不能为空")
  @Size(max = 255, message = "标题最多255字符")
  private String title;
  @NotBlank(message = "文章内容不能为空")
  private String content;
  @Size(max = 255, message = "封面图URL最多255字符")
  private String coverImage;
  private Long categoryId;
  private Long userId;
  @Min(value = 0, message = "浏览量不能为负数")
  private Integer views;
    /**
     * 状态：1-已发布 0-草稿
     */
  private Integer status;
  @TableField(fill = FieldFill.INSERT) 
  private LocalDateTime createTime;
  @TableField(fill = FieldFill.INSERT) 
  private LocalDateTime updateTime;

}