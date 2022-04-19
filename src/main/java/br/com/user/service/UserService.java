package br.com.user.service;

import br.com.user.repository.UserRepository;
import br.com.user.utils.ServiceUtils;
import br.com.user.mapper.UserMapper;
import br.com.user.model.dto.UserDTO;
import br.com.user.model.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService implements ServiceUtils {

    private final UserMapper mapper;
    private final UserRepository repository;

    @Transactional
    public User save(UserDTO dto){
        User user = new User();
        if (this.repository.existsById(dto.getId())){
            user = mapper.toEntity(this.findById(dto.getId()));
            return user;
        }
        user = mapper.toEntity(dto);
        return this.repository.save(user);
    }

    public UserDTO findById(Long id){
        Optional<User> user = this.repository.findById(id);
        return mapper.toDto(user.get());
    }

    public Page<UserDTO> getAll(Pageable pageable){
        Page<User> page = repository.findAll(pageable);
        return new PageImpl<UserDTO>(convertUser(page.getContent()), pageable, page.getTotalElements());
    }

    private List<UserDTO> convertUser(List<User> userList){
        List<UserDTO> userDtoList = new ArrayList<>();
        userList.forEach(res -> {
            userDtoList.add(mapper.toDto(res));
        });
        return userDtoList;
    }
}
