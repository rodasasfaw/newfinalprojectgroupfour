package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    AppRoleRepository appRoleRepository;

    @Autowired
    AppUserRepository appUserRepository;

    @Autowired
    ProgramsRepository programsRepository;


    @Override
    public void run(String... strings) throws Exception {

        AppRole role = new AppRole();
        role.setRoleName("USER");
        appRoleRepository.save(role);

        role = new AppRole();
        role.setRoleName("ADMIN");
        appRoleRepository.save(role);

        // A few users
        // Admin 1
        AppUser user = new AppUser();
        user.setUsername("John");
        user.setPassword("password1");
        user.setFullName("John Doe");
        user.setUserEmail("g1@gmail.com");
        appUserRepository.save(user);
        user.addRole(appRoleRepository.findAppRoleByRoleName("USER"));
        appUserRepository.save(user);
        // Admin 2
        user = new AppUser();
        user.setUsername("jacob");
        user.setPassword("jacob");
        user.setFullName("Jacob Smith");
        user.setUserEmail("g2@gmail.com");
        appUserRepository.save(user);
        user.addRole(appRoleRepository.findAppRoleByRoleName("ADMIN"));
        appUserRepository.save(user);
        // User 1
        user = new AppUser();
        user.setUsername("Joe");
        user.setPassword("password3");
        user.setFullName("Joe Blow");
        user.setUserEmail("g3@gmail.com");
//        user.setCriteriaCompSciMajor(true);
//        user.setCriteriaComputerComfortable(true);
//        user.setCriteriaCurrentEarnings(true);
//        user.setCriteriaDiploma(true);
//        user.setCriteriaEnglish(true);
//        user.setCriteriaExperienceOOP(true);
//        user.setCriteriaItInterest(true);
//        user.setCriteriaRecentGraduate(true);
//        user.setCriteriaUnderEmployed(true);
//        user.setCriteriaUnderstandOOP(true);
//        user.setCriteriaUnemployed(true);
//        user.setCriteriaWorkInUs(true);

        appUserRepository.save(user);
        user.addRole(appRoleRepository.findAppRoleByRoleName("USER"));
        appUserRepository.save(user);
        // User 2
        user = new AppUser();
        user.setUsername("jane");
        user.setPassword("jane");
        user.setFullName("Jane Pane");
        user.setUserEmail("g4@gmail.com");
//        user.setCriteriaCompSciMajor(false);
//        user.setCriteriaComputerComfortable(true);
//        user.setCriteriaCurrentEarnings(true);
//        user.setCriteriaDiploma(false);
//        user.setCriteriaEnglish(true);
//        user.setCriteriaExperienceOOP(true);
//        user.setCriteriaItInterest(true);
//        user.setCriteriaRecentGraduate(true);
//        user.setCriteriaUnderEmployed(true);
//        user.setCriteriaUnderstandOOP(true);
//        user.setCriteriaUnemployed(true);
//        user.setCriteriaWorkInUs(true);
        appUserRepository.save(user);
        user.addRole(appRoleRepository.findAppRoleByRoleName("USER"));
        appUserRepository.save(user);

        // User 3
        user = new AppUser();
        user.setUsername("jake");
        user.setPassword("jake");
        user.setFullName("Jake English");
        user.setUserEmail("g5@gmail.com");
        appUserRepository.save(user);
        user.addRole(appRoleRepository.findAppRoleByRoleName("USER"));
        appUserRepository.save(user);

        // User 4
        user = new AppUser();
        user.setUsername("bob");
        user.setPassword("bob");
        user.setFullName("bob Snow");
        user.setUserEmail("rodasasfaw4@gmail.com");
        appUserRepository.save(user);
        user.addRole(appRoleRepository.findAppRoleByRoleName("USER"));
        appUserRepository.save(user);

        //user5
        user = new AppUser();
        user.setUsername("jim");
        user.setPassword("jim");
        user.setFullName("Jim English");
        user.setUserEmail("gechomelesse@gmail.com");
        appUserRepository.save(user);
        user.addRole(appRoleRepository.findAppRoleByRoleName("USER"));
        appUserRepository.save(user);

        //user6
        user = new AppUser();
        user.setUsername("rodas");
        user.setPassword("rodas");
        user.setFullName("Rodas Asfaw");
        user.setUserEmail("rodasasfaw4@gmail.com");
        appUserRepository.save(user);
        user.addRole(appRoleRepository.findAppRoleByRoleName("USER"));
        appUserRepository.save(user);

        // Course 1
        Programs course = new Programs();
        course.setCourseName("Tech Hire");
        course.setCourseDescription("fillerDescription");
        course.setCourseCriteria("fillerCriteria");
        programsRepository.save(course);
//        course.addUserApplied(appUserRepository.findOne(new Long(4)));
//        course.addUserApproved(appUserRepository.findOne( new Long(3)));
//        course.addUserInCourse(appUserRepository.findOne(new Long(5)));
//        programsRepository.save(course);
        //Course 2
        course = new Programs();
        course.setCourseName("Java Boot Camp");
        course.setCourseDescription("fillerDescription2");
        course.setCourseCriteria("fillerCriteria2");
        programsRepository.save(course);
        }
}
