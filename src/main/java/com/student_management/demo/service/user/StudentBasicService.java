package com.student_management.demo.service.user;

import com.student_management.demo.controller.user.vo.UserBasicRespVO;

public interface StudentBasicService {
    UserBasicRespVO getBasicInfo(String reqVO, boolean role);
}
