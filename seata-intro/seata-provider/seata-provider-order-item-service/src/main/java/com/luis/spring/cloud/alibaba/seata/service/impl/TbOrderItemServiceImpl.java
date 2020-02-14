package com.luis.spring.cloud.alibaba.seata.service.impl;

import com.luis.spring.cloud.alibaba.seata.domain.TbOrderItem;
import javax.annotation.Resource;
import com.luis.spring.cloud.alibaba.seata.mapper.TbOrderItemMapper;
import com.luis.spring.cloud.alibaba.seata.service.api.TbOrderItemService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class TbOrderItemServiceImpl implements TbOrderItemService{

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

    @Override
    public void insert(TbOrderItem tbOrderItem) {
        tbOrderItemMapper.insert(tbOrderItem);

    }
}
