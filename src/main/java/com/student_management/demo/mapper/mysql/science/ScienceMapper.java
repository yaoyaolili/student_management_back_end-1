package com.student_management.demo.mapper.mysql.science;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.student_management.demo.mapper.dataobject.science.ScienceDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ScienceMapper extends BaseMapper<ScienceDO>{

    /**
     * 按照学号查询Science
     * @param stu_num
     * @return
     */
    default ScienceDO selectScienceByStuNum(String stu_num) {
        QueryWrapper<ScienceDO> wrapper = new QueryWrapper<>();
        //查询条件
        wrapper.eq("stu_num", stu_num);
        return selectOne(wrapper);
    }

    /**
     * 按照学生id查询Science
     * @param stu_id
     * @return
     */
    default ScienceDO selectScienceByStuId(Long stu_id) {
        QueryWrapper<ScienceDO> wrapper = new QueryWrapper<>();
        //查询条件
        wrapper.eq("stu_id", stu_id);
        return selectOne(wrapper);
    }

}