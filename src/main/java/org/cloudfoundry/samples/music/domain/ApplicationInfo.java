package org.cloudfoundry.samples.music.domain;

import org.springframework.beans.factory.annotation.Value;

public class ApplicationInfo {
    private String[] profiles;
    private String[] services;
    private String name;


    public ApplicationInfo(String[] profiles, String[] services, String name) {
        this.profiles = profiles;
        this.services = services;
        this.name = name;

    }

    public String[] getProfiles() {
        return profiles;
    }

    public void setProfiles(String[] profiles) {
        this.profiles = profiles;
    }

    public String[] getServices() {
        return services;
    }

    public void setServices(String[] services) {
        this.services = services;
    }

    public String getUser() { return name; }
}
