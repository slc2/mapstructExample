package learn.lynn.model;

import learn.lynn.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


public class UserMappingTest {
    public void testMapping() {
        User myUser = new User("Lynn", "Cohen", "foo@xy.com");

        UserUserCommandMapper mapper =
                Mappers.getMapper(UserUserCommandMapper.class);
        UserCommand myCommand = mapper.userToCommand(myUser);

        assert(myCommand.getEmail().equals(myUser.getEmail()));
    }
}
