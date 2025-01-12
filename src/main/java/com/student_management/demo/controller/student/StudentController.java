
package com.student_management.demo.controller.student;

import com.student_management.demo.common.CommonResult;
import com.student_management.demo.controller.student.vo.StudentImportExcelReqVO;
import com.student_management.demo.controller.student.vo.StudentImportRespVO;
import com.student_management.demo.mapper.dataobject.student.StudentBasicDO;
import com.student_management.demo.mapper.dataobject.student.StudentDO;
import com.student_management.demo.service.student.StudentService;
import com.student_management.demo.utils.excel.ExcelUtils;
import com.student_management.demo.utils.token.JwtTokenUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/stu/")
@Api(tags = "学工导入学生信息")
public class StudentController {

    @Resource
    private StudentService studentService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    /**
     * 上传GPA excel表格
     * @param file
     * @throws IOException
     */
    @PostMapping("/import")
    public CommonResult<StudentImportRespVO> importStudentExcel(@RequestHeader("Authorization") String authHeader, @RequestPart(value = "file") MultipartFile file) throws IOException {
        String token = authHeader.substring(7);
        String id = jwtTokenUtil.getUsernameFromToken(token);//学号/职工号
        List<StudentImportExcelReqVO> studentList = ExcelUtils.read(file, StudentImportExcelReqVO.class);
        return CommonResult.success(studentService.importStudentList(studentList, id));
    }


    /**
     * 查找当前所有学生信息
     * @return
     * @throws IOException
     */
    @RequestMapping("/selectall")
    public CommonResult<List<StudentBasicDO>> selectall() {
        return CommonResult.success(studentService.selectALLList());
    }






}
