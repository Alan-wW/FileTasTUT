package com.alan.filetask.service;

import com.alan.filetask.entity.Space;

public interface SpaceService {
    Space getOneByUid(int uid);

    void update(Space space);

    void save(int uid);
}
