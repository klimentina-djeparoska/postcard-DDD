package postcardddd.usernotifications.domain;

import lombok.Getter;
import postcardddd.sharedkernel.domain.base.AbstractEntity;

import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

@MappedSuperclass
@Getter
public class Notification extends AbstractEntity<NotificationId> {

    private UserId id;
    private String message;
    private String status;
    private Timestamp timestamp;

    public Notification() {}

    public Notification(UserId id, String message, String status, Timestamp timestamp) {
        this.id = id;
        this.message = message;
        this.status = status;
        this.timestamp = timestamp;
    }
}
