package com.alan.filetask.service;

import com.alan.filetask.entity.Filemessage;
import com.alan.filetask.entity.resp.FileMessageDto;
import com.alan.filetask.entity.resp.Result;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface FileMessageService {
    void save(Filemessage buildParms);

    Result upload(MultipartFile file, String token);

    void downLoad(Integer id, HttpServletResponse response);

    List<Filemessage> getList(Integer sortItem);

    void updateState(Integer state,Integer id);
}
