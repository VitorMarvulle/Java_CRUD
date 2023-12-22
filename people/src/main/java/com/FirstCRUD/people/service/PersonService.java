package com.FirstCRUD.people.service;

import com.FirstCRUD.people.dto.request.PersonRequestDTO;
import com.FirstCRUD.people.dto.response.PersonResponseDTO;

import java.util.List;

public interface PersonService {

    PersonResponseDTO findById(Long id);

    List<PersonResponseDTO> findAll();

    PersonResponseDTO register(PersonRequestDTO personDTO);

    PersonResponseDTO update (Long id, PersonRequestDTO personDTO);

    String delete(Long id);

}
