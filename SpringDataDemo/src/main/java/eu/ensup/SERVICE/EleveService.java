package eu.ensup.SERVICE;

import eu.ensup.BO.EtudiantBO;
import eu.ensup.DAO.IEtudiantDAO;
import java.util.List;



public class EleveService {

	
	private IEtudiantDAO etudiantDAO;
	
	

	public EleveService() {
	}

    public IEtudiantDAO getEtudiantDAO() {
        return etudiantDAO;
    }

    

    public void setEtudiantDAO(IEtudiantDAO etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }

	



	public void creerEleve(EtudiantBO eleve) {
		etudiantDAO.save(eleve);
	}
	
	
	
        
        public void init()
        {
            System.out.println("Creation de l'objet service");
        }
        public void destroy()
        {
            System.out.println("Destruction de l'objet service");
        }
	
}
