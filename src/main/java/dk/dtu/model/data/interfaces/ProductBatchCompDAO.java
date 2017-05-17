package dk.dtu.model.data.interfaces;

import dk.dtu.model.DTO.ProductBatchCompDTO;
import dk.dtu.model.DTO.ProductBatchCompOverviewDTO;
import dk.dtu.model.DTO.ProductBatchCompSupplierDetailsDTO;

import java.util.List;

public interface ProductBatchCompDAO {
	ProductBatchCompDTO getProductBatchComp(int pbId, int rbId) throws DALException;
	List<ProductBatchCompDTO> getProductBatchCompList() throws DALException;
	void createProductBatchComp(ProductBatchCompDTO productbatchcomponent) throws DALException;
	List<ProductBatchCompOverviewDTO> getProductBatchCompOverview() throws DALException;
	List<ProductBatchCompSupplierDetailsDTO> getSupplierDetailById(int pbId) throws DALException;
}
