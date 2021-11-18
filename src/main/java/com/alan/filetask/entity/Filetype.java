package com.alan.filetask.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * fileType
 * @author 
 */
@Data
public class Filetype implements Serializable {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 文件类型
     */
    private String fileType;

    private static final long serialVersionUID = 1L;
}