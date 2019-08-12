package com.automation.api.pages;

import com.automation.api.components.Enrollment;
import com.automation.api.components.PersonalDetails;

public interface StudentDetails extends PersonalDetails {
    Enrollment[] enrollments();
}