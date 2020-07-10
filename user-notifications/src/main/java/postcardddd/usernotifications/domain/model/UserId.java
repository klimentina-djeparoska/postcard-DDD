package postcardddd.usernotifications.domain.model;

import org.springframework.lang.NonNull;
import postcardddd.sharedkernel.domain.base.DomainObjectId;

public class UserId extends DomainObjectId {

    public UserId() {super("");}

    public UserId(@NonNull String id) {super(id);}
}
