package com.wz.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.wz.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Administrator on 2017/8/24.
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
