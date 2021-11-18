package com.alan.filetask.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * space
 * @author 
 */
@Data
public class Space implements Serializable {
    private Integer id;

    /**
     * 空间大小
     */
    private Long spaceSize;

    /**
     * 用户外健
     */
    private Integer uid;

    private static final long serialVersionUID = 1L;
}