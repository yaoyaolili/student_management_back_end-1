package com.student_management.demo.controller.grade;
import com.student_management.demo.CommonResult;
import com.student_management.demo.controller.grade.vo.GradeImportExcelVO;
import com.student_management.demo.controller.grade.vo.GradeImportRespVO;
import com.student_management.demo.service.grade.GradeService;
import com.student_management.demo.utils.excel.ExcelUtils;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

import java.util.List;

@RestController
@RequestMapping("/api/grade/")
@Api(tags = "EasyExcel")
public class GradeController {
    @Resource
    private GradeService service;

    /**
     * 上传GPA excel表格
     * @param file
     * @throws IOException
     */
    @PostMapping("/upload")
    public CommonResult<GradeImportRespVO> importUserExcel(@RequestPart(value = "file") MultipartFile file) throws IOException {
            List<GradeImportExcelVO> userList = ExcelUtils.read(file,GradeImportExcelVO.class);
            GradeImportRespVO respVO = service.importGradeList(userList);
            // 检查上传文件是否为空文件
            if (respVO.isEmpty())
                return CommonResult.error(500, "文件内容为空！");
            return CommonResult.success(respVO);
    }

}