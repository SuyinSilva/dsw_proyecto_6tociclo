package net.spring.concurso.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.spring.concurso.dao.SistemaEvaluacionDAO;
import net.spring.concurso.entity.SistemaEvaluacion;

@Service
public class SistemaEvaluacionServiceImpl implements SistemaEvaluacionService{
	
	@Autowired
	private SistemaEvaluacionDAO sitemaevaluacionDAO;


	@Override
	public List<SistemaEvaluacion> listAll() {
		// TODO Auto-generated method stub
		return sitemaevaluacionDAO.listAll();
	}


}
