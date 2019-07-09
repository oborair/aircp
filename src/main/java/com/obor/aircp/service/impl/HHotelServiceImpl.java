package com.obor.aircp.service.impl;

import com.obor.aircp.base.BaseService;
import com.obor.aircp.model.HHotel;
import com.obor.aircp.service.HHotelService;

import java.util.List;
import java.util.UUID;

public class HHotelServiceImpl extends BaseService implements HHotelService {
    @Override
    public int deleteById(String id) {
        return hHotelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int add(HHotel hHotel) {
        hHotel.setId(UUID.randomUUID().toString().replace("-",""));
        return hHotelMapper.insertSelective(hHotel);
    }

    @Override
    public HHotel getById(String id) {
        return hHotelMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<HHotel> getAll() {
        return hHotelMapper.selectAll();
    }

    @Override
    public List<HHotel> getByPage(int pstart, int psize) {
        return hHotelMapper.selectByPage(pstart,psize);
    }

    @Override
    public int update(HHotel hHotel) {
        return hHotelMapper.updateByPrimaryKeySelective(hHotel);
    }

    @Override
    public int getCount() {
        return hHotelMapper.getCount();
    }
}
