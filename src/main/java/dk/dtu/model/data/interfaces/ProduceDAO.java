package dk.dtu.model.data.interfaces;

import dk.dtu.model.DTO.ProduceDTO;
import dk.dtu.model.DTO.ProduceOverviewDTO;

import java.util.List;

public interface ProduceDAO {
	ProduceDTO getProduce(int raavareId) throws DALException;
	List<ProduceDTO> getProduceList() throws DALException;
	void createProduce(ProduceDTO raavare) throws DALException;
	void updateProduce(ProduceDTO raavare) throws DALException;
	List<ProduceOverviewDTO> getProduceOverview() throws DALException;
}
