package learn.lynn.model;

import learn.lynn.domain.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserUserCommandMapper {
    UserCommand userToCommand(User user);
    User commandToUser(UserCommand command);
}
