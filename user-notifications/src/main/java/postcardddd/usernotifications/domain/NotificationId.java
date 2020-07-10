package postcardddd.usernotifications.domain;

import org.springframework.lang.NonNull;
import postcardddd.sharedkernel.domain.base.DomainObjectId;

public class NotificationId extends DomainObjectId {

    public NotificationId() {super("");}

    public NotificationId(@NonNull String id) {super(id);}
}
