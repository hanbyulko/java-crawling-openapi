package kosta.mvc.model.service;

import java.util.List;

import kosta.mvc.model.dao.DustDAO;
import kosta.mvc.model.dao.DustDAOImpl;
import kosta.mvc.model.dto.DustDTO;
import kosta.mvc.model.util.WeatherParser;

public class DustServiceImpl implements DustService {
	private static DustDAO dao = new DustDAOImpl();

	@Override
	public List<DustDTO> searchAll() throws Exception{
	//	DustDTO dust = DustJSON.jsonParser(new String());
		List<DustDTO> list = null;
		return list;
	}

	@Override
	public DustDTO search(String location) throws Exception{
		dao.insert(WeatherParser.jsonParser(location));
		
		return ;
	}
}
