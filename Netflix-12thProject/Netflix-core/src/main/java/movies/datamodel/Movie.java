package movies.datamodel;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="MOVIE")
public class Movie {

    @Id
    @Column(name="ID")
    private String id;

    @Column(name="TITLE")
    private String title;

    @Column(name="DATE")
    private Date date;

    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
    private Set<SeenMovie> users;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", users=" + users +
                '}';
    }
}
