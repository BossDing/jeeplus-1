package com.jeeplus.admin.services.impl;

import com.jeeplus.admin.dto.SysUserDTO;
import com.jeeplus.admin.entities.TbSysUser;
import com.jeeplus.admin.mapper.LoginMapper;
import com.jeeplus.admin.services.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yuzp17311 on 2016/8/24.
 */
@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public boolean loginValidate(SysUserDTO sysUserDTO) {
      TbSysUser sysUser=  loginMapper.loginValidate(sysUserDTO);
        if (sysUser!=null)
            return true;
        return false;
    }
}
