package com.AttendanceServer.dto;

import java.time.LocalDate;

public class LeaveRequestDTO {

    private Long id;

    private LocalDate date;

    private Boolean status;

    private Long ProjectId;
    private String ProjectName;

    private Long EmployeeId;
    private String EmployeeName;

    private Long ManagerId;
    private String ManagerName;
}
