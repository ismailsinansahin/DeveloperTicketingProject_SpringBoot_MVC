package com.smlsnnshn.dto;

import com.smlsnnshn.enums.Status;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class ProjectDTO {

    private String projectName;
    private String projectCode;
    private UserDTO assignedManager;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    private String projectDetail;
    private Status projectStatus;

    private int completeTaskCounts;
    private int unfinishedTaskCounts;

    public ProjectDTO() {
    }

    public ProjectDTO(String projectName, String projectCode, UserDTO assignedManager, LocalDate startDate,
                      LocalDate endDate, String projectDetail, Status projectStatus) {
        this.projectName = projectName;
        this.projectCode = projectCode;
        this.assignedManager = assignedManager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectDetail = projectDetail;
        this.projectStatus = projectStatus;
    }

    public ProjectDTO(String projectName, String projectCode, UserDTO assignedManager, LocalDate startDate,
                      LocalDate endDate, String projectDetail, Status projectStatus, int completeTaskCounts,
                      int unfinishedTaskCounts) {
        this.projectName = projectName;
        this.projectCode = projectCode;
        this.assignedManager = assignedManager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectDetail = projectDetail;
        this.projectStatus = projectStatus;
        this.completeTaskCounts = completeTaskCounts;
        this.unfinishedTaskCounts = unfinishedTaskCounts;

    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public UserDTO getAssignedManager() {
        return assignedManager;
    }

    public void setAssignedManager(UserDTO assignedManager) {
        this.assignedManager = assignedManager;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getProjectDetail() {
        return projectDetail;
    }

    public void setProjectDetail(String projectDetail) {
        this.projectDetail = projectDetail;
    }

    public Status getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(Status projectStatus) {
        this.projectStatus = projectStatus;
    }

    public int getCompleteTaskCounts() {
        return completeTaskCounts;
    }

    public void setCompleteTaskCounts(int completeTaskCounts) {
        this.completeTaskCounts = completeTaskCounts;
    }

    public int getUnfinishedTaskCounts() {
        return unfinishedTaskCounts;
    }

    public void setUnfinishedTaskCounts(int unfinishedTaskCounts) {
        this.unfinishedTaskCounts = unfinishedTaskCounts;
    }

    @Override
    public String toString() {
        return "ProjectDTO{" +
                "projectName='" + projectName + '\'' +
                ", projectCode='" + projectCode + '\'' +
                ", assignedManager=" + assignedManager +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", projectDetail='" + projectDetail + '\'' +
                ", projectStatus=" + projectStatus +
                ", completeTaskCounts=" + completeTaskCounts +
                ", unfinishedTaskCounts=" + unfinishedTaskCounts +
                '}';
    }

}
