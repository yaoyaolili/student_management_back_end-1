package com.student_management.demo.mapper.mysql.summary;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.student_management.demo.mapper.dataobject.summary.SummaryDO;

import java.util.List;

@Mapper
@Repository
public interface SummaryMapper extends BaseMapper<SummaryDO> {

    /**
     * 按照学号查询Summary
     * @param stu_num
     * @return
     */
    default SummaryDO selectSummaryByStuNum(String stu_num) {
        QueryWrapper<SummaryDO> wrapper = new QueryWrapper<>();
        //查询条件
        wrapper.eq("stuNum", stu_num);
        return selectOne(wrapper);
    }

    /**
     * 按照学生id查询Summary
     * @param stu_id
     * @return
     */
    default SummaryDO selectSummaryByStuId(Long stu_id) {
        QueryWrapper<SummaryDO> wrapper = new QueryWrapper<>();
        //查询条件
        wrapper.eq("stuId", stu_id);
        return selectOne(wrapper);
    }

    default List<SummaryDO> selectListByStatus(boolean status) {
        QueryWrapper<SummaryDO> wrapper = new QueryWrapper<>();
        //查询条件
        wrapper.eq("status", status);
        return selectList(wrapper);
    }

    default List<SummaryDO> selectAllList() {
        QueryWrapper<SummaryDO> wrapper = new QueryWrapper<>();
        //查询条件
//        wrapper.eq("status", status);
        return selectList(wrapper);
    }

    int updateGpaByStuNum(SummaryDO summary);

    int updateVolByStuNum(SummaryDO summary);
}
