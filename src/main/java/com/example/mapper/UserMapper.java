package com.example.mapper;

import com.example.JavaBeanDemo.JavaBeanDemo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<JavaBeanDemo> selectDB();
    JavaBeanDemo selectByID(String name);

    /**
     *
     * @param name dsd
     * @param sex duds
     * @return fsf
     */
    JavaBeanDemo selectByCondition(@Param("name")String name,@Param("sex")String sex);
}
