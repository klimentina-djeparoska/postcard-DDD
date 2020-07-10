package postcardddd.usernotifications.domain;

import postcardddd.sharedkernel.domain.base.DomainObjectId;

public class UserId extends DomainObjectId {

    public UserId() {super("");}

    public UserId(String id) {super(id);}
}
