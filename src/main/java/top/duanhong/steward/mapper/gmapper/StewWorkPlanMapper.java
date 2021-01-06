package top.duanhong.steward.mapper.gmapper;

import org.apache.ibatis.annotations.Param;
import top.duanhong.steward.entity.po.StewWorkPlan;
import top.duanhong.steward.entity.po.StewWorkPlanExample;

import java.util.List;

public interface StewWorkPlanMapper {
    long countByExample(StewWorkPlanExample example);

    int deleteByExample(StewWorkPlanExample example);

    int insert(StewWorkPlan record);

    int insertSelective(StewWorkPlan record);

    List<StewWorkPlan> selectByExample(StewWorkPlanExample example);

    int updateByExampleSelective(@Param("record") StewWorkPlan record, @Param("example") StewWorkPlanExample example);

    int updateByExample(@Param("record") StewWorkPlan record, @Param("example") StewWorkPlanExample example);
}
