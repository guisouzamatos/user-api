package br.com.user.mapper;

import br.com.user.model.dto.UserDTO;
import br.com.user.model.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-19T15:47:38-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.14 (Ubuntu)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setId( dto.getId() );
        user.setName( dto.getName() );
        user.setCpf( dto.getCpf() );
        user.setBirthDate( dto.getBirthDate() );
        user.setEmail( dto.getEmail() );
        user.setPhone( dto.getPhone() );
        user.setCep( dto.getCep() );
        user.setStreet( dto.getStreet() );
        user.setNumber( dto.getNumber() );
        user.setComplement( dto.getComplement() );
        user.setDistrict( dto.getDistrict() );
        user.setCity( dto.getCity() );
        user.setState( dto.getState() );

        return user;
    }

    @Override
    public UserDTO toDto(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( entity.getId() );
        userDTO.setName( entity.getName() );
        userDTO.setCpf( entity.getCpf() );
        userDTO.setBirthDate( entity.getBirthDate() );
        userDTO.setEmail( entity.getEmail() );
        userDTO.setPhone( entity.getPhone() );
        userDTO.setCep( entity.getCep() );
        userDTO.setStreet( entity.getStreet() );
        userDTO.setNumber( entity.getNumber() );
        userDTO.setComplement( entity.getComplement() );
        userDTO.setDistrict( entity.getDistrict() );
        userDTO.setCity( entity.getCity() );
        userDTO.setState( entity.getState() );

        return userDTO;
    }
}
