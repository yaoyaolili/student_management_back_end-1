package com.student_management.demo.controller.volunteer.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class VolunteerBaseVO {
    @Schema(description = "学生ID", example = "13470")
    @NotNull(message = "学生ID不能为空")
    private Long stuId;

    @Schema(description = "学生学号")
    @NotNull(message = "学生学号不能为空")
    private String stuNum;

    @Schema(description = "学生姓名", example = "李四")
    @NotNull(message = "学生姓名不能为空")
    private String stuName;

    @Schema(description = "学生志愿")
    private int time;

    @Schema(description = "评分")
    private Integer score;

    @Schema(description = "状态", example = "1")
    private Integer status;

}
