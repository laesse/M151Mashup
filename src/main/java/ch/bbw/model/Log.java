package ch.bbw.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String usecase;

    @Temporal(TemporalType.TIMESTAMP)
    private Date time;

    public Log(int id, Date time, String usecase) {
        super();
        this.id = id;
        this.time = time;
        this.usecase = usecase;
    }

    public Log() {
        this(0, null, "");
    }

    public String getUsecase() {
        return usecase;
    }

    public void setUsecase(String usecase) {
        this.usecase = usecase;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
}
