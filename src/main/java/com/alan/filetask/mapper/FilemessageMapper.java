package com.alan.filetask.mapper;

import com.alan.filetask.entity.Filemessage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface FilemessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Filemessage record);

    int insertSelective(Filemessage record);

    Filemessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Filemessage record);

    int updateByPrimaryKey(Filemessage record);

    Filemessage getOneByFileName(String fileNanme);

    List<Filemessage> getList(Integer sortItem);

    void updateStateById(@Param("state") Integer state,@Param("id") Integer id);
}