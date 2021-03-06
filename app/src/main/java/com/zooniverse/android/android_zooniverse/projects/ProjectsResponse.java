package com.zooniverse.android.android_zooniverse.projects;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ProjectsResponse {
    @JsonProperty(value = "projects")
    private ArrayList<Project> projects;

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public static class Project {
        @JsonProperty(value = "description")
        private String description;
        @JsonProperty(value = "display_name")
        private String displayName;
        @JsonProperty(value = "classifications_count")
        private int classificationsCount;

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getClassificationsCount() {
            return classificationsCount;
        }

        public void setClassificationsCount(int classificationsCount) {
            this.classificationsCount = classificationsCount;
        }
    }
}
