package kosta.mvc.model.service;

import java.util.List;

import kosta.mvc.model.dto.DustDTO;

public interface DustService {

	List<DustDTO> searchAll( ) throws Exception;

	DustDTO search(String location) throws Exception;
}
