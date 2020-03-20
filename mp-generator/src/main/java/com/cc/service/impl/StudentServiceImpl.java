package com.cc.service.impl;

import com.cc.entity.Student;
import com.cc.mapper.StudentMapper;
import com.cc.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author moon
 * @since 2020-03-20
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
