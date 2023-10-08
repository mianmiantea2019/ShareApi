package com.shareapi.shareapiadmin.mapper;

import com.shareapi.shareapicommon.model.entity.UserInterfaceInfo;
import com.shareapi.shareapicommon.model.vo.InterfaceInfoVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author christyg
* @createDate 2023-06-17 12:32:57
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




