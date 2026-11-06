package com.dubin.labs;

import java.util.Objects;

public class Character {
    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private String originName;
    private String locationName;
    private String created;

    public Character() {
    }

    public Character(int id, String name, String status, String species, String type, String gender, String originName, String locationName, String created) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.species = species;
        this.type = type;
        this.gender = gender;
        this.originName = originName;
        this.locationName = locationName;
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getSpecies() {
        return species;
    }

    public String getType() {
        return type;
    }

    public String getGender() {
        return gender;
    }

    public String getOriginName() {
        return originName;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getCreated() {
        return created;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return id == character.id &&
                Objects.equals(name, character.name) &&
                Objects.equals(status, character.status) &&
                Objects.equals(species, character.species) &&
                Objects.equals(type, character.type) &&
                Objects.equals(gender, character.gender) &&
                Objects.equals(originName, character.originName) &&
                Objects.equals(locationName, character.locationName) &&
                Objects.equals(created, character.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, species, type, gender, originName, locationName, created);
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", species='" + species + '\'' +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", originName='" + originName + '\'' +
                ", locationName='" + locationName + '\'' +
                ", created='" + created + '\'' +
                '}';
    }
}
