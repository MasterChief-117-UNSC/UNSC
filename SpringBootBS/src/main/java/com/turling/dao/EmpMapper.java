package com.turling.dao;

import com.turling.entity.Emp;
import com.turling.entity.EmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface EmpMapper {
    //分页查询Emp
    @Select("select * from emp limit #{curPage},#{pageSize}")
    public List<Emp> findEmp(Integer curPage, Integer pageSize);

    //查询总条数
    @Select("select count(*) from emp")
    public Integer getCount();

    long countByExample(EmpExample example);

    int deleteByExample(EmpExample example);

    int deleteByPrimaryKey(Integer empno);

    int insert(Emp record);

    int insertSelective(Emp record);

    List<Emp> selectByExample(EmpExample example);

    Emp selectByPrimaryKey(Integer empno);

    int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

    int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}