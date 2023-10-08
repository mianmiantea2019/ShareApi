package com.shareapi.shareapiadmin.service;

import com.shareapi.shareapicommon.model.dto.userinterfaceinfo.UserInterfaceInfoQueryRequest;
import com.shareapi.shareapicommon.model.entity.UserInterfaceInfo;
import com.shareapi.shareapicommon.model.vo.InterfaceInfoVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author christyg
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    /**
     * @param userInterfaceInfo
     * @param add
     */
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * @param interfaceInfoQueryRequest
     * @return
     */
    QueryWrapper<UserInterfaceInfo> getQueryWrapper(UserInterfaceInfoQueryRequest interfaceInfoQueryRequest);

}
