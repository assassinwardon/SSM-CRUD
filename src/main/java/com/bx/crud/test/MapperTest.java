package com.bx.crud.test;

import com.bx.crud.bean.Department;
import com.bx.crud.bean.Employee;
import com.bx.crud.dao.DepartmentMapper;
import com.bx.crud.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    SqlSession sqlSession;

    @Test
    public void testCRUD() {
//        ApplicationContext ioc= new ClassPathXmlApplicationContext("applicationContext.xml");
//        DepartmentMapper bean = ioc.getBean(DepartmentMapper.class);
//        System.out.println(bean);
        System.out.println(departmentMapper);

//        departmentMapper.insertSelective(new Department(null,"开发部"));
//        departmentMapper.insertSelective(new Department(null,"测试部"));

//        employeeMapper.insertSelective(new Employee(null,"e01","M","e01@bx.com",3));
//        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//        for (int i = 0; i < 1000; i++) {
//            String uuid= UUID.randomUUID().toString().substring(0,5);
//            mapper.insertSelective(new Employee(null, uuid, "M", uuid+"@bx.com",3));
//        }
//        System.out.println("finish");

        List<Employee> employees = employeeMapper.selectByExampleWithDept(null);
        for (Employee employee: employees
             ) {
            System.out.println(employee);
        }


    }
}
