package com.mahir.rest_crud_myql.model;

import javax.persistence.*;


@Entity
@Table(name="tutorials")
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name ="title")
    private String title;

    @Column(name ="description")
    private String description;

    @Column(name ="published")
    private boolean published;

    public Tutorial() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean publish) {
        this.published = publish;
    }

    public Tutorial(String title, String description, boolean publish){
        this.title = title;
        this.description = description;
        this.published = publish;
    }

    @Override
    public String toString() {
        return "Tutorial{ " +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", publish=" + published +
                '}';
    }
}
