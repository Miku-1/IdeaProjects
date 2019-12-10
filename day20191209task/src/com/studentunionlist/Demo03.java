package com.studentunionlist;

/*
* 学校类
* */

import com.studentunion.School;

import java.util.ArrayList;
import java.util.List;

public class Demo03 {
    public static void main(String[] args) {
        List<School> schools = new ArrayList<>();

        School slg = new School();
        slg.setSchoolId("SX015");
        slg.setSchoolName("陕理工");
        slg.setSchoolSort("理工类");
        slg.setPresident("张社民");

        schools.add(slg);
    }
}
