package com.alan.filetask.service;

import com.alan.filetask.entity.Filetype;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FileTypeService {
    Filetype selectByTypeName(@Param("fileType") String fileType);

    int save(String filetype);

    String getFileTypeById(Integer id);

    List<Filetype> getTypeList();
}
