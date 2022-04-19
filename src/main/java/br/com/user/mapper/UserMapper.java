package br.com.user.mapper;
import br.com.user.model.dto.UserDTO;
import br.com.user.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserDTO dto);

    UserDTO toDto(User entity);
}
