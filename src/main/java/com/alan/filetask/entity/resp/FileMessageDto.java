package com.alan.filetask.entity.resp;

import com.alan.filetask.entity.Filemessage;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FileMessageDto extends Filemessage {

    private String author;
    private Long spareSpace;
}
