package com.alan.filetask.service.impl;

import com.alan.filetask.entity.Filetype;
import com.alan.filetask.mapper.FiletypeMapper;
import com.alan.filetask.service.FileTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileTypeServiceImpl implements FileTypeService {

    @Autowired
    private FiletypeMapper filetypeMapper;

    @Override
    public Filetype selectByTypeName(String fileType) {
        return filetypeMapper.selectByTypeName(fileType);
    }

    @Override
    public int save(String filetype) {
        Filetype filetype1 = new Filetype();
        filetype1.setFileType(filetype);
        return filetypeMapper.insert(filetype1);
    }

    @Override
    public String getFileTypeById(Integer id) {
        System.out.println(1111);
        String fileType = filetypeMapper.getTypeById(id);
        if(fileType == null){
            System.out.println(1111);
        }
        return fileType;
    }

    @Override
    public List<Filetype> getTypeList() {
        return filetypeMapper.getAll();
    }
}
