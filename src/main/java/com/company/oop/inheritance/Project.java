package com.company.oop.inheritance;

import com.company.enums.Status;
import com.company.oop.encapsulation.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Project extends BaseEntity {

    private String projectCode;
    private String projectName;
    private User assignedManager;
    private LocalDate startDate;
    private LocalDate endDate;
    private Status projectStatus;
    private String projectDetails;

    // Lombok doesn't have annotation for super constructor with all arguments, that's why we added it manually
    // @AllArgsConstructor will bring default super constructor with no args

    public Project(long id, LocalDateTime insertDateTime, long insertUserId, LocalDateTime lastUpdateTime, long lastUpdateUserId, String projectCode, String projectName, User assignedManager, LocalDate startDate, LocalDate endDate, Status projectStatus, String projectDetails) {
        super(id, insertDateTime, insertUserId, lastUpdateTime, lastUpdateUserId);
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.assignedManager = assignedManager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectStatus = projectStatus;
        this.projectDetails = projectDetails;
    }
}
