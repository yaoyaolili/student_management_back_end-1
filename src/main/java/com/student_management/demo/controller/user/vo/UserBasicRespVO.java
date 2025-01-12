package com.student_management.demo.controller.user.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserBasicRespVO {
    private String name;//姓名
    private String role;//true:学生，false：职工
}
