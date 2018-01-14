package com.orechou.alfred.service.base;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.toolkit.StringUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * IService 的一个实现类
 *
 * @author OreChou
 * @create 2018-01-14 17:29
 */
public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T>  {

    @Override
    public Page<T> selectPage(Page<T> page) {
        Map<String, Object> oldCondition = page.getCondition();
        if (oldCondition != null && oldCondition.size() != 0) {
            Map<String, Object> newCondition = new HashMap<>(oldCondition.size());
            for (Map.Entry<String, Object> entry : oldCondition.entrySet()) {
                newCondition.put(StringUtils.camelToUnderline(entry.getKey()), entry.getValue());
            }
            page.setCondition(newCondition);
        }
        return this.selectPage(page, Condition.create());
    }

}
