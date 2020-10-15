package com.turling.service;

import com.turling.entity.EasyUIDataGrid;
import com.turling.entity.Emp;

public interface EmpService {
    public EasyUIDataGrid showEmp(Integer curPage,Integer pageSize);

    //增加
    public  void addEmp(Emp emp);
    //修改
    public void updateEmp(Emp emp);

    //删除
    public void delEmp(Integer empno);
}
