package tn.esprit.twin.springclasse.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.twin.springclasse.dto.CommandeDto;
import tn.esprit.twin.springclasse.repository.CommandeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CommandeService implements ICommandeService {

	private final CommandeRepository commandeRepository;

	@Override
	public List<CommandeDto> listeCommandesParClientEtMenu(String identifiant, String libelleMenu) {
		return commandeRepository.findCommandesByClientIdentifiantAndMenuLibelle(identifiant, libelleMenu);
	}

}
