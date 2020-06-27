package top.duanhong.steward.mapper.smapper;

import top.duanhong.steward.entity.po.MgmtRivalChlExample;
import top.duanhong.steward.entity.po.MgmtRivalChlLonLatBaseInfo;

import java.util.List;

public interface MgmtRivalSmapper {
    List<MgmtRivalChlLonLatBaseInfo> selectLonLatByExample(MgmtRivalChlExample example);
}
