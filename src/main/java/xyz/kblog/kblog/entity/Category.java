

@Data
@TableName("category")
public class Category{
  @TableId(type = IdType.AUTO)  
  private Long categoryId;
  @NotBlank(message = "分类名称不能为空")
  @Size(max = 100, message = "分类名称最多100字符")
  private String name;
  @TableField(fill = FieldFill.INSERT) 
  private LocalDateTime createTime;
  @TableField(fill = FieldFill.INSERT) 
  private LocalDateTime updateTime;

}