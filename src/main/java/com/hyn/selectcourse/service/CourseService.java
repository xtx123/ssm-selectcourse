package com.hyn.selectcourse.service;


import com.hyn.selectcourse.model.Course;

import java.util.List;
import java.util.Map;

public interface CourseService {

    void addCourse(Course course);

    Integer isExistCourse(Map map);

    void insertUserCourse(Map map);

    void addChooseCourse(Long id);

    void reduceChooseCourse(Long id);

    List<Course> getNoChooseCourseList(Map map);

    Integer getNoChooseCourseListCount(Map map);

    List<Course> getChooseCourseList(Map map);

    Integer getChooseCourseListCount(Map map);

    Course getCourseById(Long id);

    int getSaveTimeCourse(Map map);

    int getAllCredit(String loginName);

    void deleteCourse(Map map);

    List<Map> getMessageListByCourseId(Map map);

    int getMessageCountByCourseId(Long courseId);

    void addMessage(Map map);

    void openCourse();

    void closeCourse();

    int noOpen();

    List<Course> getAllCourseList(Map map);

    int getAllCourseListCount(Map map);

    List<Map> screenWillDelete(Map map);

    void screenStu(Map map);

    void updateScore(Map map);

    int getTeaCourseListCount(Map map);

    List<Course> getTeaCourseList(Map map);
}
