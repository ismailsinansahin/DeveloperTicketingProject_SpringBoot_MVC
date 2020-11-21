package com.smlsnnshn.dto;

public class RoleDTO {

    private Long id;
    private String description;

    public RoleDTO() {
    }

    public RoleDTO(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RoleDTO{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

}
