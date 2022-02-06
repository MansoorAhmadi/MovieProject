package movies.datamodel;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="SeenMovies")
public class SeenMovie {

    @Id
    @Column(name="ID")
    private String id;

    @Column(name="DATE")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "Users")
    private User user;

    @ManyToOne
    @JoinColumn(name = "Movie")
    private Movie movie;

    public SeenMovie(Movie movie, User user, Date date) {
        this.user = user;
        this.movie = movie;
        this.date = date;
    }

    public SeenMovie() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SeenMovie{" +
                "id=" + id +
                ", date=" + date +
                ", user=" + user +
                ", movie=" + movie +
                '}';
    }
}

