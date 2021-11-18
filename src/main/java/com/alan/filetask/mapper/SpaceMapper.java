package com.alan.filetask.mapper;

import com.alan.filetask.entity.Space;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface SpaceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Space record);

    int insertSelective(Space record);

    Space selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Space record);

    int updateByPrimaryKey(Space record);

    Space getOneByUid(@Param("uid") int uid);
}