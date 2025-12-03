package tn.esprit.twin.springclasse.Service;

import tn.esprit.twin.springclasse.dto.CommandeDto;
import java.util.List;

public interface ICommandeService {
    List<CommandeDto> listeCommandesParClientEtMenu(String identifiant, String libelleMenu);
}
