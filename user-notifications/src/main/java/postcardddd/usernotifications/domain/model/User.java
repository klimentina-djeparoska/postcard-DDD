package postcardddd.usernotifications.domain.model;

import lombok.Getter;
import postcardddd.sharedkernel.domain.base.AbstractEntity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
public class User extends AbstractEntity<UserId> {

    UserAddress address;
    String email;

    public User() {}

    public User(UserAddress address, String email) {
        this.address = address;
        this.email = email;
    }
}
